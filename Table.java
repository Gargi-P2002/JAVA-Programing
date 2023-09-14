
/**
 * WAP to generate table of a given number
 */
import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number to generate its table: ");
        n = sc.nextInt();
        System.out.println("Your table generated as: ");
        for (int i = 1; i <= 10; ++i) { //generating table upto 10
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();
    }
}