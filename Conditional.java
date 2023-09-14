/**
 * WAP to compare two numbers
 */
import java.util.*;
public class Conditional {

    public static void main(String[] args) {
        double a,b;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the first number: ");
        a =sc.nextDouble();
        System.out.print("Enter the second number: ");
        b =sc.nextDouble();

        if (a>b) {
            System.out.println(a+" is greater than "+b);
        } 
        else if(a==b){
            System.out.print("Both numberes are equal");
        }
        else {
            System.out.println(b+" is greater than "+a);
        }
        sc.close();
    }
}