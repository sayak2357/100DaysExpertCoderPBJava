import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(), N = sc.nextInt();
        int mat1[][] = new int[M][N];
        int mat2[][] = new int[M][N];
        int sum[][] = new int[M][N];
        int prod[][] = new int[M][M];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                int temp = 0;
                for(int k=0;k<N;k++){
                    temp+=mat1[i][k]*mat2[k][j];
                }
                prod[i][j] = temp;
            }
        }

        printMatrix(sum,M,N);
        printMatrix(prod,M,M);

    }

    private static void printMatrix(int arr[][],int M,int N){
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}