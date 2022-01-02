package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-->0){
            int num = sc.nextInt();
            String bin = decToBinary(num);
            int zeroCount = charCount(bin, '0'), oneCount = charCount(bin, '1');
            generatePermutations(zeroCount, oneCount, "");
            System.out.println();
        }
    }
    private static void generatePermutations(int zeroCount, int oneCount, String generated){
        if(zeroCount == 0 && oneCount == 0){
            System.out.print(generated+" ");
            return;
        }
        if(zeroCount>0)
            generatePermutations(zeroCount-1,oneCount,generated+"0");
        if(oneCount>0)
            generatePermutations(zeroCount,oneCount-1,generated+"1");
    }
    private static int charCount(String binary, char character){
        int count = 0;
        char[] arr = binary.toCharArray();
        for(char item: arr){
            if(item == character)
                count++;
        }
        return count;
    }
    private static String decToBinary(int n){
        return n<2? String.valueOf(n): decToBinary(n/2) + n%2;
    }
}
