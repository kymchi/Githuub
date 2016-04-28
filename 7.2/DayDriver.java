

/**
 *
 * @author kymch
 */
public class DayDriver {
    
    /**
     *
     * @param args
     */
    public static void main(String[]args){
        Day day = new Day("Wednesday");
        System.out.println(day);
        System.out.println("the next day is " +day.nextDay());
        System.out.println("the previous day is " +day.previousDay());
        System.out.println("the day 10 days from now is " +day.calculateDay(10));
        System.out.println("the day -10 days from now is " +day.calculateNegDay(10));
    }
}
