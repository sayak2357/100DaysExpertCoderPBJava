package com.java.gly;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0) {
            String ip = sc.next(), aman = "aman";
            int n = ip.length(),answer = 0;
            for (int i = 0; i <n;i++){
                for(int j=i;j<n;j++){
                    for(int x=i;x<j-2;x++){
                        String substr = ip.substring(x,x+4);
                        if(substr.equals(aman)){
                            answer+=1;
                            //System.out.println(i+""+j);
                            break;
                        }
                    }
                }
            }
            System.out.println(answer);
        }

    }
}
