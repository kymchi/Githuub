import javax.swing.JOptionPane;
public class CarDriverJOption{
public static void main(String[]args){

/*Car first=new Car();
System.out.println(first);
Car second =new Car();
System.out.println(second);
Car third=new Car();
System.out.println(third);
*/




Car first = new Car();
createCar (first,"FIRST");
JOptionPane.showMessageDialog(null,first);

Car second =new Car();
createCar (second, "SECOND");
JOptionPane.showMessageDialog(null,second);

Car third =new Car();
createCar (third, "THIRD");
JOptionPane.showMessageDialog(null,third);

Car equal =new Car();
createCar (equal,"SEARCH");
JOptionPane.showMessageDialog(null,equal);

equalCar(first,second,third,equal);

System.out.println(" " +third.equals(equal));

}

public static Car createCar(Car newness, String carNumber){
newness.setName(promptString("Name",carNumber));
newness.setColor(promptString("Color",carNumber));
newness.setHp(promptInt("Hp",carNumber));
newness.setEngine(promptDouble("Engine",carNumber));
newness.setMake(promptString("Make",carNumber));
return newness;
}

public static  String promptString(String category, String carNumber){
return JOptionPane.showInputDialog(null,"What is the " + category+ " of the " + carNumber+ " car?");
}

public static int promptInt(String category,String carNumber){
return Integer.parseInt(JOptionPane.showInputDialog(null,"What is the " + category+ " of the " + carNumber+ " car?"));
}

public static double promptDouble(String category,String carNumber){
return Double.parseDouble(JOptionPane.showInputDialog(null,"What is the " + category+ " of the " + carNumber+ " car?"));
}



/* HOW DO I MAKE NEW OBJECTS WITH A METHOD?
public static Car MAKECAR(String newness){


return
}*/

public static void equalCar(Car car1, Car car2, Car car3, Car equalcar){
if (car1.equals(equalcar)){
JOptionPane.showMessageDialog(null,"YES! \n" +car1+ "\n is the same as\n " +equalcar);}

if (car2.equals(equalcar)){
JOptionPane.showMessageDialog(null,"YES! \n" +car2+ "\n is the same as\n " +equalcar);}

if (car3.equals(equalcar)){
JOptionPane.showMessageDialog(null,"YES! \n" +car3+ "\n is the same as\n " +equalcar);}
//getName().equals(equalcar.getName())






}

}

