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
        int A = 0, B = n-1;
        String output = "";
        while(A<n && B>=0){
            if(arr[A]<arr[B]) {
                output += "2 ";
                A++;
            }
            else if(arr[A]>arr[B]){
                output += "1 ";
                B--;
            }
            else{
                output += "0 ";
                A++;
                B--;
            }
        }
        System.out.println(output);
    }
}
