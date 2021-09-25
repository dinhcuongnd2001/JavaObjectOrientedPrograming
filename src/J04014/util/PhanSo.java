
package J04014.util;

public class PhanSo {
    private long tuSO , mauSO ;

    public PhanSo(long tuSO, long mauSO) {
        this.tuSO = tuSO;
        this.mauSO = mauSO;
    }
    
    public static long gcd(long a , long b){
       while(b != 0 ){
           long tg = a % b ;
           a = b ;
           b = tg;
       }
       return a ;
    }
    
    public void rutGon(){
        long val = gcd(this.tuSO , this.mauSO) ;
        this.tuSO /= val ;
        this.mauSO /= val;
    }
    
    public static PhanSo tongPhanSo(PhanSo a , PhanSo b){
        PhanSo ans = new PhanSo(1,1);
        ans.mauSO = a.mauSO * b.mauSO ;
        ans.mauSO = ans.mauSO/(gcd(a.mauSO , b.mauSO));
        ans.tuSO = a.tuSO*(ans.mauSO/a.mauSO) + b.tuSO*(ans.mauSO/b.mauSO);
        return ans;
    }
    
    public static PhanSo phepTinhC(PhanSo a){
        a.tuSO = a.tuSO * a.tuSO;
        a.mauSO = a.mauSO * a.mauSO;
        return a;
    }
    
    public static PhanSo phepTinhD(PhanSo a , PhanSo b  , PhanSo c){
        PhanSo d = new PhanSo(1 , 1);
        d.tuSO = a.tuSO * b.tuSO * c.tuSO;
        d.mauSO = a.mauSO * b.mauSO *c.mauSO;
        return d ;
    }
    
    @Override
    public String toString() {
        return Long.toString(tuSO) + "/" + Long.toString(mauSO) ;
    }
}
