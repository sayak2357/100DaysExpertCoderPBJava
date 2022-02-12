package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }

        int waterRahul = findWater(arr,n);
        int waterAmit = findWater(arr2,m);
        if(waterAmit>waterRahul){
            int diff = waterAmit-waterRahul;
            System.out.println("Amit "+diff);
        }
        else if(waterRahul>waterAmit){
            int diff = waterRahul-waterAmit;
            System.out.println("Rahul "+diff);
        }
        else
            System.out.println(-1);
    }
    private static int findWater(int[] arr, int n){
        int[] max_on_left = new int[n];
        int[] max_on_right = new int[n];
        int tempMax = 0;
        for(int i=0;i<n;i++){
            tempMax = Integer.max(tempMax,arr[i]);
            max_on_left[i] = tempMax;
        }
        tempMax = 0;
        for(int i=n-1;i>=0;i--){
            tempMax = Integer.max(tempMax,arr[i]);
            max_on_right[i] = tempMax;
        }
        int water = 0;
        for(int i=0;i<n;i++){
            int minHeight = Integer.min(max_on_left[i],max_on_right[i]);
            int waterAbove = minHeight-arr[i];
            water+=waterAbove;
        }
        return water;
    }
}
