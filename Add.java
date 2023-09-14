
/**
 * Add two numbers and return the value
 */
import java.util.*;

class Addition {

    int num1, num2, res;
    Scanner sc = new Scanner(System.in);

    /*
     * public void accept() {
     * System.out.print("Enter the first number:");
     * num1=sc.nextInt();
     * System.out.print("Enter the second number:");
     * num2=sc.nextInt();
     * sc.close();
     * }
     */
    // parameterised method
    public int display(int num1, int num2) {
        return num1 + num2;
    }
}

public class Add {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("The result is: " + obj.display(9, 3));

    }
}
