package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("enter string in lower-case: ");
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        int freq[] = new int[26];
        for(int i=0;i<ip.length();i++){
            freq[ip.charAt(i)-97]++;
        }
        boolean flag = false;
        for(int i=0;i<ip.length();i++){
            if(freq[ip.charAt(i)-97]==1) {
                System.out.println();
                System.out.println("First non-repeating character is: "+ip.charAt(i));
                flag=true;
                break;
            }
        }
        if(!flag)
            System.out.println("-1");
    }
}
