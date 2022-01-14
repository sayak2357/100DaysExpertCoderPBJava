package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n= sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            System.out.println(findX(arr,n,x));
        }
    }
    private static int findX(int[] arr, int n, int x){
        int pivot = findPivot(arr,n);
        int leftSearch = binarySearch(arr,0,pivot,x);
        int rightSearch = binarySearch(arr,pivot+1,n-1,x);
        return leftSearch!=-1?leftSearch:rightSearch;
    }
    private static int binarySearch(int[] arr,int low, int high, int x){
        if(x>arr[high] || x<arr[low])
            return -1;
        int start = low, end = high;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
    private static int findPivot(int[] arr, int n){
        if(arr[0]<=arr[n-1])
            return n-1;
        int start = 0, end = n-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]<=arr[end])
                end = mid;
            else
                start = mid+1;
        }
        return -1;
    }
}
