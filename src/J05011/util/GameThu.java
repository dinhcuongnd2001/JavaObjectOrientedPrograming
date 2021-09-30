
package J05011.util;

public class GameThu implements Comparable<GameThu>{ 
    String ma, ten, gioVao, gioRa ;
    int soGioChoi , soPhutChoi;

    public GameThu(String ma, String ten, String gioVao, String gioRa) {
        this.ma = ma;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        String ra[] = this.gioRa.split(":"), vao[] = this.gioVao.split(":");
        int nho = 0 ;
        if(Integer.parseInt(ra[1]) < Integer.parseInt(vao[1])){
            nho = 1 ;
            this.soPhutChoi = Integer.parseInt(ra[1]) + 60 - Integer.parseInt(vao[1]); 
        }
        else this.soPhutChoi = Integer.parseInt(ra[1]) - Integer.parseInt(vao[1]);
        this.soGioChoi = Integer.parseInt(ra[0]) - Integer.parseInt(vao[0]) - nho ; 
    }
    
    

    @Override
    public String toString() {
        return  ma + " " + ten + " " + String.valueOf(soGioChoi) + " gio " + String.valueOf(soPhutChoi) +" phut";
    }

    @Override
    public int compareTo(GameThu o) {
        if(this.soGioChoi < o.soGioChoi) return 1;
        else if(this.soGioChoi == o.soGioChoi){
            if (this.soPhutChoi < o.soPhutChoi) return 1 ;
            return -1;
        }
        return -1;
    }
}
