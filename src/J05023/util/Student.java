
package J05023.util;

public class Student {
    private String StudentCode , Name , grade, Email; 

    public Student(String StudentCode, String Name, String grade , String Email) {
        this.StudentCode = StudentCode;
        this.Name = Name;
        this.grade = grade;
        this.Email = Email;
    }
    
    public String getGrade(){
        return this.grade.substring(1 , 3);
    }
    
    @Override
    public String toString() {
        return StudentCode + " " + Name + " " + grade + " " + Email ;
    }
    
}
