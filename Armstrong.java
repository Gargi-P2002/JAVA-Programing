/*
 * WAP to find if a number is armstrong
 * 153=1*1*1+5*5*5+3*3*3=153
 */
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,sum=0,t,num;
        System.out.print("Enter a three digit positive number: ");
        n=sc.nextInt();
        num=n;
        while (n>0) {
           t=n%10;
           sum+=(t*t*t);
           n=n/10;
        }
        if (sum==num) {
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println(num+" is not an armstrong number");
        }
        sc.close();

    }
    
}
