package Basic_program;

import java.util.Random;
import java.util.Scanner;

public class Guess_number 
{
	public static void main(String[] args) 
	{
		Random random=new Random();
		int lowest_number=1;
		int highest_nember=10;
		int number_of_guesses=0;
		int guess_num=0;
		int Secret_num=random.nextInt(highest_nember)+lowest_number;
		System.out.println("Welcome to game of guessing number between "+lowest_number+" and "+highest_nember);
		System.out.println("Try to guess it");
		
		do
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter number:");
			guess_num = scn.nextInt();
			number_of_guesses++;
			if(guess_num<Secret_num)
			{
				System.out.println("Your guess is too low. Try again!");
			}
			else if(guess_num>Secret_num)
			{
				System.out.println("Your guess is too high. Try again!");
			}
			else
			{
				System.out.println("Congratulation! you've guessed the secret number");
				System.out.println("Number of attempt="+number_of_guesses);
			}
		}while(Secret_num!=guess_num);
	}
}
