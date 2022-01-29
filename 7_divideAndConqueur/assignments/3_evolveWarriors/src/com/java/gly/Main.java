package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
        int answer = 0, left = 0, right = N;
        while(left<=right){
            int mid = (left+right)/2;
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
    private static boolean isFeasible(int n, int m, int x, int y, int temp){
        int requiredGem = x*temp, availableGem = m + (n-temp)*y;
        return requiredGem<=availableGem;
    }
}
