public class CarDriver {
    public static void main(String[]arg){
        
        Car s40=new Car("Sam","silver",150,2.0,"volvo");
        Car empty=new Car();
        Car truck=new Car("Little truck","red",159,2.7,"toyota");
        
        
        System.out.println(s40.getName());
        System.out.println(s40.getColor());
        System.out.println(s40.getHp());
        System.out.println(s40.getEngine());
        System.out.println(s40.getMake());
        
        empty.setName("Soul");
        empty.setColor("blue");
        empty.setHp(650);
        empty.setEngine(6.5);
        empty.setMake("Ferrari");
        
        
        System.out.println(empty);
        System.out.println(truck);
	System.out.println(s40);
        
    }
}
