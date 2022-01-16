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
            int maxProfit = 0;
            int start = 0;
            while(start<n-1){
                int buyPrice, sellPrice;
                while(start<n-1 && arr[start]>=arr[start+1])
                    start++;
                if(start==n-1)
                    break;
                buyPrice = arr[start];
                start++;
                while(start<n-1 && arr[start]<=arr[start+1])
                    start++;

                sellPrice = arr[start];
                maxProfit += (sellPrice - buyPrice);
                start++;
                //System.out.println(maxProfit+" "+start);
            }
            System.out.println(maxProfit);
        }
    }
}
