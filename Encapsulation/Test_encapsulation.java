package Encapsulation;

public class Test_encapsulation 
{
private int id;
private String name,address;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Test_encapsulation [id=" + id + ", name=" + name + ", address=" + address + ", getId()=" + getId()+ "]";  
			
}



}
