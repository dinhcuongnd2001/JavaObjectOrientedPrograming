package J05082.util;

import java.util.*;
import java.text.*;

public class Clients implements Comparable<Clients>{
    private String id, name, gender, address;
    private Date yob;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    public Clients(int i, String name, String gender, String yob, String address) throws ParseException {
        this.id = "KH"+ String.format("%03d", i);
        this.name = "";
        String []s = name.toLowerCase().trim().split("\\s+");
        for(int j = 0 ; j < s.length ; j++){
            this.name = this.name + s[j].substring(0,1).toUpperCase() + s[j].substring(1) + " ";
        }
        this.gender = gender;
        this.address = address;
        this.yob = format.parse(yob);
    }

    @Override
    public String toString() {
        return  id + " " + name + gender + " " + address + " " + format.format(yob) ;
    }
    
    

    @Override
    public int compareTo(Clients o) {
        if(this.yob.getTime() > o.yob.getTime()) return 1;
        return -1;
    } 
}
