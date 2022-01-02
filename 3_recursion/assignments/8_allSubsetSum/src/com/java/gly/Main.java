package com.java.gly;

import java.util.Scanner;

public class Main {
    private static int subsetSum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            subsetSum = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            allSubSetSum(arr,0,0);
            System.out.println(subsetSum);
        }
    }
    private static void allSubSetSum(int[] arr, int index, int runningSum){
        int n = arr.length;
        if(index==n){
            subsetSum+=runningSum;
            return;
        }
        allSubSetSum(arr, index+1, runningSum);
        allSubSetSum(arr,index+1,runningSum+arr[index]);
    }
}
