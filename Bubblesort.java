import java.util.Scanner;

public class Bubblesort {
    public static void bubbleSort(int n, int arr[]){
        for (int i=n-1; i>=1; i=i-1){
            for (int j=0; j<i; j=j+1){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
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
        bubbleSort(n,arr);
        for (int i=0; i<n; i=i+1){
            System.out.println(arr[i]+" ");
        }
        return;
    }
}
