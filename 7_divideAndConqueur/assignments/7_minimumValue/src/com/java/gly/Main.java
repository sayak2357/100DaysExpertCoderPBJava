package com.java.gly;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String s = sc.next();
            System.out.println(findPrepStart(s));
        }
    }
    private static int findPrepStart(String S){
        int n = S.length();
        int left = 1, right = n, answer = Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left+right)/2;
            if(isFeasible(S,mid)){
                answer = Integer.min(answer,mid);
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return answer;
    }
    private static boolean isFeasible(String s, int K){
        for (int ch = 0; ch < 26; ch++) {
            char c = (char)( 'a' + ch);
            int last = -1;

            // set answer as true;
            boolean found = true;
            for (int i = 0; i < K; i++)
                if (s.charAt(i) == c)
                    last = i;

            // No occurrence found of current
            // character in first substring
            // of length K
            if (last == -1)
                continue;

            // Check for every last substring
            // of length K where last occurr-
            // ence exists in substring
            for (int i = K; i < s.length(); i++) {
                if (s.charAt(i) == c)
                    last = i;

                // If last occ is not
                // present in substring
                if (last <= (i - K)) {
                    found = false;
                    break;
                }
            }
            // current character is K amazing
            if (found)
                return true;
        }
        return false;
    }

}
