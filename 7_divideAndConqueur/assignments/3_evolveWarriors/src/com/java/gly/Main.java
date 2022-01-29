package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
        long answer = 0, left = 0, right = N;
        while(left<=right){
            long mid = (left+right)/2;
            if(isFeasible(N,M,X,Y,mid)){
                answer = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println(answer);
    }
    private static boolean isFeasible(long n, long m, long x, long y, long temp){
        long requiredGem = x*temp, availableGem = m + (n-temp)*y;
        return requiredGem<=availableGem;
    }
}
