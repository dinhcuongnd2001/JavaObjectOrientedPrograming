package J04021.util;
public class IntSet {
    private int a[];

    public IntSet(int[] a) {
        this.a = a;
    }
    
    public IntSet union(IntSet b){
        int val[] = new int[1000005], res[] = new int [1000005];
        for(int i = 0 ; i < this.a.length; i++){
            val[this.a[i]] += 1;
        }
        for(int i = 0; i < b.a.length; i++){
            val[b.a[i]] += 1;
        }
        int index= 0 ;
        for(int i = 0 ; i < 1005 ; i++){
            if(val[i] > 0){
                res[index] = i;
                index += 1;
            }
        }
        IntSet ans = new IntSet(res);
        return ans;
    }

    @Override
    public String toString() {
        String ans = "";
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > 0){
                ans = ans + String.valueOf(a[i]) + " ";
            }
            
        }
        return ans;
    }
    
}
