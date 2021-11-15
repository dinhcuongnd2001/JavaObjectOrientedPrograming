package J05065.util;

public class Employee implements Comparable<Employee>{
    private String idEmployee, name, position, id, radix;
    private static int c1 = 0 , c2 = 0, c3 = 0;

    public Employee(String x) {
        String a[] = x.split(" " ,2);
        this.idEmployee = a[0];
        this.name = a[1];
        String s = this.idEmployee.substring(0,2);
        if(s.equals("GD")){
            c1 += 1;
            if(c1 > 1){
                this.position = "NV";
            }
            else this.position = "GD";
        }
        else if(s.equals("TP")){
            c2 += 1;
            if(c2 > 3) this.position = "NV";
            else this.position = "TP";
        }
        else if(s.equals("PP")){
            c3 += 1;
            if(c3 > 3) this.position = "NV";
            else this.position = "PP";
        }
        else this.position = "NV";
        
        this.radix = this.idEmployee.substring(2,4);
        this.id = this.idEmployee.substring(4);
    }   

    public String getPosition() {
        return position;
    }
    
    @Override
    public String toString() {
        return  name + " " + position + " " + id + " " + radix;
    }
    
    
    @Override
    public int compareTo(Employee o) {
        if(this.radix.compareTo(o.radix) < 0) return 1;
        else if(this.radix.equals(o.radix)){
            return this.id.compareTo(o.id);
        }
        return -1;
    }
    
    
}
