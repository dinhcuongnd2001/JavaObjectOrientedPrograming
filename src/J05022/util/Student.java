
package J05022.util;

public class Student {
    private String StudentCode , Name , Class , Email;

    public Student(String StudentCode, String Name, String Class, String Email) {
        this.StudentCode = StudentCode;
        this.Name = Name;
        this.Class = Class;
        this.Email = Email;
    }
    
    public String getValue(){
        return this.Class;
    }
    
    @Override
    public String toString() {
        return StudentCode + " " + Name + " " + Class + " " + Email ;
    }
}
