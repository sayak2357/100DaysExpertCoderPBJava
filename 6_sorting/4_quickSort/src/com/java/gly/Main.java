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
        quickSort(arr,0,n-1);
        System.out.print("Array after sort: ");
        printArr(arr);
    }
    private static void printArr(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    private static void quickSort(int[] arr, int low, int high){
        if(low>=high)
            return;
        int pivot = partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = high,start = low, i = low;
        while(i<=high){
            if(arr[i]<arr[pivot]){
                int temp = arr[start];
                arr[start++] = arr[i];
                arr[i] = temp;
            }
            i++;
        }
        int temp = arr[start];
        arr[start] = arr[pivot];
        arr[pivot] = temp;
        return start;
    }
}
