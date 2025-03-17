public class ManyPrimes {
    public static void main(String[] args) {
        int n = 500;
        System.out.println();
        int count = 0, loopcount = 0;
        top: for (int i = 2; i <= n; i++) {
            int limit = (int) Math.sqrt(i);
            for (int j = 2; j <= limit; j++) {
                loopcount++;
                if (i % j == 0) {
                    continue top;
                }
            }
            System.out.print(i + ",");
            count++;
        }
        System.out.println("Count"+" "+count+" "+"LoopCount"+" "+loopcount);
    }
}
