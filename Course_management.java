package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Course_management {

    Connection c;
    Jdbc_Conn conn = new Jdbc_Conn();
    Scanner sc = new Scanner(System.in);

    public Course_management() {
        c = conn.gcConnection();
        if (c == null) {
            System.out.println("Database connection failed. Exiting...");
            System.exit(1);
        }
    }

    public void addCourse() {
        try {
            System.out.print("Enter course name: ");
            String name = sc.nextLine();

            System.out.print("Enter fees: ");
            double fees = Double.parseDouble(sc.nextLine());

            System.out.print("Enter duration: ");
            String duration = sc.nextLine();

            System.out.print("Enter detail: ");
            String detail = sc.nextLine();

            String sql = "INSERT INTO course (name, fees, duration, detail) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, fees);
            ps.setString(3, duration);
            ps.setString(4, detail);

            int rows = ps.executeUpdate();
            System.out.println(rows + " course(s) added successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void viewCourses() {
        try {
            String sql = "SELECT * FROM course";
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Courses List:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Fees: " + rs.getDouble("fees"));
                System.out.println("Duration: " + rs.getString("duration"));
                System.out.println("Detail: " + rs.getString("detail"));
                System.out.println("----------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void searchCourse() {
        try {
            System.out.print("Enter course ID to search: ");
            int id = Integer.parseInt(sc.nextLine());

            String sql = "SELECT * FROM course WHERE id = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Fees: " + rs.getDouble("fees"));
                System.out.println("Duration: " + rs.getString("duration"));
                System.out.println("Detail: " + rs.getString("detail"));
            } else {
                System.out.println("Course with ID " + id + " not found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void editCourse() {
        try {
            System.out.print("Enter course ID to update: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter new course name: ");
            String name = sc.nextLine();

            System.out.print("Enter new fees: ");
            double fees = Double.parseDouble(sc.nextLine());

            System.out.print("Enter new duration: ");
            String duration = sc.nextLine();

            System.out.print("Enter new detail: ");
            String detail = sc.nextLine();

            String sql = "UPDATE course SET name = ?, fees = ?, duration = ?, detail = ? WHERE id = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, fees);
            ps.setString(3, duration);
            ps.setString(4, detail);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Course updated successfully.");
            } else {
                System.out.println("Course not found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void deleteCourse() {
        try {
            System.out.print("Enter course ID to delete: ");
            int id = Integer.parseInt(sc.nextLine());

            String sql = "DELETE FROM course WHERE id = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Course deleted successfully.");
            } else {
                System.out.println("Course not found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n===== Course Management Menu =====");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Search Course");
            System.out.println("4. Edit Course");
            System.out.println("5. Delete Course");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    addCourse();
                    break;
                case "2":
                    viewCourses();
                    break;
                case "3":
                    searchCourse();
                    break;
                case "4":
                    editCourse();
                    break;
                case "5":
                    deleteCourse();
                    break;
                case "6":
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        Course_management cm = new Course_management();
        cm.menu();
    }
}
