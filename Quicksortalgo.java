class Solutions {
    //quick sort function 1..
    public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotidx = Partition(arr, low, high);

            quickSort(arr, low, pivotidx - 1);
            quickSort(arr, pivotidx + 1, high);
        }
    }
    //quick sort function 2..
    public int Partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {   // fixed here
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
//main method for functions calling amd printing..
public class Quicksortalgo {
    public static void main(String args[]) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        Solutions sol = new Solutions();

        sol.quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}