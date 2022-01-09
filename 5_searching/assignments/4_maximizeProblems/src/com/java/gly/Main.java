package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int limit = 240-k;
        System.out.println(maxSolvableProblems(n,limit));
    }
    private static int maxSolvableProblems(int n, int limit){
        int low = 1, high = n;
        if(isSolvable(n,limit))
            return n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isSolvable(mid,limit) && !isSolvable(mid+1,limit))
                return mid;
            if(isSolvable(mid,limit))
                low = mid+1;
            else
                high = mid-1;
        }
        return 0;
    }
    private static boolean isSolvable(int n, int limit){
        int totalTime = 5*n*(n+1)/2;
        return totalTime<=limit;
    }
}
