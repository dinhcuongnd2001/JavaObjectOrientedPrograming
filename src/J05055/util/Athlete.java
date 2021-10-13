
package J05055.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
public class Athlete {
    private String id, name, dOB, timeStart, timeFinish,totalTime , timeBonus, realTime;
    private int bonus , rank;
    private static HashMap<String, Integer> listAthlete = new HashMap<>();

    public Athlete(int i, String name, String dOB, String timeStart, String timeFinish) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.id = "VDV" + String.format("%02d", i);
        this.name = name;
        this.dOB = dOB;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        int age = 2021 - Integer.parseInt(this.dOB.substring(6,10));
        if(age >= 32) this.bonus = 3;
        else if(age >= 25) this.bonus = 2;
        else if(age >= 18) this.bonus = 1;
        else this.bonus = 0;        
        int h1 = Integer.parseInt(this.timeStart.substring(0,2)) , m1 = Integer.parseInt(this.timeStart.substring(3,5)), s1 = Integer.parseInt(this.timeStart.substring(6,8));
        int h2 = Integer.parseInt(this.timeFinish.substring(0,2)) , m2 = Integer.parseInt(this.timeFinish.substring(3,5)), s2 = Integer.parseInt(this.timeFinish.substring(6,8));
        int c = 0 ;
        int s3 = s2 - s1 ;
        if(s3 < 0){
            c = 1 ;
            s3 += 60;
        } 
        int m3 = m2 - m1 -c;
        if(m3 < 0){
            m3 += 60;
            c = 1;
        } 
        else c = 0;
        int h3 = h2 - h1 - c ;
        this.totalTime = String.format("%02d", h3) + ":" + String.format("%02d", m3) + ":" + String.format("%02d", s3);
        c = 0 ;
        int s4 = s3 - bonus;
        if(s4 <0){
            s4 += 60;
            c = 1;
        }
        int m4 = m3 - c;
        if(m4 < 0){
            m4 += 60 ;
            c = 1;
        }
        else c = 0 ;
        int h4 = h3 - c;
        this.rank = 1 ;
        this.realTime =  String.format("%02d", h4) + ":" + String.format("%02d", m4) + ":" + String.format("%02d", s4);
        this.timeBonus = "00:00:"+ String.format("%02d",bonus);
        listAthlete.put(this.realTime, listAthlete.getOrDefault(this.realTime, 0) + 1);
    }
    public void setRank(){
        for(HashMap.Entry x : listAthlete.entrySet()){
            if(this.realTime.compareTo(x.getKey().toString()) > 0){
                this.rank += listAthlete.get(x.getKey());
            }
        }
    }
    @Override
    public String toString() {
        return id + " " + name + " " + totalTime + " " + timeBonus + " " + realTime + " " + rank;
    }
    
}
