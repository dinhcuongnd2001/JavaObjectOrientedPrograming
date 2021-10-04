
package J05051.util;

public class Client implements Comparable<Client>{
    String id, code ;
    long cost, rank, extra, total, oldIndex, newIndex;

    public Client(int i, String code, long oldIndex, long newIndex) {
        this.id = "KH" + String.format("%02d", i);
        this.code = code;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        if(this.code.equals("KD")) this.rank = 3;
        else if(this.code.equals("NN")) this.rank = 5;
        else if(this.code.equals("TT")) this.rank = 4;
        else this.rank = 2;
        this.cost = (this.newIndex - this.oldIndex) * this.rank * 550;
        if(this.newIndex - this.oldIndex < 50) this.extra = 0;
        else if(this.newIndex - this.oldIndex <= 100) this.extra = Math.round((double)this.cost * 35 /100) ;
        else this.extra = this.cost;
        
        this.total = this.extra + this.cost;
        
    } 

    @Override
    public String toString() {
        return  id + " " + rank +" "+ cost + " " + extra + " " + total;
    }

    @Override
    public int compareTo(Client o) {
        if(this.total < o.total) return 1;
        return -1;
    }
}
