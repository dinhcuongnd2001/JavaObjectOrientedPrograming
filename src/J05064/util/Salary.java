
package J05064.util;
public class Salary {
    private String id, name;
    private long basicSalary, bonus, totalSalary , radix ;
    public Salary(String id, String name, long basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        if(this.id.substring(0,2).equals("HT")) this.bonus = 2000000;
        else if(this.id.substring(0,2).equals("HP")) this.bonus = 900000;
        else this.bonus = 500000;
        this.radix = Integer.parseInt(this.id.substring(2,4));
        this.totalSalary = this.basicSalary * this.radix + this.bonus;
    }
    
    public String getPosition(){
        return this.id.substring(0,2);
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + radix + " " + bonus + " " + totalSalary ;
    }
    
    
}
