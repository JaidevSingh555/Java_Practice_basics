import java.util.*;

public class doWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        do {
            System.out.println(n);
            n--;
        } while (n > 0);
    }
}
