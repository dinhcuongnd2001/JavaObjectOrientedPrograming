package J04020.util;

public class Pair<K,V>{
    private int x,y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean check(int n){
        if(n<2) return false;
        for(int i =2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        if(check(x) && check(y)) return true;
        return false;
    }

    @Override
    public String toString() {
        return  x + " " + y ;
    }
    
}
