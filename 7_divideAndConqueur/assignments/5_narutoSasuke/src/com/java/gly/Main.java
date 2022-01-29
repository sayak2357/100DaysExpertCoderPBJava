package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), K = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
        int low = 0, high = K, answer = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int naruto = A+mid*X;
            int sasuke = B+(K-mid)*Y;
            if(naruto==sasuke){
                answer = mid;
                break;
            }
            else if(naruto>sasuke){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(answer);
    }
}
