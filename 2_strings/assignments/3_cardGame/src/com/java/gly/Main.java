package com.java.gly;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            String inHand = br.readLine();
            String[] onTable = br.readLine().trim().split(" ");
            boolean flag = false;
            for(String card:onTable){
                char[] rankSuit = card.toCharArray();
                char[]  inHandRankSuit = inHand.toCharArray();
                if(rankSuit[0]==inHandRankSuit[0] || rankSuit[1]==inHandRankSuit[1]){
                    flag = true;
                    break;
                }
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
