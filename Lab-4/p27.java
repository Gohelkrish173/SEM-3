import java.util.*;

class stack{
    int[] s;
    int n1;
    int temp;
    stack(int n){
        n1=n;
        s=new int[n];
    }
    int Top=-1;

    public void push(int x){
        try{
        if(Top>n1){
            System.out.println("stack is overflow use pop"); 
        }
        else{
            Top=Top+1;
            s[Top]=x;
        }}catch(Exception e){
            System.out.println(e);
        }
    }
    public void pop(){
        if(Top==-1){
            System.out.println("stack underflow");
        }
        else{
        int  y=s[Top];
            Top=Top-1;
            System.out.print("poped value :"+y);
        }  
    }
    public void peep(int i){
        if((Top-i+1)<0){
            System.out.println("stack underflow.");
        }
        else{
            System.out.print(s[Top-i+1]);
        }
    }
    public void change(int x,int i){
        if((Top-i+1)<0){
            System.out.println("stack underflow.");
        }
        else{
            temp=Top;
            s[Top-i+1]=x;
            Top=temp;
        }
    }
    public void display(){
        for(int i=Top;i>=0;i--){
            System.out.println("Display stack value");
            System.out.print(s[i]+",");
        }
    }
}
public class p27{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("n:");
    int n=sc.nextInt();
    int x1=1;
    stack t=new stack(n);
    int x;
    int i;

    while(x1!=0){
        System.out.println("Enter your choice(press 1.push,2.pop,3.peep,4.change,5.display,6.exit):");
        int ch=sc.nextInt();
        
        switch(ch){
            case 1: System.out.print("x:");
                    x=sc.nextInt();
                    t.push(x);
                    break;
            case 2: t.pop();
                    break;
            case 3: System.out.print("i:");
                    i=sc.nextInt();
                    t.peep(i);
                    break;    
            case 4: System.out.print("i:");
                    i=sc.nextInt();
                    System.out.print("x:");
                    x=sc.nextInt();
                    t.change(x,i);
            case 5: t.display();break;
            case 6: x1=0;
                    break;
            }
        }
    }
}