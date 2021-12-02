package J07041.util;

import java.io.Serializable;

public class Pair implements Serializable,Comparable<Pair>{
    private long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    public long getFirst() {
        return first;
    }

    public long getSecond() {
        return second;
    }
        
    @Override
    public int compareTo(Pair o) {
       if((this.first - o.first) > 0 ) return 1;
       return -1;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
