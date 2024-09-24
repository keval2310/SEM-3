import java.util.Scanner;

public class Lab1_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range to find Armstrong numbers (e.g., 1 1000): ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            PrintArmstrong(num);
        }

    }

    public static void PrintArmstrong(int num) {
        int origNum = num;
        int result = 0;
        int n = 0;

        for (int temp = num; temp != 0; temp /= 10) {
            n++;
        }

        for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            result += Math.pow(digit, n);
        }

        if (result == origNum) {
            System.out.println(origNum);
        }
    }
}
