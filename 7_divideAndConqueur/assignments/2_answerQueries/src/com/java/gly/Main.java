package com.java.gly;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefixSum = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<=n;i++){
            prefixSum[i] = arr[i-1] + prefixSum[i-1];
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int num = sc.nextInt();
            int count = countLessEqual(arr,n,num);
            System.out.println(count+" "+prefixSum[count]);
        }
    }
    private static int countLessEqual(int[] arr, int n, int num){
        if(num<arr[0])
            return 0;
        if(num>arr[n-1])
            return n;
        int left = 0, right = n-1, answer = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == num) {
                answer = mid;
                left = mid+1;
            }
            else if(arr[mid]>num)
                right = mid-1;
            else{
                answer = mid;
                left = mid+1;
            }
        }
        return answer+1;
    }
}
