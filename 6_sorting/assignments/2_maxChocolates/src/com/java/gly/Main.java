package com.java.gly;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            int answer = 0;
            for(int x = n-1;x>=0;x-=2)
                answer += array[x];
            System.out.println(answer);
        }
    }
}
