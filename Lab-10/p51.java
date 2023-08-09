import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class ListQueue{
    Node head;
    
    public void addF(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }

    public void deleteL(){
        Node temp1=head;
        if(temp1.next==null){
            temp1=null;
        }
        else{
            while(temp1.next.next!=null){
                temp1=temp1.next;
            }
            temp1.next=null;
            if(head.next==null){
                head=null;
            }
        }        
    }
    public void display(){
        Node temp2=head;
        if(temp2==null){
            System.out.println("Invalid queue of LinkList");
        }
        else{
            while(temp2!=null){
                System.out.print(temp2.data+ " ");
                System.out.println();
                temp2=temp2.next;
            }
        }
    }
}

public class p51{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ListQueue l=new ListQueue();
        System.out.println("Queue Of Link List");
        int x=0,x1=0;
                
        while(x!=1){
            System.out.println("1.enqueue,2.dequeue,3.display,4.Exit");
            int ch=sc.nextInt();

            switch(ch){
                case 1: x1=sc.nextInt();
                        l.addF(x1);
                        break;
                case 2: l.deleteL();
                        break;
                case 3: l.display();break;
                case 4: x=1;break;
            }
        }
    }
}