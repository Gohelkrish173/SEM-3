import java.util.Stack;
public class p1{
    public static void main(String[] args){
        Stack<Integer> S=new Stack<>();
        S.push(10);
        S.push(11);
        System.out.println(S+" "+S.size());
        S.pop();
        System.out.println(S+" "+S.size());
    }
}