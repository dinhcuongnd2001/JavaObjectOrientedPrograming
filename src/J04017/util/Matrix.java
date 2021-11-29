package J04017.util;

import java.util.Scanner;

public class Matrix {
    private int x , y , a[][];
    private Scanner sc;

    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
        this.a = new int[x+1][y+1];
    }
    public void nextMatrix(Scanner sc){
        this.sc = sc;
        for(int i = 0 ; i < x ; i++){
            for(int j = 0 ; j < y ; j++){
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix trans(){
        Matrix ans = new Matrix(y,x);
        for(int i = 0; i < x ; i++){
            for(int j = 0 ; j < y ; j++){
                ans.a[j][i] = this.a[i][j]; 
            }
        }
        return ans;
    }
    public String mul(Matrix b){
        String ans = "";
        for(int i = 0 ; i < x ; i++){
            for(int j = 0 ; j < b.y ; j++){
                long val = 0;
                for(int k = 0; k < y; k++){
                    val += a[i][k]*b.a[k][j];
                }
                ans += val + " ";
            }
            ans += "\n";
        }
        return ans;
    }
}
