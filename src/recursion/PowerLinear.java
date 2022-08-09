package recursion;

import java.util.Scanner;

public class PowerLinear {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int x =sr.nextInt();
        int p =power(x,n);
        System.out.println(p);
    }
    public static int power(int x,int n){
        if (n == 0)
            return 1;
        int faith = power(x,n-1);
        int exp = faith*x;
        return exp;
    }
}
