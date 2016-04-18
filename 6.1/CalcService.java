public class CalcService {
    
    public static double sumRay (double ray[]) {
        double total=0;
        for(int i=0;i<ray.length;i++){
            total+=ray[i];
        }
        return total;
    }

    public static double avgRay(double ray[]){
        return sumRay(ray)/ray.length;
        
    }
    
    
//    public static double factorial(double[] ray){
//        
//        double total=0;
//        double grandTotal=0;
//        double[] fRay = new double [ray.length];
//        
//        
//System.out.println(" before teh start of teh Fray");
//	for(int i=0; i<ray.length && i<ray[i]  ;i++) {//loops the index of the array
//		total=1;
//                System.out.println(fRay[i]+" within the I loop fRay["+i+"] i=" + i);
//		System.out.println(ray[i]+" within the I loop ray'['"+i+"']' i=" + i);
//                for (int j =1;j<ray[i];j++)
//                {
//			total*=j;
//                        System.out.println(total+ " total and I="+i +" j="+  j);
//		}
//                
//            fRay[i]=total; 
//            System.out.println(fRay[i]+ "  after IJ loop fRay[i]= " +i);
//            System.out.println(ray[i]+ " after IJ loop ray[i]= " +i);
//        }
//        
//        System.out.println(" right before fcatorial return");
//        return 32;
//    }
    public static double[] factorial(double[] ray){
        
        double total=0;
        double grandTotal=0;
        double[] fRay=ray;

	for(int i=0;i<ray.length && i<ray[i];i++) {//loops the index of the array
		total=1;
		for (int j =1;(j-1)<ray[i];j++){
			total*=j;
			}
		fRay[i]=total;
        }
        
        System.out.println();
        return fRay;}
    

    public static double product(double[] ray){
        
        double total=1;
        System.out.print("the product of ");
        for(int i =0;i<ray.length;i++) {
        System.out.print(ray[i]+" ");
        total*=ray[i];
        }
        System.out.print("is ");
      
        return  total;
    }
    public static double[] fillRay(double[] ray){
        for (int i=0;i<ray.length;i++){
            ray[i] = CalcDriver.dblPrompt("value "+(i+1));
         }
    return ray;
    }

    public static void displayRay(double[] ray){
        for (int i=0; i<ray.length;i++){
            System.out.print(ray[i]+" ");
        }
    }


}





