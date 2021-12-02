package J07025.util;

import java.text.*;
import java.util.*;
public class Clients implements Comparable<Clients>{
    private String id, name, gender, address;
    private Date yob ;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    public Clients(int i, String name, String gender, String yob, String address) throws ParseException {
        this.id = "KH" + String.format("%03d", i);
        this.name = "";
        String s[] = name.trim().toLowerCase().split("\\s+");
        for(String x : s){
            this.name += x.substring(0,1).toUpperCase()+ x.substring(1) + " ";
        }
        this.gender = gender;
        this.address = address;
        this.yob = format.parse(yob);
    }

    @Override
    public String toString() {
        return   id + " " + name + gender + " " + address + " " + format.format(yob);
    }

    @Override
    public int compareTo(Clients o) { 
        if((this.yob.getTime() - o.yob.getTime()) > 0) return 1;
        return -1;
    }    
}
