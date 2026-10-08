package bolum9_04;

import java.util.Random;


public class TestRandom {
    public static void main(String[] args) {
        
        Random random= new Random(1000);
        
        for(int i=0; i<50; i++){
            System.out.println((i+1)+". Sayi degeri: "+random.nextInt(100));
        }   
    }
}
