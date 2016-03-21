///Samuel Coker
//CSC 200
//003N
//21MAR2016
//SLC27919
//slc27919@email.vccs.edu
/**
Class Exercise

Develop an application to prompt the user with JOptionPane showInputDialog box as a selection options to prompt the user to select a month from a list of the months in one year. The program will response to the user with the following message according to the month that the user have selected.

December – February: Do you want to build a snow man?

March – May: Happy Spring days!

June – August: It’s a summer time.

September – November: Welcome to the foliage season!
*/
import javax.swing.JOptionPane;

public class Month {


public enum MonthNumber{JAN, FEB, MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}

	public static void main (String[]args) {

	MonthNumber input; //declaring new variable of type MonthNumber

	MonthNumber[] choicesA = {
	MonthNumber.JAN,
	MonthNumber.FEB,
	MonthNumber.MAR,
	MonthNumber.APR,
	MonthNumber.MAY,
	MonthNumber.JUN,
	MonthNumber.JUL,
	MonthNumber.AUG,
	MonthNumber.SEP,
	MonthNumber.OCT,
	MonthNumber.NOV,
	MonthNumber.DEC}; //new array of MonthNumber values
		

	input = (MonthNumber) JOptionPane.showInputDialog(null,"What month is it?","Month",JOptionPane.INFORMATION_MESSAGE,null, choicesA, choicesA[2]);

//	input =  JOptionPane.showInputDialog(MonthNumber,"What month is it?","Month",JOptionPane.INFORMATION_MESSAGE,null, choicesA, choicesA[2]);
	

	switch (input){
	case DEC : case JAN: case FEB:
	JOptionPane.showMessageDialog(null,"Do you want to build a snow man?");
	break;
	
	case MAR: case APR: case MAY:
	JOptionPane.showMessageDialog(null,"Happy Spring days!");
	break;

	case JUN: case JUL: case AUG:
	JOptionPane.showMessageDialog(null,"It's Summer time.");
	break;

	case SEP: OCT: NOV:
	JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
	break;

	}//end of switchcase
	
//	System.out.println(input);

	/*
AccountType[] choices = { AccountType.Administrator, AccountType.Student, AccountType.Staff, AccountType.Guest }; 

             AccountType input = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "Account Type", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]); 

*/




}//end of main
}//end of class
