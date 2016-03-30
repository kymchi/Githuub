/*
Class Exercises

1. Write a program to output first 100 odd numbers using for loop.

2. Write a program to output first 100 even numbers using do while loop.

3. Write a program to draw a following diamond shape using while loop. 

  *     

 ***     

*****       

 *** 

  *

  */


  /*


   *
  ***
 *****
*******
 *****
  ***
   *

     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
*/

  public class draw{

  public static void main(String[]args){

 // int i;
//int j;
  for (int i = 0, j = 0; j<100; i++){
	if (i%2==1){
	System.out.printf("%3d. %3d \n",j+1,i);
	j++;
	}
  }	

  System.out.println();

  for (int i=1,j=0; j<100; i++){
  	if (i%2==0){
	System.out.printf("%7d. %7d \n",j+1,i);
	j++;
	}
  }

//max star width ==11
// (11+1)/2 == where the first star starts
// where first star starts -1 == number of spaces needed to begin

int starMax=31;//changeable value
int spaces =(((starMax +1)/2)-1); //5 spaces when stars are 11
int i =1 , j=0,k= spaces,q=starMax;


System.out.println();
  while(i<((starMax/2)+2)){ //total times runninging
	
	j=0;
	while(j<spaces){//do this many spaces
  	System.out.print(" ");
	j++;
	}
		
	j=0;
	while(j<((i*2)-1)){//times ran times 2 -1 gies you the right number of stars
	System.out.print("*");
	j++;
	}
	
	System.out.println(); //starts the next line
	spaces--; //reduces the number of spaces for next time
	i++; //counter for total runtime
	}
	
spaces=k;


i=1;
  while(i<(spaces+1)){ //run this many times
  	
	starMax-=2;
	j=0;
	while(j<i){ //number of spaces
  	System.out.print(" ");
	j++;
	}

	j=0;
	while(j<(starMax)){
	System.out.print("*");
	j++;
	}
	
	System.out.println();
	i++;//counter for total run times


 }
/*

i=1;
starMax=31;
spaces=25;

System.out.println(k);
  while (i<(spaces+2)){
  	
	
	j=0;
	while(j<spaces){
	System.out.print("Q");//print out this may spaces
	j++;
	}


	j=0;
	while (j<((2*i)-1)){
	System.out.print("@");
	j++;
	}

	spaces--;
	//i++;
	System.out.println();
	}




*/
}

}
