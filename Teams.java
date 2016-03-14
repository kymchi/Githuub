import javax.swing.JOptionPane;


//Samuel Coker
//CSC 200
//003N
//18Feb2016
//SLC27919
//slc27919@email.vccs.edu

/**

Write the following 2 questions into one application.

2.1
If numPeople is greater than 10, execute groupSize =  numPeople/2.
If numPeople is between 3 and 10, execute groupSize = numPeople/3 and.
Otherwise, display message "The number of people has to be at least 3." 

2.2 If numPlayers is between 11 and 55, execute teamSize = numPlayers/11.
Otherwise, execute teamSize = 1.
 

Requirements
1.Prompt the user to enter number of people with JOptionPane
2.Prompt the user to enter number of players with JOptionPane
3.Display the number of people and group size
4.Display the number of player and team size
5.Use VI and terminal
6.Submit on Github

*/

public class Teams {

	public static void main(String[] args){

	int numPeople = prompt("people"); //prompting for people
	int numPlayers = prompt("players"); //promting for players
	

	int teamsize=0;
	int groupSize=0;
	
	if (numPeople >10) {
		groupSize = numPeople/2;
		}
	if (numPeople >=3 && numPeople<=10){
		groupSize = numPeople/3;
		}
	if (numPeople <3) {
		JOptionPane.showMessageDialog(null, "The number of people has to be at least 3");
		}	
		
	if (numPlayers >=11 && numPlayers <=55){
		 teamsize =numPlayers/11;
		}
	else 
		teamsize = 1;

	display("people","group",numPeople,groupSize);
	display("players","team",numPlayers,teamsize);
	

	}


	//quick and dirty way to prompt the user
	public static int prompt (String label){
		
	int number = Integer.parseInt(JOptionPane.showInputDialog(null,
	"Please enter the number of " + label  , 3));
	return number ;
	}
	
	//quick and dirty way to display stuff to the user
	public static void display (String sHuman ,String sGroup , int iHuman, int iGroup ){

	JOptionPane.showMessageDialog(null, "There are " + iHuman + " " + sHuman + " in " + sGroup + "s of " + iGroup );
	}	
	
	
	
	}

