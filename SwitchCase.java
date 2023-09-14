/*
 * WAP to implement switch case
 */
import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.print("Enter a positive number between 1 to 7: ");
        num=sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It isSaturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
        
            default:
            System.out.println("Number out of range!");
                break;
        }
        sc.close();
    }
    
}
