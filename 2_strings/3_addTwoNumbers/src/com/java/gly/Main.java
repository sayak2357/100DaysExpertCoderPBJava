package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String str1,str2,temp;
        System.out.print("Enter first number: ");
        str1 = sc.next();
        System.out.print("Enter swcond number: ");
        str2 = sc.next();
        if(str1.length()>str2.length()){
            temp = str2;
            str2=str1;
            str1=temp;
        }
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();
        int carry = 0;
        String result = "";
        int n1 = str1.length(), n2 = str2.length();
        for(int i=0;i<n1;i++){
            int sum = ((str1.charAt(i) - '0') +(str2.charAt(i)-'0') + carry);
            result = result.concat(String.valueOf((char)(sum%10+'0')));
            carry = sum/10;
        }
        for(int i=n1;i<n2;i++){
            int sum = ((str2.charAt(i) - '0') + carry);
            result = result.concat(String.valueOf((char)(sum%10+'0')));
            carry = sum/10;
        }
        if(carry>0)
            result = result.concat(String.valueOf((char)(carry%10+'0')));
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);
    }
}
