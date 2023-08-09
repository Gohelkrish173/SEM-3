import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkList{
    Node head;
    public void AddF(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    
    public void deleteF(){
        Node n=head;
        head=n.next;
    }

    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("invalid stack of linklist");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
}

public class p50{
    public static void main(String[] args){
        LinkList l=new LinkList();
        Scanner sc=new Scanner(System.in);
        System.out.println("stack of linklist");
        int x=0;
        
        while(x!=1){
            System.out.println("1.push,2.pop,3.exit");
            int ch=sc.nextInt();
            
            switch(ch){
                case 1:int x1=sc.nextInt();
                        l.AddF(x1);
                        break;
                case 2:l.deleteF();
                        break;
                case 3:l.display();break;
                case 4:x=1;break;
            }
        }
    }
}