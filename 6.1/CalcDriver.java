
import javax.swing.JOptionPane;
public class CalcDriver {
 
public static void main(String[]arg){

int size = intPrompt("size of array");
double[] numRay= new double[size];


numRay=CalcService.fillRay(numRay);
CalcService.displayRay(numRay); 

System.out.println();
System.out.println("the sum is " +CalcService.sumRay(numRay));
System.out.println("the avg is " +CalcService.avgRay(numRay));
System.out.print(CalcService.product(numRay));


//double fixit =0;
//fixit= CalcService.factorial(numRay);
//System.out.println(fixit+ "return result of factorial");
double[] gRay=new double[size];
System.arraycopy(numRay,0,gRay,0,numRay.length);
CalcService.factorial(gRay);


System.out.println("numRay is");
        CalcService.displayRay(numRay);
System.out.println("\ngRay aka Factorial array is");
CalcService.displayRay(gRay);

}


public static int intPrompt(String word){
    int j= Integer.parseInt(JOptionPane.showInputDialog(null,word));
    return j;
}

public static double dblPrompt(String word){
    double j= Double.parseDouble(JOptionPane.showInputDialog(null,word));
    return j;
}


}
