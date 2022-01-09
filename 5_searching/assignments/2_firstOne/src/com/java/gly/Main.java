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
            System.out.println(firstOne(arr,n));
        }
    }
    private static int firstOne(int[] arr, int n){
        int low = 0,high = n-1;
        if(arr[high]==0)
            return -1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if((mid>0 && arr[mid]==1 && arr[mid-1]==0) || (mid==0 && arr[mid]==1))
                return mid;
            if(arr[mid]==0)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}

