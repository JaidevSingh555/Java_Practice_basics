
public class ReverseFib {
    public static void main(String[] args) {
        int end = 34; int secondend = 21;
        System.out.print(end+","+secondend);
        while(secondend>0){
            int next = end-secondend;
            System.out.print(","+next);
            end = secondend;
            secondend = next;
        }
    }
}
