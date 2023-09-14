
/**
 * Class_Concepts
 * it is a blue print to describe an object. it contains variables and methods. they are accessed by creating objects of the class
 */
import java.util.*;

class Person {

    double height, weight;
    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.print("Enter your height in centimeters:");
        height = sc.nextDouble();
        System.out.print("Enter your weight in kilograms:");
        weight = sc.nextDouble();
        sc.close();
    }

    public void display() {
        System.out.println("Your height is: " + height + " cm");
        System.out.println("Your weight is: " + weight + " kg");
    }
}

public class Class_Concepts {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.accept();
        obj.display();
    }
}
