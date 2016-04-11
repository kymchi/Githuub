public class Car {

    
private String name;
private String color;
private int hp;
private double engine;
private String make;

public Car(){
//    this.name="Zero Name";
//    this.color="Zero Color";
//    this.hP=0;
//    this.engine=0;
//    this.make="Zero Make";
}

public Car(String name,String color, int hp, double engine, String make){
    this.name=name;
    this.color=color;
    this.hp=hp;
    this.engine=engine;
    this.make=make;
}
public String toString(){//overrides the normal toString command to be more useful
  return "Nick name " +name +" color: "+ color+ " Horse power: "+hp +" Engine size: "+ engine+" make: "+make;  
  }
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

}
