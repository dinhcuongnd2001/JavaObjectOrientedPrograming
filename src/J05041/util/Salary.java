
package J05041.util;

public class Salary implements Comparable<Salary>{
    private String id, name, office ;
    long salaryDay, workDays, total , totalSalary, bonus, allowance; 

    public Salary(int i, String name, long salaryDay, long workDays, String office) {
        this.id = "NV" + String.format("%02d", i);
        this.name = name;
        this.office = office;
        this.salaryDay = salaryDay;
        this.workDays = workDays;
        this.total = this.salaryDay * this.workDays ;
        if(this.office.equals("GD")) this.allowance = 250000  ;
        else if(this.office.equals("PGD")) this.allowance = 200000 ;
        else if(this.office.equals("TP")) this.allowance = 180000 ;
        else this.allowance = 150000;
        
        if(this.workDays >= 25) this.bonus = this.total * 20 / 100 ;
        else if(this.workDays >= 22) this.bonus = this.total * 10 /100 ;
        else this.bonus = 0;
        this.totalSalary = this.total + this.allowance + this.bonus;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + total + " " + bonus + " " + allowance + " " + totalSalary   ;
    }

    @Override
    public int compareTo(Salary o) {
        if(this.totalSalary < o.totalSalary) return 1;
        return -1;
    }
}
