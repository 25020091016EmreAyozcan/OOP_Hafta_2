package bolum9_03;

import java.util.Date;


public class TestDate {
    

    public static void main(String[] args) {
        Date date = new Date();
        
        date.setTime(10000);
        System.out.println(date.toString());
        
        date.setTime(100000);
        System.out.println(date.toString());
        
        date.setTime(1000000);
        System.out.println(date.toString());
        
        date.setTime(10000000);
        System.out.println(date.toString());
        
        date.setTime(100000000);
        System.out.println(date.toString());
        
        date.setTime(1000000000);
        System.out.println(date.toString());
        //büyük int veriler için long anlamına gelen L harfi koydum
        date.setTime(10000000000L);
        System.out.println(date.toString());
        
        date.setTime(100000000000L);
        System.out.println(date.toString());
        
    }
}
