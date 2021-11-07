
package J07017.util;

public class Pair <K,V>{
    private int x , y ;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean isPrime(){
        if (x < 2 || y < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(x) ;i++){
                if(x % i == 0) return false;
            }
            for(int i = 2 ; i <= Math.sqrt(y); i++){
                if(y % i == 0 ) return false ;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return  x + " " + y;
    }
    
}
