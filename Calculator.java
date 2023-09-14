/**
 * Assignment 4: method overloading
 */
public class Calculator {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("add of two numbers= " + sum);
    }

    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("add of three numbers= " + sum);
    }

    void add(int a, double b, double c) {
        double sum = a + b + c;
        System.out.println("add of three numbers= " + sum);
    }

    public static void main(String[] args) {
        Calculator mo = new Calculator();
        mo.add(8, 6);
        mo.add(9, 7, 3);
        mo.add(12, 5.98, 45.236);
    }
}
