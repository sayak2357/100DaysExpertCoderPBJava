package com.java.gly;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            boolean flag = true;
            String ip = sc.next();
            char[] arr = ip.toCharArray();
            int n = arr.length;
            for(int i=0;i<n-1;i++){
                if(arr[i]!='n' && !isVowel(arr[i])){
                    if(!isVowel(arr[i+1])){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag && n>1 && !isVowel(arr[n-1]) && arr[n-1]!='n'){
                flag = false;
            }
            if(n==1 && !isVowel(arr[0]) && arr[0]!='n')
                flag = false;
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
    private static boolean isVowel(char a){
        String vowels = "aeiou";
        return vowels.indexOf(a)>-1;
    }
}
