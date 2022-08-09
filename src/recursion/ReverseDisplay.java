package recursion;

import java.util.Scanner;

public class ReverseDisplay {
    public static void main(String[] args) {
        Scanner sr  =new Scanner(System.in);
        int n = sr.nextInt();
        int []arr = new int[n];
        for (int i=0;i <n;i++ ){
            arr[i] = sr.nextInt();
        }
        display(arr,0);
    }

    public static void display(int []arr,int x){

        if (arr.length == 0)
            return;
        display(arr,x+1);
        System.out.println(arr[x]);
    }
}
