import java.util.Scanner;

public class Lab22_98 {
    
    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; 
        int leftChild = 2 * i + 1; 
        int rightChild = 2 * i + 2;

        if (leftChild < n && arr[leftChild] > arr[largest])
            largest = leftChild;

        if (rightChild < n && arr[rightChild] > arr[largest])
            largest = rightChild;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size_of_array=sc.nextInt();
        int[] arr = new int[size_of_array];
        System.out.println("----------Enter the element of the array----------");
        for(int i=0;i<size_of_array;i++)
        {
            arr[i]=sc.nextInt();
        }
        heapSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}