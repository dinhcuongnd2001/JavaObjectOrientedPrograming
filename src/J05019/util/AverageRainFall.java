package J05019.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class AverageRainFall {
    private String id, area;
    private long totalRain, totalTime ;
    private double averageRain ;
    private Date startRain, finishRain;
    private static SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    static LinkedHashMap<String, Long> stTime = new LinkedHashMap<>();
    static HashMap<String, Long> stRain = new HashMap<>();
    public AverageRainFall(String area, String startRain, String finishRain, int totalRain) throws ParseException {
        this.area = area;
        this.startRain = format.parse(startRain);
        this.finishRain = format.parse(finishRain);
        this.totalRain = totalRain;
        this.totalTime = (this.finishRain.getTime() - this.startRain.getTime())/(1000*60);
        stTime.put(this.area,stTime.getOrDefault(this.area,0l) +this.totalTime);
        stRain.put(this.area, stRain.getOrDefault(this.area, 0l) + this.totalRain);
    }

    public void setId() {
        int count = 1;
        if(stTime.size()==0) this.id = "T01";
        else{
            for(HashMap.Entry<String, Long> index : stTime.entrySet()){
            if(!index.getKey().equals(this.area)) count ++;
            }
            this.id = "T" + String.format("%02d", count);
        }
    }

    public void setAverageRain() {
        this.averageRain = (stRain.get(this.area) / stTime.get(this.area))*60 ;
    }
    
    
    @Override
    public String toString() {
        return id + " " + area+ " " + String.format("%.2f",averageRain) ;
    }
    
}
