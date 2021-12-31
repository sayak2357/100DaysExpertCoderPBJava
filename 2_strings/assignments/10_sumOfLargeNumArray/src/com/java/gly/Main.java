package com.java.gly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int N = sc.nextInt();
            int K = 0;
            String[] arr = new String[N];
            ArrayList<Integer> result;
            for(int i=0;i<N;i++){
                arr[i] = sc.next();
                K = Integer.max(K,arr[i].length());
            }
            result = sumOfLargeNumbers(arr, N, K);
            String rs = "";
            Collections.reverse(result);
            int i = 0;

            while (i < result.size())
            {

                rs += result.get(i);
                i++;
            }
            System.out.println(rs);
        }
    }

    static ArrayList<Integer> sumOfLargeNumbers(String v[],
                                  int k, int N)
    {

        // Stores the array of large
        // numbers in integer format
        ArrayList<
                ArrayList<Integer>> x = new ArrayList<>(1000000);

        for(int i = 0; i < k; i++)
            x.add(new ArrayList<Integer>());

        for(int i = 0; i < k; i++)
        {
            for(int j = 0; j < N; j++)
            {

                // Convert each element
                // from character to integer
                x.get(i).add(v[i].charAt(j) - '0');
            }
        }

        // Stores the carry
        int carry = 0;

        // Stores the result
        // of summation
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = N - 1; i >= 0; i--)
        {

            // Initialize the sum
            int sum = 0;

            for(int j = 0; j < k; j++)

                // Calculate sum
                sum += x.get(j).get(i);

            // Update the sum by adding
            // existing carry
            sum += carry;
            int temp = sum;

            // Store the number of digits
            int count = 0;
            while (temp > 9)
            {
                temp = temp % 10;

                // Increase count of digits
                count++;
            }

            long l = (long)Math.pow(10, count);
            if (l != 1)

                // If the number exceeds 9,
                // Store the unit digit in carry
                carry = (int)(sum / l);

            // Store the rest of the sum
            sum = sum % 10;

            // Append digit by digit
            // into result array
            result.add(sum);
        }
        while (carry != 0)
        {
            int a = carry % 10;

            // Append result until
            // carry is 0
            result.add(a);
            carry = carry / 10;
        }

        return result;
    }
}
