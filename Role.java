import java.util.Scanner;
/**Switch Case Class Exercise
Write an application to prompt the user to enter his/her role from the following choices.

1. Administrator
2. Faculty
3. Staff
4. Student
5. Guest

After the user entered his/her role, the program will display:
Welcome <USER ROLE>! (The word USER ROLE will be replaced with the user input.)

Requirements

•Using Switch case
•Submit on Github.com
•Use Gitbash
•Use vi */

public class Role {
	public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);
String userRole;

System.out.println("Please enter your user role");
System.out.println("Administrator\nFaculty\nStaff\nStudent\nGuest\n");

userRole=keyboard.nextLine();
switch (userRole.toUpperCase()){

	case "ADMINISTRATOR":case "FACULTY":
	case "STAFF":case "STUDENT":case "GUEST":
	System.out.println("Welcome " + userRole +"!");
	break;

default:
	System.out.println("User Role not recognized, please try again");
}//end of switch



}//end of main
}//end of Role
