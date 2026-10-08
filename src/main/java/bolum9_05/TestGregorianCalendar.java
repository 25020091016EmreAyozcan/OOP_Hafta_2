package bolum9_05;

import java.util.GregorianCalendar ;

public class TestGregorianCalendar {

    
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        
        System.out.println("YIL/AY/GUN: " + calendar.get(GregorianCalendar.YEAR) + "/" + (calendar.get(GregorianCalendar.MONTH) + 1) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        
        calendar.setTimeInMillis(1234567898765L);
        
        System.out.println("YIL/AY/GUN: " + calendar.get(GregorianCalendar.YEAR) + "/" + (calendar.get(GregorianCalendar.MONTH) + 1) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
 
    }
    
}
