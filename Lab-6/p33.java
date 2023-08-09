// import java.util.*;
// import java.util.Stack;

// class infixtopostfix{
//     static char ch;

//     public static int F(char c){
//         ch=c;
//         if(ch=='+' || ch=='-'){
//             return 1;
//         }
//         else if(ch=='*'||ch=='/'){
//             return 3;
//         }
//         else if(ch=='^'){
//             return 6;
//         }
//         else if(ch=='('){
//             return 9;
//         }
//         else if(ch==')'){
//             return 0;
//         }
//         else{
//             return 7;
//         } 
//     }

//     public static int G(char c){
//         ch=c;
//         if(ch=='+' || ch=='-'){
//             return 2;
//         }
//         else if(ch=='*'||ch=='/'){
//             return 4;
//         }
//         else if(ch=='^'){
//             return 5;
//         }
//         else if(ch=='('){
//             return 0;
//         }
//         else{
//             return 8;
//         } 
//     }

//     public static int R(char c){
//         ch=c;
//         if(ch=='+' || ch=='-' || ch=='*' || ch=='/' ||ch=='^'){
//             return -1;
//         }
//         else{
//             return 1;
//         }
//     }
// }


// public class p33{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter A Operations:");
//         String x1=sc.nextLine();
//         String X=x1+" ";
//         String polish=new String();
//         int Rank=0;

//         Stack<Character> S=new Stack<>();
//         infixtopostfix t=new infixtopostfix();
//         int i=0;
//         char[] ch=new char[100];
//         S.push('(');
//         char temp;
        
//         for(i=0;i<X.length();i++){
//             ch[i]=X.charAt(i);
//         }
//         i=0;
//         int x2=0;
//         while(x2!=1){

//         while(!S.isEmpty()&&t.G(S.peek())>t.F(ch[i])){
//             temp=S.pop();
//             System.out.println(temp);
//             polish=polish+temp;
//             Rank=Rank+t.R(ch[i]);
//             if(Rank<1){
//                 System.out.println("Invalid.");
//             }
//         }
//         if(t.G(S.peek())!=t.F(ch[i])){
//             S.push(ch[i]);
//         }
//         else{
//             S.pop();
//         }
        
//         if(ch[i]==' '){
//             S.push(')');
//         }
//         if(S.isEmpty()){
//             x2=1;
//         }
//         i=i++;
//     }    
//     System.out.println("Polish:"+polish);
//     }
// }
