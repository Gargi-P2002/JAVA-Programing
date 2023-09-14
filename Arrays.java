
/*
 * Dynamic array allocation
 */
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int i;
        int[] a = new int[5]; // Declare an array of size 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 integers: ");
        for (i = 0; i < 5; ++i) { // Use "5" as the condition for a loop that iterates 5 times
            a[i] = sc.nextInt();
        }
        System.out.println("You entered : ");
        for (i = 0; i < 5; ++i) { // Use "5" as the condition for a loop that iterates 5 times
            System.out.println(a[i]);
        }
        sc.close();
    }
}
