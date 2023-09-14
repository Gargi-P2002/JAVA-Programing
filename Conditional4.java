/**
 * WAP to accept nationality and age to permit a loan.
 */
import java.util.*;
public class Conditional4 {

    public static void main(String[] args) {
        int age;
        String nat;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your nationality: ");
        nat=sc.nextLine();
        System.out.print("Enter your age: ");
        age=sc.nextInt();
        
        
        if (nat.equals("Indian") || nat.equals("indian") && age >= 18) {
            System.out.println("Your loan is granted");
        } 
        else if(nat.equals("Indian") || nat.equals("indian") && age < 18){
            System.out.print("You need to be atleast 18 years to take a loan");
        }
        else {
            System.out.println("Sorry! You are not eligible to take a loan");
        }
        sc.close();
    }
}