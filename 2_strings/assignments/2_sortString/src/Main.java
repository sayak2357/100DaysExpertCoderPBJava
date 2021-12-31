import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String ip = sc.next();
            System.out.println(stringSort(ip));
        }

    }
    public static String stringSort(String ip){
        char arr[] = ip.toCharArray();
        int n = ip.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return new String(arr);
    }
}