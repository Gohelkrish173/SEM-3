import java.util.*;

class Queue{
    int F=0,R=0,N=0,X=0;
    int[] Q;
    Queue(int n){
        Q=new int[n];
        N=n;
    }
    public int Enqueue(int x){
        X=x;
        if(R==(N-1)){
            R=1;
        }
        else{
            R=R+1;
        }

        if(F==R){
            System.out.println("Queue Overflow.");
        }
        Q[R]=X;
        if(F==0){
            F=1;
        }
        return Q[R];
    }

    public int dequeue(){
        if(F==0){
            System.out.println("Queue is underflow");
        }
        X=Q[F];

        if(F==R){
            F=0;R=0;
        }
        
        if(F==N){
            F=1;
        }
        else{
              F=F+1;
        }
        return(X);
    }

    public void display(){
        int i=0;
        for(i=0;i<N;i++){
            System.out.println("Queue:"+Q[i]);
        }
        System.out.println("Front:"+F);
        System.out.println("Rear:"+R);
    }
}

public class p43{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Size Of Queue:");
        int n=sc.nextInt();
        Queue t=new Queue(n);
        int x=0;
        int z=0;
        int x1=0;
    
        try{
        while(x1!=1){
            System.out.print("Enter Your Choice(1.CQInsert,2.CQDelete,3.Display)");
            int ch=sc.nextInt();

            switch(ch){
                case 1: x=sc.nextInt();
                        z=t.Enqueue(x);
                        break;
                case 2: z=t.dequeue();
                        break;
                case 3: t.display();
                        x1=1;
                        break;
            }
        }}catch(Exception e){
            System.out.println(e);
        }
    }
}