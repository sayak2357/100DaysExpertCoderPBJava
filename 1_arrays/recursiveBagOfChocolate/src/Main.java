import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        long mod = 1000003;
        int tc = sc.nextInt();
        while(tc>0){
            long N = sc.nextLong(), K = sc.nextLong();
            long num = K, index = 1;
            while(index<=N){
                num*=index;
                index++;

            }
            System.out.println(num);
            tc--;
        }

    }

}