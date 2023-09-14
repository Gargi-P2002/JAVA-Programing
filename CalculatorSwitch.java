
/*
 * WAP to implement switch case to generate a calculator
 */
import java.util.*;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, res;
        int choice;
        System.out.print("Enter the first number: ");
        a = sc.nextFloat();
        System.out.print("Enter the second number: ");
        b = sc.nextFloat();
        System.out.println("Enter 1 to perform Addition \nEnter 2 to perform Subtraction \nEnter 3 to perform Multiplication \nEnter 4 to perform Division \nEnter 5 to perform Percentage");
        System.out.print("Enter the your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Performing Addition..");
                res = a + b;
                System.out.println("Addition of " + a + " + " + b + " is: " + res);
                break;
            case 2:
                System.out.println("Performing Subtraction..");
                res = a - b;
                System.out.println("Subtraction of " + a + " - " + b + " is: " + res);
                break;
            case 3:
                System.out.println("Performing Multiplication..");
                res = a * b;
                System.out.println("Multiplication of " + a + " * " + b + " is: " + res);
                break;
            case 4:
                System.out.println("Performing Division..");
                res = a / b;
                System.out.println("Division of " + a + " / " + b + " is: " + res);
                break;
            case 5:
                System.out.println("Performing Pecentage...");
                res = (a / 100)*b;
                System.out.println(a+ "Percentage of "+ b + " is: " + res);
                break;

            default:
                System.out.println("Please select from the menu above and try again...!");
                break;
        }
        sc.close();
    }

}
