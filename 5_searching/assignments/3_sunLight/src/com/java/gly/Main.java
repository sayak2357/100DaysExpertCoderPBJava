package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(sunLight(arr,n));
        }
    }
    private static int sunLight(int[] arr, int n){
        int[] tallestOnLeft = new int[n];
        int tallestHeight = 0, count = 0;
        for(int i=0;i<n;i++){
            tallestHeight = Integer.max(tallestHeight,arr[i]);
            tallestOnLeft[i] = tallestHeight;
        }
        for(int i=0;i<n;i++){
            if((arr[i]==tallestOnLeft[i] && i==0) || (arr[i]==tallestOnLeft[i] && tallestOnLeft[i-1]<tallestOnLeft[i]))
                count++;
        }
        return count;
    }
}
