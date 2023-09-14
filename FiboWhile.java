/*
 * WAP to generate fibonacci series using While loop
 */
public class FiboWhile {
    public static void main(String[] args) {

        int i = 1, a = 0, b = 1, sum;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while (i <= 10) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
            i++;
        }
    }
}
