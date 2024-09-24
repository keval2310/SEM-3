import java.util.*;
public class Lab5_32 {
    public static boolean AnagramUsingSB(String a, String b) {
        char[] characters = a.toCharArray();
        StringBuilder sbSecond = new StringBuilder(b);
        for (char ch : characters) {
          int index = sbSecond.indexOf("" + ch);
          if (index != -1) {
            sbSecond.deleteCharAt(index);
          } else {
            return false;
          }
        }
        return sbSecond.length() == 0 ? true : false;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words to store in an array : -");
        int n = sc.nextInt();
        String[] arr = new String[n];
        int a = arr.length;

        System.out.println("Enter the elements in the array.....");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            }

        int x = (int)(Math.random() * n);
        
        System.out.println("The word at random index "+x+" is :-");
        System.out.println(arr[x]);

        System.out.println("Enter the anagram of the word shown above..........");
        String anagram = sc.next();

        int b = anagram.length();

        if (a != b) {
            System.out.println("Plese enter appropriate array of same length...........");

        }       
    }
}