package recursion;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[] arr =new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sr.nextInt();
        }
        display(arr,0);
    }

    //0,1,2,3,5
    //10,20,30,50

    public static void display(int[] arr,int x){
        if (x==arr.length)
            return ;
        System.out.println(arr[0]);
        display(arr,x+1);
    }
}
