package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(findFloor(arr,n,k));
        }
    }
    private static int findFloor(int[] arr, int n, int k){
        int low = 0, high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k || (arr[mid]<k && mid==n-1) || (arr[mid]<k && arr[mid+1]>k))
                return mid;
            if(mid>0 && arr[mid]>k && arr[mid-1]<k)
                return mid-1;
            if(k>arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
