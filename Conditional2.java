/**
 * WAP to accept percentage of a user and assign a proper grade to him/her.
 */
import java.util.*;
public class Conditional2 {

    public static void main(String[] args) {
        double a;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your 10TH percentage: ");
        a =sc.nextDouble();

        if (a>=75 && a<100) {
            System.out.println("You have got a distinction");
        } 
        else if(a>=60 && a<75){
            System.out.print("You got a first class");
        }
        else if(a>=40 && a<60){
            System.out.print("You got a second class");
        }
        else {
            System.out.println("You are failed");
        }
        sc.close();
    }
}
