    package com.java.gly;

    import java.util.Scanner;

    public class Main {

        static long inversionCount = 0;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                int N = sc.nextInt();
                long[] arr = new long[N];
                for(int i=0;i<N;i++){
                    arr[i] = sc.nextLong();
                    arr[i] = findSetBitCount(arr[i]);
                }
                findInversionCount(arr,N);
                System.out.println(inversionCount);
                inversionCount = 0;
            }
        }
        private static long findSetBitCount(long num){
            long count = 0;
            while(num>0){
                if(num%2==1)
                    count++;
                num = num/2;
            }
            return count;
        }
        private static void printArr(long[] arr){
            for(long num:arr)
                System.out.println(num);
        }
        private static void findInversionCount(long[] arr, int n){
            mergeSort(arr,0,n-1);
        }
        private static void mergeSort(long[] arr, int low, int high){
            if(low>=high)
                return;
            int mid = low + (high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        private static void merge(long[] arr, int low, int mid, int high){
            long[] mergedArr = new long[high-low+1];
            int i=low,j=mid+1,k=0;
            while(i<=mid && j<=high){
                if(arr[i]<arr[j]){
                    mergedArr[k++] = arr[i++];
                }
                else{
                    mergedArr[k++] = arr[j++];
                    inversionCount += mid-i+1;
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
