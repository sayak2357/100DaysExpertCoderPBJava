package com.java.gly;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a*b);
        }
    }
}
