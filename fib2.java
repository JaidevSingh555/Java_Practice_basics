import java.util.Scanner;

public class fib2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to search");
        int numbertosearch = scn.nextInt();
        scn.close();
        // Boolean istrue = true;
        int first = 0;
        int second = 1;
        if (numbertosearch == first || numbertosearch == second) {
            System.out.println("yes");
            return;
        }
        while (numbertosearch > second) {
            int next = first + second;
            first = second;
            second = next;

        }

        if (numbertosearch == second)
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}
