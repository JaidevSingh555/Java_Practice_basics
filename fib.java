import java.util.*;
public class fib {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0; int second = 1;
        System.out.print(first+","+second);
        for(int i=3; i<=n; i++){
            int next = first+second;
            System.out.print(","+next);
            first = second;
            second = next;
        }
    }
}
