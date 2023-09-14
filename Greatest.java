
/**
 * greatest among the two numbers
 */
import java.util.*;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first nnumber:");
        num1 = sc.nextInt();
        System.out.print("Enter the second nnumber:");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
        sc.close();
    }
}