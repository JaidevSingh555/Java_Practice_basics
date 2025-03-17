import java.util.*;
public class tri {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
        scn.close();
    }
}
