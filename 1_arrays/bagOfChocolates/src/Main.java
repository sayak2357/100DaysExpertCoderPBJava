import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        long limit = 1000003;
        long[] arr = new long[(int)limit+1];
        arr[0]=1;
        for(int i=1;i<(int)limit;i++){
            arr[i] = (i*arr[i-1])%limit;
        }
        long tc = sc.nextInt();
        for(int i=0;i<(int)tc;i++){
            long n = sc.nextLong();
            long k = sc.nextLong()%limit;
            if(n>limit)
                n=limit;
            //System.out.print(n+", "+k);
            System.out.println( (arr[(int)n]*(k))%limit );
        }
    }
}
