package J04016.util;

import java.util.Scanner;

public class Matrix {
    private int x ,y ;
    private int a[][];
    private Scanner sc;

    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
        this.a = new int[x+1][y+1];
    }
    
    public void nextMatrix(Scanner sc){
        this.sc = sc;
        for(int i = 0; i < this.x ; i++){
            for(int j = 0; j < this.y; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public String mul(Matrix b){
        String res = "";
        for(int i = 0 ; i < this.x ; i++){    
            for(int j = 0 ; j < b.y ; j++){
                long val = 0 ;
                for(int k = 0 ; k < this.y; k++){
                    val += this.a[i][k]* b.a[k][j];
                }
                res += String.valueOf(val) + " ";
            }
            res += "\n";
        }
        return res;
    }
    
}
