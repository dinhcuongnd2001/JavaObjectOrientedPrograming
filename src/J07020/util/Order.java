
package J07020.util;

public class Order {
    private String id;
    private Client c1;
    private Items i1;
    private long count, total;

    public Order(int i , String s) {
        this.id = "HD" + String.format("%03d", i);
        String a[] = s.split(" ", 3);
        this.c1 = new Client(0,"","","","");
        this.i1 = new Items(0,"","",0,0);
        this.count = Long.valueOf(a[2]);
        c1.setId(a[0]);
        i1.setId(a[1]);
    }

    public Client getC1() {
        return c1;
    }

    public Items getI1() {
        return i1;
    }
    
    public void setC1(Client c1) {
        this.c1 = c1;
    }

    public void setI1(Items i1) {
        this.i1 = i1;
    }
    
    public void setTotal(){
        this.total = this.i1.getSell() * this.count;
    }

    @Override
    public String toString() {
        return id + " " + c1.getName()+ " " + c1.getAdd() + " " + i1.getName() + " " + i1.getUnit() + " " + i1.getCost()+ " " +i1.getSell()+ " " + count + " " + total;  
    }  
}

