import java.util.*;

// multi-level inheritance
class Quadrilateral {
    float length, breadth, radius, side;
    Scanner sc = new Scanner(System.in);

    public void inputData() {
        System.out.println("Taking measurements for rectangle:-");
        System.out.print("Enter the length in cm: ");
        length = sc.nextFloat();
        System.out.print("Enter the breadth in cm: ");
        breadth = sc.nextFloat();
        
        System.out.println("Taking measurements for square:-");
        System.out.print("Enter the side in cm: ");
        // Read side for square
        side = sc.nextFloat();
        
        System.out.println("Taking measurements for circle:-");
        System.out.print("Enter the radius in cm: ");
        // Read radius for circle
        radius = sc.nextFloat();
        
        sc.close();
    }
}

class Rectangle extends Quadrilateral {
    float ans;

    public void areaRectangle() {
        ans = length * breadth;
    }
}

class Square extends Rectangle {
    float ans2;

    public void areaSquare() {
        ans2 = side * side; // Use breadth as the side for square
    }
}

class Circle extends Square {
    float ans3;

    public void areaCircle() {
        ans3 = 3.14f * radius * radius;
        System.out.println("The area of rectangle is: " + ans + " cm^2");
        System.out.println("The area of square is: " + ans2 + " cm^2");
        System.out.println("The area of circle is: " + ans3 + " cm^2");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.inputData();
        c.areaRectangle();
        c.areaSquare();
        c.areaCircle();
    }
}
