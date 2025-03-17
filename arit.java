import java.util.*;
class arit{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        if(n1>n2){
            System.out.println(n1+n2);
            System.out.println(n1-n2);
            System.out.println(n1*n2);
            System.out.println(n1/n2);
            System.out.println(n1%n2);
        }else{
            System.out.println(n2+n1);
            System.out.println(n2-n1);
            System.out.println(n2*n1);
            System.out.println(n2/n1);
            System.out.println(n2%n1);
        }
        scn.close();
    }
}