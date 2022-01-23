package com.java.gly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<String> items = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] ipArr = input.toCharArray();
        Arrays.sort(ipArr);
        String inputSorted = new String(ipArr);
        generatePowerset(inputSorted,0,input.length(),"");
        Collections.sort(items);
        items.remove(0);
        for(String item:items)
            System.out.println(item);
    }
    private static void generatePowerset(String str, int index, int len, String generated){
        if(index>=len){
            items.add(generated);
            return;
        }
        generatePowerset(str, index+1, len, generated);
        generatePowerset(str, index+1, len, generated+str.charAt(index));
    }
}
