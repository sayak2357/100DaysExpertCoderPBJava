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
            System.out.println(findMissingAP(arr,n));
        }
    }
    private static int findMissingAP(int[] arr, int n){
        int start = 0, end = n-1;
        int cd;
        if((arr[1]-arr[0])==(arr[2]-arr[1]))
            cd = arr[1]-arr[0];
        else
            cd = Math.min(arr[1]-arr[0],arr[2]-arr[1]);
        while(start<=end){
            int mid = (start+end)/2;
            int countHigh = end - mid +1;
            int expectedEnd = arr[mid]+ (countHigh-1)*cd;
            if(expectedEnd == arr[end])
                end = mid;
            else{
                if((arr[mid+1]-arr[mid])!=cd)
                    return arr[mid]+cd;
                else
                    start = mid+1;
            }
        }
        return -1;
    }
}
