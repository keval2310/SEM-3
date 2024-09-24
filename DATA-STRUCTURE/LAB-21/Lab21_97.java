import java.util.Scanner;

public class Lab21_97 {
    public static void quicksort(int[] k, int lb, int ub) {
        boolean flag = true;
        if (lb < ub) {
            int i = lb;
            int j = ub + 1;
            int key = k[lb];
            while (flag = true) {
                i++;
                while (i < k.length && k[i] < key) {
                    i++;
                }
                j--;
                while (j >= 0 && k[j] > key) {
                    j--;
                }

                if (i < j) {
                    int temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                } else {
                    flag = false;
                }
                int keval = k[lb];
                k[lb] = k[ub];
                k[ub] = keval;
                quicksort(k, lb, j - 1);
                quicksort(k, j + 1, ub);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter an array of element : ");
        int[] k = new int[n];

        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();

        }

        quicksort(k, 0, k.length - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(k[i]);
        }
    }
}