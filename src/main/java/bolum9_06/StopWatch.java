package bolum9_06;


public class StopWatch {
    private long startTime;
    private long endTime;
    
    public StopWatch(){
        startTime=System.currentTimeMillis();
    }
    
    public void start(){
        startTime=System.currentTimeMillis();
    }
    
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    
    public long getElapsedTime(){
        return endTime-startTime;
    }
    
    public long getstartTime(){
        return startTime;
    }
    
    public long getendTime(){
        return endTime;
    }
    
}
