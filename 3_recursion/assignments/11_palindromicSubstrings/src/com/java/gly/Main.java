package com.java.gly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String str = sc.next();
            generatePalindrome(str,0,str.length(),"");
        }
    }
    private static void generatePalindrome(String str,int index,int n, String generated){
        if(index==n)
            System.out.println(generated);
        else{
            String substr = "";
            for(int i=index;i<n;i++){
                substr+=str.charAt(i);
                if(isPalindrome(substr)){
                    generatePalindrome(str,i+1,n,generated+substr+" ");
                }
            }
        }
        return;
    }
    private static boolean isPalindrome(String str){
        int left = 0, right = str.length()-1;
        if(left==right)
            return true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
