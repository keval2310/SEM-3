import java.util.Scanner;

public class Lab1_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int leftdays = totalDays % 365;
        int weeks = leftdays / 7;
        int days = leftdays % 7;

        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}
