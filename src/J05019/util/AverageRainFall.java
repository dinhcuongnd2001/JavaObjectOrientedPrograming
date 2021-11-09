package J05019.util;

import java.time.*;
public class AverageRainFall {
    private String area;
    private int totalRain ;
    private double averageRain, totalTime;

    public AverageRainFall(String area, String startRain, String finishRain, int totalRain) {
        this.area = area;
        String [] timeS = startRain.split(":"), timeF = finishRain.split(":");
        int totalMin = 0 , totalHour = 0, check = 0;
        if((Integer.parseInt(timeF[1]) - Integer.parseInt(timeS[1])) > 0){
            totalMin = (Integer.parseInt(timeF[1]) - Integer.parseInt(timeS[1]));
        } 
        else {
            totalMin = (Integer.parseInt(timeF[1]) - Integer.parseInt(timeS[1])) + 60 ;
            check = 1 ;
        }
        
        totalHour = Integer.parseInt(timeF[0]) - Integer.parseInt(timeS[0]) - check;
        totalTime = totalHour + totalMin/60;
      
        this.totalRain = totalRain;  
        averageRain = Math.round(this.totalRain/this.totalTime * 100.0)/100.0;
    }

    @Override
    public String toString() {
        return  area + " " + totalRain + " " + averageRain + " " + totalTime ;
    }
    
}
