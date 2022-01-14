package com.java.gly;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] voteArray = new int[n];
            for(int i=0;i<n;i++){
                voteArray[i] = sc.nextInt();
            }
            int[] count = new int[n+1];
            for(int ele: voteArray){
                count[ele]++;
            }
            int winner = -1, limit = n/2;
            for(int i=0;i<=n;i++){
                if(count[i]>limit)
                    winner = i;
            }
            System.out.println(winner);
        }
    }
}
