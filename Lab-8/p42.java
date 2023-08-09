import java.util.*;

class Queue{
    int F=0,R=0,N=0,X=0;
    int[] Q;
    Queue(int n){
    Q=new int[n];
    N=n;
    }

    public int Enqueue(int x){
        if(R==(N-1)){
            System.out.println("Queue is Overflow.");
        }
        else{
            R=R+1;
        }
        Q[R]=x;

        if(F==0){
            F=1;
        }
        return Q[R];
    }

    public void display(){
        for(int i=0;i<N;i++){
        System.out.println("Queue:"+Q[i]);
        }
        System.out.println("Front:"+F);
        System.out.println("Rear:"+R);
    }

    public int Dequeue(){
        if(F==0){
            System.out.println("Queue is underflow.");
        }
        
        X=Q[F];
        
        if(F==R){
            F=0;R=0;
        }
        else{
            F=F+1;
        }
        return(X);
    }
}

public class p42{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Queue");
        int n=sc.nextInt();
        int x=0;
        Queue t=new Queue(n);
        int x1=0;
        int z=0,i=0;

        try{
        while(x1!=1){
            System.out.print("Enter Your Choice(1.Enqueue,2.dequeue,3.display):");
            int ch=sc.nextInt();

            switch(ch){
                case 1: x=sc.nextInt();
                        z=t.Enqueue(x);
                        break;
                case 2: z=t.Dequeue();
                        break;
                case 3: t.display();
                        x1=1;
                        break;
            }
            i++;
        }}catch(Exception e){
            System.out.println(e);
        }
    }
}