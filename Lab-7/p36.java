import java.util.Scanner;
import java.util.Stack;

class EvalutionOfInfix{
    String X;
      EvalutionOfInfix(String x){
        X=x;
      }
      int i=0;
      int n1=0,n2=0;
      Stack<Integer> S=new Stack<>();

      void evel(){
        for(i=0;i<(X.length());i++){
            char a=X.charAt(i);
        
        if(Character.isDigit(a)){
            S.push(Character.getNumericValue(a));
        }
        else{
            System.out.println("-----------------------");
            switch(a){
                case '+':n2=S.pop();
                         n1=S.pop();
                         S.push(n1+n2);
                        break;
                case '-':n2=S.pop();
                         n1=S.pop();
                         S.push(n1-n2);
                        break;
                case '*':n2=S.pop();
                        n1=S.pop();
                        S.push(n1*n2);
                        break;
                case '/':n2=S.pop();
                         n1=S.pop();
                         S.push((n1/n2));
                        break;
                case '^':n2=S.pop();
                         n1=S.pop();
                         S.push((n1^n2));
                         break;
            }
        }
        }
    if(S.size()>1){
        System.out.println("invalid expression");        
    }
    else{
        System.out.println(S);
    }  
    }
    // }}catch(Exception e){

    // }
}

public class p36{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Operations");
        String x=sc.nextLine();
        EvalutionOfInfix t=new EvalutionOfInfix(x);
        t.evel();
    }
}
