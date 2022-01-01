package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int N = sc.nextInt();
            String[] arr = new String[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.next();
            }
            String result;
            if(N==1)
                result = arr[0];
            else{
                result = findSum(arr[0],arr[1]);
                for(int i=2;i<N;i++){
                    result = findSum(result,arr[i]);
                }
            }
            System.out.println(result);

        }
    }
    static String findSum(String str1, String str2)
    {

        if (str1.length() > str2.length()){
            String t = str1;
            str1 = str2;
            str2 = t;
        }


        String str = "";

        int n1 = str1.length(), n2 = str2.length();

        str1=new StringBuilder(str1).reverse().toString();
        str2=new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++)
        {

            int sum = ((int)(str1.charAt(i) - '0') +
                    (int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        for (int i = n1; i < n2; i++)
        {
            int sum = ((int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0)
            str += (char)(carry + '0');

        str = new StringBuilder(str).reverse().toString();

        return str;
    }
}
