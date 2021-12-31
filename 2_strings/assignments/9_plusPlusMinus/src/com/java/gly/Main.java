package com.java.gly;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String s = sc.next(), t = sc.next();
            char[] arrs = s.toCharArray();
            char[] arrt = t.toCharArray();
            boolean flag = false;
            int ls = s.length(), lt = t.length();
            int i = 0, j = 0;
            while(i<ls && j<lt){
                if(arrs[i]==arrt[j]){
                    i++;
                    j++;
                }
                else{
                    if(arrs[i]=='-' && arrt[j]=='+'){
                        if(i<(ls-1) && arrs[i+1]=='-'){
                            i+=2;
                            j++;
                        }
                        else
                            break;
                    }
                    else
                        break;
                }
            }
            if(i==ls && j==lt)
                flag=true;
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}
