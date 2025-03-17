public class root2 {
    public static void main(String[] args) {
        double n = 36;
        double x = 2;
        double y = n / x;
        if(2*y == n){
            System.out.printf("y");
        }
        // double error = 0.00001;
        while (2*y==n) {
            x = (x + y) / 2;
            y = n / x;
        }
        if(2*y==n){
            System.out.printf("X=|t%s, Y=\t%s\n", x, y);
        }
    }
}
