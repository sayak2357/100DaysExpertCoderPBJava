package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int low = 0, high = findMax(arr), answer = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFeasible(arr,n,k,mid)){
                answer = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(answer);
    }
    private static boolean isFeasible(int[] arr, int n, int k, int height){
        int count = 0;
        for(int ele:arr){
            count += ele/height;
        }
        return count>=k;
    }
    private static int findMax(int[] arr){
        int max = arr[0];
        for(int ele:arr){
            max = Integer.max(max,ele);
        }
        return max;
    }
}
