package com.java.gly;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        while (tc-- > 0) {
            String ip = sc.next();
            char[] arr = ip.toCharArray();
            int[] frequencyArr = new int[26];
            boolean isDuplicate = false;
            for (char ch : arr) {
                frequencyArr[ch - 'a']++;
            }
            for (char ch : alphabets) {
                if (frequencyArr[ch - 'a'] > 1) {
                    isDuplicate = true;
                    System.out.printf(ch + "=" + frequencyArr[ch - 'a'] + " ");
                }
            }
            if (!isDuplicate)
                System.out.println("-1");
            else
                System.out.println("");
        }
    }
}