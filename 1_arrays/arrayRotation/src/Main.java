import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            k = k%n;
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int i,j=0;
            int temp[] = new int[k];
            for(i=n-k;i<n;i++){
                temp[j++] = arr[i];
            }
            for(i=n-1;i>k-1;i--){
                arr[i] = arr[i-k];
            }
            for(i=0;i<k;i++){
                arr[i] = temp[i];
            }
            printArray((arr));
            tc--;
        }
    }
    private static void printArray(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }
}