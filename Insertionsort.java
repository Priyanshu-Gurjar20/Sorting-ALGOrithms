import java.util.Scanner;

public class Insertionsort {
    public static void Insertionsortt(int arr[],int n){
        for (int i=0; i<=n-1; i=i+1){
            int j=i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i=i+1){
            arr[i] = sc.nextInt();
        }
        Insertionsortt(arr,n);
        for (int i=0; i<n; i=i+1){
            System.out.println(arr[i] + " ");
        }
        return;
    }
}
