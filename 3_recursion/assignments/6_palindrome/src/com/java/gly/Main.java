package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String ip = sc.next();
            if(isPalindrome(ip,0,ip.length()-1))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    private static boolean isPalindrome(String s, int left, int right){
        if(left>=right)
            return true;
        if(s.charAt(left)!=s.charAt(right))
            return false;
        return isPalindrome(s,left+1,right-1);
    }
}
