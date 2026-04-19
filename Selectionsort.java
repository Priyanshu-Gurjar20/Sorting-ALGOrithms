import java.util.Scanner;

public class Selectionsort {
    //CODE OF SELECTION SORT USING FUNCTION..

    public  static void selectionSort(int n, int arr[]){
        //main code of Selection sort..
        for (int i=0; i<=n-2; i=i+1){
            int min = i;
            for (int j=i; j<=n-1; j=j+1){
                if (arr[j]< arr[min]){
                    min = j;
                }
            }
            //swaping the elements..
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //taking input of array elements..
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i=i+1) {
            arr[i] = sc.nextInt();
        }
        //call function..
        selectionSort(n,arr);
             for (int i=0; i<n; i=i+1){
                 System.out.println(arr[i] + " ");
             }
             return;
   }
}