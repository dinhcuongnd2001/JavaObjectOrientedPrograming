
package J04003.util;

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

    @Override
    public String toString() {
        return Long.toString(tuSO) + "/" + Long.toString(mauSO) ;
    }
}
