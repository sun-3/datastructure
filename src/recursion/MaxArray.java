package recursion;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n  =sr.nextInt();
        int [] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sr.nextInt();
        }
        int max = displayMax(arr,0);
    }

    public static int displayMax(int arr[],int x){
        if (x >=arr.length){
            return Integer.MIN_VALUE;
        }
        int max = displayMax(arr,x+1);
        if (arr[x] > max){
            return arr[x];
        }
        return max;
    }
}
