
/**
 * WAP to print fibonacci series
 */
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int lim,a=0,b=1,c;
        System.out.print("Enter the limit for fibonacci series: ");
        lim =sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3 ;i<=lim;++i){
           c=a+b;
           a=b;
           b=c;
           System.out.print(c+" ");
        }
        sc.close();
    }
}
