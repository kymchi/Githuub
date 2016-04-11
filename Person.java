import java.util.Scanner;
public class Person
{


private String name;
private int age;

public Person(){
name= "nobody smith";
age = 25;
}

public Person(String name, int age){
this.name=name;
this.age=age;}



public void setName(String name){
this.name = name;}



public void setAge(int age){
if (age >= 0)
this.age = age;

else{
System.out.println("ERROR: Age is " +
"negative.");
System.exit(0);}
}


public void setPerson(String newName, int newAge){
setName(newName);
setAge(newAge);}

public String getName(){
return name;}

public int getAge(){
return age;}

public static void equalName(Person first,Person second){
if (first.name.equals(second.name)){
System.out.println("Yes " + first.name +" age:"+ first.age +" and "+second.name+" age:"+ second.age+" have the same names");}
else 
System.out.println("No  "  + first.name + " and " + second.name +" do not have the same name");
}

public static void equalAge(Person first, Person second){
if (first.age==second.age){
System.out.println("Yes " + first.name +" age:"+ first.age +" and "+second.name+" age:"+ second.age+" have the same age");}
else
System.out.println("No  "  + first.name+ " age:"+ first.age  + " and " + second.name +" age:"+ second.age  +" do not have the same age");
}

public static void equalPerson(Person first, Person second){
if ((first.age==second.age)&&(first.name==second.name)){
System.out.println("Yes " + first.name +" age:"+ first.age +" and "+second.name+" age:"+ second.age+" are the same person");}
else
System.out.println("No  "  + first.name+ " age:"+ first.age  + " and " + second.name +" age:"+ second.age  +" are not the same person");
}

public static void compareAge(Person first, Person second){
if (first.age>second.age){
System.out.println("Yes " + first.name +" age:"+ first.age +" is older than "+second.name+" age:"+ second.age);}
if (first.age<second.age){
System.out.println("No  " + first.name +" age:"+ first.age +" is not older than "+second.name+" age:"+ second.age);}
if (first.age==second.age){
System.out.println( "well... " + first.name +" age:"+ first.age +" and "+second.name+" age:"+ second.age+" have the same age...so maybe if you count the hours and minutes?");}
}
 




}

/**
1. Whether two person objects are equal (have the same name and age).

2. Whether two person objects have the same name.

3. Whether two person objects are the same age.

4. Whether one person object is older than another.

5. Whether one person object is younger than another.
*/


