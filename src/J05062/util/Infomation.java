package J05062.util;

import java.util.*;

public class Infomation {
    private String name,status;
    private double gpa;
    private int markTrain;
    private static SortedMap<Double, Integer> store =  new TreeMap<>(Comparator.reverseOrder());
    private static double StandardMark;
    

    public Infomation(String name, String mark) {
        this.name = name;
        String s[] = mark.split(" ");
        this.gpa = Double.parseDouble(s[0]);
        this.markTrain = Integer.parseInt(s[1]);
        if(this.gpa >= 2.5 && this.markTrain >= 70) store.put(this.gpa, store.getOrDefault(gpa,0)+1);
    }
    
    public void getStatus(){
        if(this.gpa < StandardMark){
            this.status = "KHONG";
        }
        else{
            if(this.gpa >= 3.6 && this.markTrain >= 90) this.status = "XUATSAC";
            else if(this.gpa >= 3.2 && this.markTrain >= 80) this.status = "GIOI";
            else if(this.gpa >= 2.5 && this.markTrain >= 70) this.status = "KHA";
            else this.status= "KHONG";
        }
    }
    @Override
    public String toString() {
        return this.name + ": " + this.status; 
    }
    
    public static void getMark(int m){
        for(SortedMap.Entry<Double, Integer> it : store.entrySet()){
            m -= it.getValue();
            if(m <= 0){
                StandardMark = it.getKey();
                break;
            }
        }
    }
}
