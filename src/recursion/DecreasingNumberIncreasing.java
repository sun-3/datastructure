package recursion;

import java.util.Scanner;

public class DecreasingNumberIncreasing {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
      //  printDecreasing(n);
        printIncreasing(n);
        printIncreasingDecrease(n);
    }

    public static void printDecreasing(int n){
        if (n==0)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void printIncreasing(int n){
        if (n==0)
            return;

        printIncreasing(n-1);
        System.out.println(n);

    }

    public static void printIncreasingDecrease(int n){
        if (n==0)
            return;
        System.out.println(n);
        printIncreasing(n-1);
        System.out.println(n);

    }
}
