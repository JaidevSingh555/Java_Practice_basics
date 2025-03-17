import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter  low");
        int low =scn.nextInt();
        System.out.println("enyer high");
        int high = scn.nextInt();
        int ct = 1;
        while(low!=high){
            if(ct%2==0){
                low = low+4;
                ct++;
                System.out.println(low);
            }else{
                low = low+2;
                ct++;
                System.out.println(low);
            }
        }
    }
}
