package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String original = sc.next(), fake = sc.next();
            int originalLength = original.length(), fakeLength = fake.length();
            if(originalLength!=fakeLength)
                System.out.println("No");
            else
            {
                String leftRotate = fake.substring(2,fakeLength)+fake.substring(0,2), rightRotate = fake.substring(fakeLength-2,fakeLength)+fake.substring(0,fakeLength-2);
                if(original.equals(leftRotate) || original.equals(rightRotate))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
