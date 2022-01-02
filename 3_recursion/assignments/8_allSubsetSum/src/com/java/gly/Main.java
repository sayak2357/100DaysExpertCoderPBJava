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
            IntClass subsetSum = new IntClass(0);
            allSubSetSum(arr,0,0,subsetSum);
            System.out.println(subsetSum.getValue());
        }
    }
    private static void allSubSetSum(int[] arr, int index, int runningSum, IntClass finalSum){
        int n = arr.length;
        if(index==n){
            int temp = finalSum.getValue();
            temp+=runningSum;
            finalSum.setValue(temp);
            return;
        }
        allSubSetSum(arr, index+1, runningSum, finalSum);
        allSubSetSum(arr,index+1,runningSum+arr[index], finalSum);
    }
}
