
package J05038.util;

public class Salary {
    private String id, name, office ;
    long salaryDay, workDays, total , totalSalary, bonus, allowance; 
    private static long totalPay;

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
        totalPay += this.totalSalary;
    }
    
    public static long getTotalpay(){
        return totalPay;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + total + " " + bonus + " " + allowance + " " + totalSalary   ;
    }
}
