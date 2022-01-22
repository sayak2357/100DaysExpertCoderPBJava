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
        mergeSort(arr,0,n-1);
        System.out.println("Array after sort: ");
        printArr(arr);
    }
    private static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void mergeSort(int[] arr, int low, int high){
        if(low>=high)
            return;
        int mid = low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private static void merge(int[] arr, int low, int mid, int high){
        int[] mergedArr = new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                mergedArr[k++] = arr[i++];
            }
            else{
                mergedArr[k++] = arr[j++];
            }
        }
        while(i<=mid) {
            mergedArr[k++] = arr[i++];
        }
        while(j<=high) {
            mergedArr[k++] = arr[j++];
        }
        for(int l=low;l<=high;l++){
            arr[l] = mergedArr[l-low];
        }
    }
}
