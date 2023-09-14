/**
 *  method overloading
 */
public class Method_overloading {
    void addition(int a, int b) {
        int sum = a + b;
        System.out.println("addition of two numbers= " + sum);
    }

    void addition(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("addition of three numbers= " + sum);
    }

    void addition(int a, double b, double c) {
        double sum = a + b + c;
        System.out.println("addition of three numbers= " + sum);
    }

    public static void main(String[] args) {
        Method_overloading mo = new Method_overloading();
        mo.addition(8, 6);
        mo.addition(9, 7, 3);
        mo.addition(12, 5.98, 45.236);
    }
}
