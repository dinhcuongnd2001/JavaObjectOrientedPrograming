
package J05007.util;

public class Personnel implements Comparable<Personnel>{
    private String ma , ten , gt , ns , dc , mst  , hd ;

    public Personnel(int i, String ten, String gt, String ns, String dc, String mst, String hd) {
        this.ma = "00" + String.format("%03d", i);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }
    public String Scompare(){
        String ans = "" ;
        String []store = this.ns.split("/");
        for(String x : store){
            ans = x + ans;
        }
        return ans ;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + hd;
    }
    
    @Override
    public int compareTo(Personnel o) {
        if(this.Scompare().compareTo(o.Scompare()) > 0) return 1 ;
        return -1;
    }
}
