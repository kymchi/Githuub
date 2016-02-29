//importing scanner utility
import java.util.Scanner;



/**

Samuel Coker
CSC 200
003N
27Feb2016
SLC27919
slc27919@email.vccs.edu

Write a java Application named Rectangle.java to prompt the user to input width and height of rectangle and the program will return a perimeter and area of the rectangle.

*/

public class Perimeter {
	
	public static void main(String[] args) {

	double height,length;
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Perimeter of a rectangle");
	System.out.println("What is the rectangles height?");
	height = keyboard.nextDouble();
	System.out.println("What is the rectangles length?");
	length = keyboard.nextDouble();
	System.out.println("The perimeter is " + ((2*length)+(2*height)) );
	}
}
	

