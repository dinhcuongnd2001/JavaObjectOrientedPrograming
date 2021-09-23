
package J05021.util;
public class Student implements Comparable<Student>{
    private String StudentCode , Name , Class , Email;

    public Student(String StudentCode, String Name, String Class, String Email) {
        this.StudentCode = StudentCode;
        this.Name = Name;
        this.Class = Class;
        this.Email = Email;
    }
    
    @Override
    public String toString() {
        return StudentCode + " " + Name + " " + Class + " " + Email ;
    }

    @Override
    public int compareTo(Student o) {
       if(this.StudentCode.compareTo(o.StudentCode) > 0) return 1;
       return -1;
    }
}
