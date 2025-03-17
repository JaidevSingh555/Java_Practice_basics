import java.util.*;

public class root {
    public static void main(String[] args) {
        double n = 125;
        double x = 2;
        double y = n / (x*x);
        System.out.printf("X=|t%s, Y=\t%s\n", x, y);
        double error = 0.00001;
        while (Math.abs(x - y) >= error) {
            x = (x + y) / 2;
            y = n / (x*x);
            System.out.printf("X=|t%s, Y=\t%s\n", x, y);

        }
        double result=(x+y)/2.0;
        System.out.printf("X=|t%s, Y=\t%s\n", x, y);
        System.out.println(result);

    }
}
