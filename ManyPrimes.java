public class ManyPrimes {
    public static void main(String[] args) {
        int n = 500;
        System.out.println();
        System.out.print("2,");
        int count = 1, loopcount = 0;
        top: for (int i = 3; i <= n; i += 2) {
            int limit = (int) Math.sqrt(i);
            for (int j = 3; j <= limit; j += 2) {
                loopcount++;
                if (i % j == 0) {
                    continue top;
                }
            }
            System.out.print(i + ",");
            count++;
        }
        System.out.println("Count" + " " + count + " " + "LoopCount" + " " + loopcount);
    }
}
