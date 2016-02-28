//importing Scanner
import java.util.Scanner;


/** 
start: 4:03pm Finish: 6:16pm

Samuel Coker
CSC 200
003N
18Feb2016
SLC27919
slc27919@email.vccs.edu
Develop Java Application to display statements of your choice using the following formats.

String using printf and %s format -done

Character using printf and %c format -done

Decimal Integer Number using printf and %d format -done

Exponential floating-point number using printf and %e format -done

Floating-point number using printf and %f format -done

Requirements

Use //sigle line comment in your program

Use /* */ // multiple line comment in your program

//Generate Javadoc */


public class Output{
	public static void main (String[]args){
	
	//new instance of scanner
	Scanner keyboard = new Scanner(System.in);
	//input from user
	String user;
	int option;

	//prompt user for choice and store choice
	System.out.println("CHOOSE YOUR DESTINY! \n Enter 1 for normal println \n Enter 2 for formatted printf")
	option=keyboard.nextInt();

	if(option==1){
		//true
		//prompting user and storing their input
		System.out.println("Please enter a word");
		user=keyboard.nextLine();

		//displaying the user's word manipulated with string format
		System.out.printf("\nYour word is %s \n%s with 30 spaces is \n%30s",user,user,user);
		//displaying the first character of the user's word
		System.out.printf("\nThe first character of %s is\n%c",user,user.charAt(0));
	//prompting and storing user input
	System.out.println("\nPlease enter an integer");
	user=keyboard.nextLine();
	//displaying the input and changing the string into an integer
	System.out.printf("\nYour number is %d \n%d with 30 spaces is \n%30d",
		Integer.parseInt(user),
		Integer.parseInt(user),
		Integer.parseInt(user)); 
	//prompting the user for a floating point number and storing it
	System.out.println("\nPlease enter a number with a decimal point");
	user=keyboard.nextLine();
	//displaying the number and its variations
	System.out.printf("\nYour number is %s \n\n%s with 2 decimal places is %1.2f"
			+ "\nWith 4 decimal places, %1.4f"
			+ "\nWith 6 decimal places, %1.6f",
		user,
		user,
		Float.parseFloat(user),
			Float.parseFloat(user),
			Float.parseFloat(user));
		//prompting the user for a very large number 
		System.out.println("\nPlease enter a very large number");
		user=keyboard.nextLine();
		//displaying the number in exponential form
		System.out.printf("\nYour number is %s \n\n%s in exponential form is %e",
			user,
			user,
			Float.parseFloat(user));
	
*********
	//prompting user and storing their input
	System.out.println("Please enter a word");
	user=keyboard.nextLine();

	//displaying the user's word manipulated with string format
	System.out.printf("\nYour word is %s \n%s with 30 spaces is \n%30s",user,user,user);
	//displaying the first character of the user's word
	System.out.printf("\nThe first character of %s is\n%c",user,user.charAt(0));
	//prompting and storing user input
	System.out.println("\nPlease enter an integer");
	user=keyboard.nextLine();
	//displaying the input and changing the string into an integer
	System.out.printf("\nYour number is %d \n%d with 30 spaces is \n%30d",
		Integer.parseInt(user),
		Integer.parseInt(user),
		Integer.parseInt(user)); 
	//prompting the user for a floating point number and storing it
	System.out.println("\nPlease enter a number with a decimal point");
	user=keyboard.nextLine();
	//displaying the number and its variations
	System.out.printf("\nYour number is %s \n\n%s with 2 decimal places is %1.2f"
			+ "\nWith 4 decimal places, %1.4f"
			+ "\nWith 6 decimal places, %1.6f",
		user,
		user,
		Float.parseFloat(user),
		Float.parseFloat(user),
		Float.parseFloat(user));
	//prompting the user for a very large number 
	System.out.println("\nPlease enter a very large number");
	user=keyboard.nextLine();
	//displaying the number in exponential form
	System.out.printf("\nYour number is %s \n\n%s in exponential form is %e",
		user,
		user,
		Float.parseFloat(user));

	}
}


