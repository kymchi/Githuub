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
Samuel Coker<br>
CSC 200<br>
003N<br>
27Feb2016<br>
SLC27919<br>
slc27919@email.vccs.edu
<p>

Write a Java Program to Authenticate a user login for Username and Password.<br>

If username and password is correct then display "Welcome Username!" message.<br>

Else display "Wrong Username or Password!" message.

<p>
Requirements:<br>

1. Write comments for Java doc<br>
2. Write Flowchart<br>
3. Write Pseudocode<br>
4. Use VI to write and complie on Terminal<br>
5. Use gitbash to submit your work on github.com<br>
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

