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
    Node head;
    int index=0;
    int ind=0;
    public void addF(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            System.out.println(head.LPTR+" "+head.data+" "+head.RPTR);
            index=index+1;
        }
        else{
            n1.RPTR=head;
            head.LPTR=n1;
            head=n1;
            System.out.println(head.LPTR+" "+head.data+" "+head.RPTR);
            System.out.println(head.RPTR.LPTR+" "+head.RPTR.data+" "+head.RPTR.RPTR);
            index=index+1;
        }
    }

    public void addL(int data){
        Node n2=new Node(data);
        if(head==null){
            head=n2;
            index=index+1;
        }
        else{
            Node temp=head;
            while(temp!=null){
                temp=temp.RPTR;
            }
            n2.LPTR=temp;
            temp.RPTR=n2;
            index=index+1;
        }
    }
    Scanner sc=new Scanner(System.in);
    public void delete(){
        System.out.print("index:");
            ind=sc.nextInt();
        Node temp=head;
        if(head==null){
            System.out.println("invalid DLL");
        }
        
        if(ind==1){
            head=temp.RPTR;
            temp.RPTR=null;
        }
        else if(ind==index){
            for(int j=0;j<(ind-1);j++){
                temp=temp.RPTR;
            }
            temp.RPTR=null;
        }
        else{
        for(int i=2;i<=(ind-1);i++){
            temp=temp.RPTR;
        }
        temp.RPTR=temp.RPTR.RPTR;
        }
    }

    public void display(){
        Node temp=head;
        if(head==null){
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

public class p55_1{
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
        }
        }
    }
}