package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String ip = sc.next();
            System.out.println(process(ip));
        }
    }
    private static int process(String ip){
        int n= ip.length(), answer = 0;
        int l=0,r=n-1;
        String sub = ip.su
        char[] arr = ip.toCharArray();
        while(l<r){
            int diff =0;
            if(arr[l]>arr[r]){
                diff = arr[l] - arr[r];
            }
            else if(arr[l]<arr[r]){
                diff = arr[r] - arr[l];
            }
            answer+=diff;
            l+=1;
            r-=1;
        }
        return answer;
    }
}
