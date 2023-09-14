
/**
 * WAP to check if a number is even or odd
 */
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        if ((num % 2) == 0) { //a number divisible by two is always an even number
            System.out.println("The given number " + num + " is an EVEN NUMBER");
        } else {
            System.out.println("The given number " + num + " is an ODD Number.");
        }
        sc.close();
    }
}
