

/**
 * SAMUEL COKER
 * csc200 
 * 27apr2016
 * @author kymchi
 */
public class Day {
    private String day;
    private String[] days ={"Monday", "Tuesday","Wednesday","Thursday","FRIDAY!","Saturday","Sunday"};
   

/**
 * 
 * @param day of the week object
 */    
    public Day(String day){
        super();//i dont know what this means but it is in your video sample code
        this.day = day;
    }
/**
 * 
 * @return getter for current day object
 */
    public String getDay(){
        return day;
    }
/**
 * 
 * @param day setter for day object
 */
    public void setDay(String day){
        this.day = day;
    }
    /**
     * 
     * @return the next day of the week
     * 
     */
    public String nextDay(){
        int dayIndex= getDayIndex(this.day);
        if(dayIndex!=-1){
            return days[(dayIndex+1)%7];
        }else{
            return "Invalid Day!";
        }
       
    }
    /**
     * 
     * @return the day of the week 6 days from now which is the same as 1 day ago
     */
     public String previousDay(){
        int dayIndex= getDayIndex(this.day);
        if(dayIndex!=-1){
            return days[(dayIndex+6)%7];
        }else{
            return "Invalid Day!";
        }
       
    }
    /**
     * 
     * @param numberOfDays the number of days forward you want to go 
     * @return the day of the week after calculation
     */
     public String calculateDay(int numberOfDays){
        int dayIndex= getDayIndex(this.day);
        if(dayIndex!=-1){
            return days[(dayIndex+numberOfDays)%7];
        }else{
            return "Invalid Day!";
        }
       
    }
     /**
      * This woks by calling the previouDay method X number of times
      * @param numberOfDays the X number of days backwards you want to go
      * @return the day of the week after calculation
      */
      public String calculateNegDay(int numberOfDays){
        int dayIndex= getDayIndex(this.day);
        int temp;
        for(int i=0;i<numberOfDays;i++){
           dayIndex=(dayIndex+6)%7;
            
        }
       return days[(dayIndex)];
    }
    
     /**
      * 
      * @param day
      * @return the index of the day you are testing
      */
    private int getDayIndex(String day){
        for(int i=0;i<days.length;i++){
            if (days[i]==this.day){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * 
     * @return Custom display of relevent day object information
     */
    @Override
    public String toString(){
        return "Day [day=" + day + "]";
    }

}


