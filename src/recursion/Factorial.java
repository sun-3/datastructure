package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sr  = new Scanner(System.in);
        int n = sr.nextInt();
        int f = fact(n);
        System.out.println(f);

    }
    public static int fact(int n){
        if (n==1) {
            return 1;
        }
        int fn = fact(n-1);
        int nm = n* fn;
        return nm;

    }
}
