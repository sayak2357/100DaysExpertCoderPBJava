package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] heroPowers = new int[n];
            for(int i=0;i<n;i++){
                heroPowers[i] = sc.nextInt();
            }
            int count=0,gcd=findGcdArr(heroPowers,n),villainPower;
            for(villainPower=1;villainPower<=heroPowers[0];villainPower++){
                if(gcd%villainPower==0)
                    count++;
            }
            System.out.println(count);
        }
    }
    private static int findGcdArr(int[] arr, int n){
        if(n==1)
            return arr[0];
        int gcd = findGcd(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            gcd = findGcd(arr[i],gcd);
        }
        return gcd;
    }
    private static int findGcd(int a, int b){
        if(b==0)
            return a;
        return findGcd(b,a%b);
    }
}
