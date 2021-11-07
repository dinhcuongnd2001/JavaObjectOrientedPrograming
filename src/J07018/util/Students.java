package J07018.util;

import java.util.*;
import java.text.*;
public class Students {
    private String id, name, grade;
    private Date yob;
    private float gpa;
    SimpleDateFormat fomat = new SimpleDateFormat("dd/MM/yyyy");
    public Students(int i , String name, String grade, String yob, float gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", i);
        String s[] = name.trim().toLowerCase().split("\\s+");
        this.name = "";
        for(int j = 0 ; j < s.length; j++){
            this.name = this.name + s[j].substring(0,1).toUpperCase() + s[j].substring(1) + " " ;
        }
        this.grade = grade;
        this.yob = fomat.parse(yob);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  id + " " + name + grade + " " + fomat.format(yob) + " " + String.format("%.2f", gpa);
    }
    
    
    
}
