public class Car {

    
private String name;
private String color;
private int hp;
private double engine;
private String make;
private static int count=0;//car counter

public Car(){
this("Zero Name","Zero Color",0,0,"Zero Make");

}

public Car(String name,String color, int hp, double engine, String make){
    this.name=name;
    this.color=color;
    this.hp=hp;
    this.engine=engine;
    this.make=make;
    count++;
}

//OVERRIDE
public String toString(){//overrides the normal toString command to be more useful
  return "Nick name " +name +" color: "+ color+ " Horse power: "+hp +" Engine size: "+ engine+" make: "+make +" count " + count;  
  }
//OVERRIDE
public boolean equals(Car otherCar){
return (this.color.equals(otherCar.color)) &&
(this.hp==otherCar.hp) &&
(this.engine==otherCar.engine)&&
(this.make.equals(otherCar.make));
}
/*public boolean equals(Car otherCar){
return(this.name.equals(otherCar.name)); 
}*/

public String getName(){//getters
    return name;}
public String getColor(){
    return color;}
public int getHp(){
    return hp;}
public double getEngine(){
    return engine;}
public String getMake(){
    return make;}

public void setName(String name){//setters
    this.name=name;}
public void setColor(String color){
    this.color=color;}
public void setHp(int hp){
    this.hp=hp;}
public void setEngine(double engine){
    this.engine=engine;}
public void setMake(String make){
    this.make=make;}

public static int getCount(){
	return count;}

}
