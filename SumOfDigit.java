/*
 * WAP to find the sum of digits of a number
 */
import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,t,num,sum=0;
        System.out.print("Enter the number: ");
        n =sc.nextInt();
        num=n;
        while(n>0)
        {
            t=n%10;
            sum+=t;
            n=n/10;
        }
        System.out.println("Sum of the digits in the number "+num+" is: "+sum);
        sc.close();
    }
}
