
package J04004.util;

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

    @Override
    public String toString() {
        return Long.toString(tuSO) + "/" + Long.toString(mauSO) ;
    }
}
