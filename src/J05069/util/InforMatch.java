
package J05069.util;

public class InforMatch implements Comparable<InforMatch>{
    private String id , nameFb;
    private long countFan, profit;

    public void setProfit(long cost) {
        this.profit = this.countFan * cost;
    }

    public void setNameFb(String nameFb) {
        this.nameFb = nameFb;
    }
 
    public InforMatch(String id, long countFan) {
        this.id = id;
        this.countFan = countFan;
    }

    public String getId() {
        return id.substring(1,3);
    }


    @Override
    public String toString() {
        return id + " " + nameFb + " " + profit ;
    }    

    @Override
    public int compareTo(InforMatch o) {
        if(this.profit < o.profit) return 1;
        else if(this.profit == o.profit){
            return this.nameFb.compareTo(o.nameFb);
        }
        return -1;
    }
}
