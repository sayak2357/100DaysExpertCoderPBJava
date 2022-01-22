package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("element "+(i+1)+": ");
            arr[i] = sc.nextInt();
            System.out.println();

        }
        bubbleSort(arr,n);
        System.out.println("Array after sort: ");
        printArr(arr);
    }
    private static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void bubbleSort(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            int swap = 0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
}
