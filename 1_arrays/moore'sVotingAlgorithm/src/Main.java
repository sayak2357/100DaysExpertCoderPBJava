import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of elelemts: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int major = 0, count =1;
        for(int i=1;i<n;i++){
            if(arr[major]>=arr[i])
                count++;
            else
                count--;
            if(count == 0){
                major = i;
                count = i;
            }
        }
        int majorFrequency = 0;
        for(int ele:arr){
            if(ele == arr[major])
                majorFrequency++;
        }
        if(majorFrequency>(n/2))
            System.out.println("majority element is: "+arr[major]);
        else
            System.out.printf("None");

    }
}
