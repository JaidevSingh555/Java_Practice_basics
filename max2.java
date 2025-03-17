import java.util.*;
public class max2 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int max = (a>b && a>c) ? a:((b>a && b>c) ? b:c);
        int min = (a<b && a<c) ? a:((b<a && b<c) ? b:c);
        int mid = (a<max && a>min) ? a:((b<max && b>min) ? b:c);
        System.out.println(mid);
        scn.close();
    }
}
