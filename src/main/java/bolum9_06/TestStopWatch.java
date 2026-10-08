package bolum9_06;


public class TestStopWatch {
    public static void main(String[] args) {
        int[] exemplespace;
        exemplespace= new int[100000];
        
        
        //rastgele sayılar atadık 100.000'e kadar
        for(int i=0; i<exemplespace.length;i++){
            exemplespace[i]= (int)(Math.random() * 100000) + 1;
            
        }
        
        StopWatch kronometre= new StopWatch();
        
        for (int i = 0; i < exemplespace.length - 1; i++) {
            int minIndex = i;
    
            for (int j = i + 1; j < exemplespace.length; j++) {
                if (exemplespace[j] < exemplespace[minIndex]) {
                    minIndex = j;
                }
            }
    
            int temp = exemplespace[i];
            exemplespace[i] = exemplespace[minIndex];
            exemplespace[minIndex] = temp;
        }
        
        kronometre.stop();  
        
        System.out.println("100.000 sayinin siralanmasi " + kronometre.getElapsedTime() + " milisaniye surdu.");
        
    }
    
}
