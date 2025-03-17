

public class prime {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        int n = 19;
        int limit = (int) Math.sqrt(n);

        for (int i = 2; i <= limit; i++)
            if (n % i == 0) {
                System.out.println(" Not prime");
                return;
            }
        System.out.println("Prime");

        // 5,7,11,13,17,19,23,25,29

    }
}
