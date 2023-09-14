
/**
 * WAP to compute average of three numbers using class and object
 */
import java.util.*;

class Avg {
    float n1, n2, n3, avg;
    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.print("Enter the first number: ");
        n1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        n2 = sc.nextFloat();
        System.out.print("Enter the third number: ");
        n3 = sc.nextFloat();
        sc.close();
    }

    public void display() {
        avg = (n1 + n2 + n3) / 3;
        System.out.println("Average of three number is: " + avg);
    }
}

public class Average {
    public static void main(String[] args) {
        Avg obj = new Avg();
        obj.accept();
        obj.display();
    }
}