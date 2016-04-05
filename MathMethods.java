import javax.swing.JOptionPane;
public class MathMethods{
public static void main(String[]arg){
double Xvalue,Yvalue,Zvalue;

Xvalue = prompt("X");
System.out.println(Power(Xvalue,10));
JOptionPane.showMessageDialog(null,Xvalue+"^10 is " + Power(Xvalue,10));

Yvalue = prompt("Y");
System.out.println(AddXY(Xvalue,Yvalue));
JOptionPane.showMessageDialog(null,Xvalue+" + "+Yvalue +" is " +AddXY(Xvalue,Yvalue) );

Zvalue = prompt("Z");
System.out.println(Root(Zvalue));
JOptionPane.showMessageDialog(null,"The square root of " +Zvalue+" is " + Root(Zvalue));

JOptionPane.showMessageDialog(null,"squrt(x) + absolute(y) + z^y is\n " + Gfunction(Xvalue,Yvalue,Zvalue));
}
public static double prompt(String value){//Dirty-Quick prompt
double number;
number=Double.parseDouble(JOptionPane.showInputDialog(null, " please enter the " + value+ "  value"));
return number;
}

public static double Power(double variable, double power){ //h(x)
double result=1;
for(int i=0; i<power ;i++){
result=result*variable;}
return result;
}


public static double AddXY(double X, double Y){ //f(x,y)
    return X+Y;
}

public static double Root(double Zvalue){
    //babylonian method of square root
    double guess=Zvalue/2; //first guess
    double result;
    int i=0;
    do {
        result=Zvalue/guess;//result of first guess 
        guess=(guess+result)/2;//average of previous guess and result becomes the new guess 
        i++;//counter to prevent the system from trying more thatn 10 times
        }        
    while ((guess*guess != Zvalue) && (i<10));
    return guess;
}

public static double Absolute(double Yvalue){
    if (Yvalue<=0){
        Yvalue*=-1;
    }    
    return Yvalue;
}
public static double Gfunction(double Xvalue, double Yvalue, double Zvalue){//g(x,y,z)
    double value;
    value = Root(Xvalue) + Absolute(Yvalue) + Power(Zvalue,Yvalue); 
    return value;
}


}