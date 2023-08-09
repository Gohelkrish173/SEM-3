import java.util.*;

class Node{
    int  data;
    Node RPTR;
    Node LPTR;

    Node(int data){
        this.data=data;
        this.RPTR=null;
        this.LPTR=null;
    }
}

class DLL{
    Node L;
    Node R;
    int index=0;
    int ind=0;
    public void addF(int data){
        Node n1=new Node(data);
        if(L==null && R==null){
            L=n1;
            R=n1;
            System.out.println(L.LPTR+" "+L.data+" "+L.RPTR);
            index=index+1;
        }
        else{
            n1.RPTR=L;
            L.LPTR=n1;
            L=n1;
            System.out.println(L.LPTR+" "+L.data+" "+L.RPTR);
            System.out.println(L.RPTR.LPTR+" "+L.RPTR.data+" "+L.RPTR.RPTR);
            index=index+1;
        }
    }

    public void addL(int data){
        Node n2=new Node(data);
        if(L==null && R==null){
            L=n2;
            R=n2;
            index=index+1;
        }
        else{
            Node temp=R;
            temp.RPTR=n2;
            n2.LPTR=temp;
            R=n2;
            index=index+1;
        }
    }
    Scanner sc=new Scanner(System.in);
    public void delete(){
        System.out.print("index:");
            ind=sc.nextInt();
        Node temp=L;
        if(L==null){
            System.out.println("invalid DLL");
        }
        
        if(ind==1){
            L=temp.RPTR;
            temp.RPTR=null;
            index=index-1;
        }
        else if(ind==index){
            R.LPTR.RPTR=null;
            R.LPTR=null;
        }
        else{
        for(int i=2;i<=(ind-1);i++){
            temp=temp.RPTR;
        }
        temp.RPTR=temp.RPTR.RPTR;
        }
    }

    public void display(){
        Node temp=L;
        if(L==null){
            System.out.println("invalid DLL");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.RPTR;
            }
        }
    }
}

public class p55_DLL{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DLL li=new DLL();
        int X=0;

        while(X!=1){
            System.out.print("choice(1.addF,2.addL,3.Delete,4.display,5.exit)");
            int ch=sc.nextInt();
        
        switch(ch){
            case 1: li.addF(sc.nextInt());
                    break;
            case 2: li.addL(sc.nextInt());
                    break;
            case 3: li.delete();
                    break;
            case 4: li.display();
                    break;
            case 5: X=1;
                    break;
        }sc.close();
        }
    }
}