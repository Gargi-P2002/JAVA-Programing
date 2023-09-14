/**
 * WAP to print square 50 numberss
 */
public class SquareSeries {
    public static void main(String args[]) {
        int i, square;
        for (i = 1; i <= 50; i++) // i=i+1
        {
            square = i * i;
            System.out.println("Square of " + i + " = " + square);
        }
    }

}
