
/**
 * WAP to Reverse of a number
 */
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rev=0, t, n;
        System.out.print("Enter your number: ");
        num = sc.nextInt();
        n=num;
        while (num > 0) {
            t = num % 10; //getting the last number/remainder
            rev = (rev * 10) + t; //storing the number to get the reverse
            System.out.println("Remainder: " + t);
            num=num/10; //getting the remaining number for further processing
        }
        System.out.println("Reverse of "+n+" is: "+rev);
        if (rev==n) {
            System.out.println("This number is a pallindrome number");
        }
        else{
            System.out.println("Not a palindromic number.");
        }
        sc.close();
    }

}