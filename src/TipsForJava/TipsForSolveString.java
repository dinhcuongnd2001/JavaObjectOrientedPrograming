package TipsForJava;

public class TipsForSolveString {
    public static void main(String[] args) {
            String x = "PTIT    duy     tri   hoc   phi on dinh nam 2019 va khong tang trong nam 2020-2021 va 2021-2022!";
        /* thay the cac ky tu dac biet (./,'+-*...) = 1 nut cach:
            \W: la nhung ky tu khong phai chu cung khong phai so
            String ans = x.replaceAll("\\W+"," ");
            String ans = x.replaceAll("\\W+"," ");
            System.out.println(ans);
        */
        
        /*
        cat chuoi theo dau cach:
        \s : la nhung dau cach
        String ans[] = x.split("\\s+");
        */

    }
}
