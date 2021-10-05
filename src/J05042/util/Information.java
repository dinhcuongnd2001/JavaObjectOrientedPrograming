
package J05042.util;

public class Information implements Comparable<Information>{
    private String name ;
    private int correct , submit;

    public Information(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }

    @Override
    public int compareTo(Information o) {
        if(this.correct < o.correct) return 1;
        else if(this.correct == o.correct){
            if(this.submit > o.submit) return 1;
            else if(this.submit == o.submit){
                return this.name.compareTo(o.name);
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return  name + " " + correct + " " + submit;
    }
    
    
}
