
package J07010.util;

import java.text.*;
import java.util.*;

public class Student {
    private String id, name, grade, date;
    private double GPA;

    public Student(int i, String name, String grade, String date, double GPA) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyy");
        this.id = "B20DCCN" + String.format("%03d", i);
        this.name = name;
        Date x = formater.parse(date);
        this.date = formater.format(x);
        this.grade = grade;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + grade + " " + date + " " + String.format("%.2f", GPA);
    }
    
}
    