import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int limit = 1000003;
        int[] arr = new int[limit];
        arr[0]=1;
        for(int i=1;i<limit;i++){
            arr[i] = i*arr[i-1];
        }

        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println((arr[n]*k)%limit);
        }

    }
}