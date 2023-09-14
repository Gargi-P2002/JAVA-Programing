
/*
 * WAP to compute simple interest
 */
import java.util.*;

class Interst {
    float p, t, si;
    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.print("Enter your principal amount: ");
        p = sc.nextFloat();
        System.out.print("Enter time in years: ");
        t = sc.nextFloat();
        sc.close();
    }

    public void display() {
        si = (p * t * 2.5f) / 100;
        System.out.print("Your interest amount after " + t + " years at the rate of 2.5%  is: " + si);
    }
}

public class Simple_interest {

    public static void main(String[] args) {
        Interst obj = new Interst();
        obj.accept();
        obj.display();
    }
}