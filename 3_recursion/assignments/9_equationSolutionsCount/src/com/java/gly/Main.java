package com.java.gly;

import java.util.Scanner;

public class Main {
    private static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt(), z= sc.nextInt();
            count = 0;
            solutionsCount(n,z);
            System.out.println(count);

        }
    }
    private static void solutionsCount(int n, int z){
        if(n==0){
            count++;
        }
        else if(n==1){
            solutionsCount(n-1,0);
        }
        else {
            for (int i = 0; i <= z; i++) {
                solutionsCount(n-1, z - i);
            }
        }
        return;
    }
}
