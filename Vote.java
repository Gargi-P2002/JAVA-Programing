/**
 * WAP to check if you can Vote or not
 */
import java.util.*;
public class Vote {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age;
    System.out.print("Enter your age:");
    age=sc.nextInt();
    if (age>=18) {
        System.out.println("You are eligible for voting");
    }
    else{
        System.out.println("You cannot vote!");
    }
    sc.close();
 }   
}