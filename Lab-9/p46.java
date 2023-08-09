class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class demolist{
    Node head;
    public void add(int data){
        Node newnode=new Node(data);
        if(head == null){
            head=newnode;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }    
    }
    public void display(){
        Node n=head;
        if(n==null){
            System.out.println("list is empty.");
        }
        while(n!=null){
            System.out.println(n.data);
                n=n.next;
        }
    }
}


public class p46{
    public static void main(String[] args){
        demolist t=new demolist();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(50);
        t.display();    
    }
}