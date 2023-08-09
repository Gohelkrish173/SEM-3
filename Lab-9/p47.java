class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next = null;
    }
}

class demolist{
    Node head;
    public void addL(int data){
        Node nnode=new Node(data);
        if(head==null){
            head=nnode;
        }
        else{
        Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }   
        temp.next=nnode;
        }
    }

    public void addF(int data){
        Node nnode=new Node(data);
        nnode.next=head;
        head=nnode;
    }

    public void deleteF(){
        Node x=head;
        head=x.next;
    }

    public void deleteL(){
        
        if(head.next == null){
            head=null;
        }
        else{
            Node x=head;
            while(x.next.next!=null){
                x=x.next;
            }
            x.next=null;
        }
    }

    public void display(){
        Node n=head;
        if(n==null){
            System.out.println("Node is empty");
        }
        while(n!=null){
            System.out.println(n.data);
                n=n.next;
        }
    }
    
}

public class p48{
    public static void main(String[] args){
        demolist l=new demolist();
        l.addL(10);
        l.addL(20);
        l.addF(30);
        l.addF(40);
        l.addL(50);
        l.deleteF();
        l.deleteL();
        l.display();
    }
}