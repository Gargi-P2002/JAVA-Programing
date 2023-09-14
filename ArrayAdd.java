/*
 *WAP to add two matrix of size 5 .and take user input 
 */
import java.util.*;

public class ArrayAdd {
    public static void main(String[] args) {
        
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers for matrix a[]: ");
        for (i = 0; i < 5; i++) { //taking input for first array
            a[i] = sc.nextInt();
        }
        System.out.println("Enter 5 integers for matrix b[]: ");
        for (i = 0; i < 5; i++) { //taking input for second array
            b[i] = sc.nextInt();
        }
        for (j = 0; j < 5; j++) { //adding the values to third array
            c[j] = a[j] + b[j];
        }

        System.out.println("Addition of a[] and b[] results in: ");
        for (j = 0; j < 5; j++) {
            System.out.println(c[j]);
        }
        sc.close();
    } 
}
