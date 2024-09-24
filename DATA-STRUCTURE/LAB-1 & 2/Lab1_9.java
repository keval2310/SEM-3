import java.util.Scanner;
public class Lab1_9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of seconds : ");
		int tsec = sc.nextInt();
		int hrs = tsec/3600;
		int min = (tsec%3600)/60;
		int sec = tsec%60;

		System.out.println("Time in HH:MM:SS is "+hrs+":"+min+":"+sec);
	}
}