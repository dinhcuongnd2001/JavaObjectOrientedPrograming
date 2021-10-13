
package J05009.util;

public class InfoScores {
    private String name , dOB ;
    private double scores1, scores2, scores3, totalScores;
    private int id;
    protected static double maxScores;

    public InfoScores( int id, String name, String dOB, double scores1, double scores2, double scores3) {
        this.name = name;
        this.dOB = dOB;
        this.id = id;
        this.scores1 = scores1;
        this.scores2 = scores2;
        this.scores3 = scores3;
        this.totalScores  = this.scores1 + this.scores2 + this.scores3;
        maxScores = Math.max(maxScores, this.totalScores);
    }
    public double getTotalScores(){
        return this.totalScores;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dOB + " " +  totalScores;
    }
}
