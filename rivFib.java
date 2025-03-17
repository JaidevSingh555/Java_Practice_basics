import java.util.*;
public class rivFib {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Stack<Integer> st = new Stack<>();
        int first = 0; int second = 1;
        st.push(first);
        st.push(second);
        for(int i=3; i<=n; i++){
            int next = first+second;
            st.push(next);
            first = second;
            second = next;
        }
        while (!st.isEmpty()) {
            System.out.print(st.peek());
            st.pop();
        }
    }
}
