package mytest;

import org.joda.time.DateTime;

public class JodaTime {
    
    int year;
    
    public String getCurrentTime() {
        DateTime dateTime = new DateTime();
        return String.valueOf(dateTime);
      }
    
    public int getYear(){
        DateTime dateTime = new DateTime();
        year = dateTime.getYear();
        return year;
    }
    
    public String getStringYear(){
        DateTime dateTime = new DateTime();
        return String.valueOf(dateTime.getYear());
    }
    
    public String getYearAndMonth(String string){
        DateTime dateTime = new DateTime();
        return String.valueOf(dateTime.getYear()) + String.valueOf(dateTime.getDayOfMonth() + string);
    }
}