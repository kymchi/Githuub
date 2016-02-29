/*
Samuel Coker
CSC 200
003N
27Feb2016
SLC27919
slc27919@email.vccs.edu
*/

//importing scanner
import java.util.Scanner;


/** 
Write a Java Program to Authenticate a user login for Username and Password.

If username and password is correct then display "Welcome Username!" message.

Else display "Wrong Username or Password!" message.

Requirements:

1. Write comments for Java doc

2. Write Flowchart

3. Write Pseudocode

4. Use VI to write and complie on Terminal

5. Use gitbash to submit your work on github.com

6. Generate Java Doc */

public class User{
	
	public static void main (String[] args){

	Scanner keyboard=new Scanner(System.in);
	
	String user,password;//temporary variables
	
	System.out.println("Enter your user name");
	user = keyboard.nextLine();
	System.out.println("Enter your password");
	password = keyboard.nextLine();

	if  	((user.equalsIgnoreCase("kymchi")) &&
		(password.equals("Lii")))
	{
		System.out.println("Welcome " +user);
	}

	else { 
		System.out.println("Wrong Username or Password!");
	}
	

	}

}

