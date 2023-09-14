/**
 * WAP to accept score of a match and check who wins.
 */
import java.util.*;
public class Conditional3 {

    public static void main(String[] args) {
        double pak,ind;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the score of Pakistan: ");
        pak =sc.nextDouble();
        System.out.print("Enter the score of India: ");
        ind =sc.nextDouble();

        if (pak>ind) {
            System.out.println("Hurray! Pakistan won the match...");
        } 
        else if(pak==ind){
            System.out.print("Looks like the competion is tough! The match is a draw!");
        }
        else {
            System.out.println("Hurray! India won the match...");
        }
        sc.close();
    }
}
