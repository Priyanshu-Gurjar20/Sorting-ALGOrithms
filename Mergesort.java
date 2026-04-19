import java.util.*;
class Solution {
    //function 1..
    public void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }else {
                temp.add(arr[right++]);
            }
        }
        while(left <= mid){
            temp.add(arr[left++]);
        }
        while(right <= high){
            temp.add(arr[right++]);
        }
        for (int i=low; i<=high; i=i+1){
            arr[i] = temp.get(i-low);
        }
    }
    //function 2..
   public void mergeSort(int[] arr,int low,int high){
       if (low >= high){
           return;
       }
       int mid = (low + high)/2;
       mergeSort(arr,low,mid);
       mergeSort(arr,mid+1,high);
       merge(arr,low,mid,high);
   }
}
//main call..
public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        Solution sol = new Solution();
        sol.mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
