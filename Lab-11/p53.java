import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class CLL {
    Node head;
    Node tail;
    int index = 0;
    Scanner sc = new Scanner(System.in);

    public void addF(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
            tail = n1;
            index = index + 1;
        } else {
            n1.next = head;
            head = n1;
            System.out.println(head.data + "  " + head.next);
            index = index + 1;
        }
    }

    public void addL(int data) {
        Node n2 = new Node(data);
        if (head == null) {
            head=n2;
            tail=n2;
            index = index + 1;
        } else {
            tail.next = n2;
            n2.next = head;
            tail = n2;
        }
    }

    public void delete() {
        System.out.println("Index:"+index);
        System.out.println("Enter Index:");
        int ind = sc.nextInt();
        Node temp = head;
        
        if(ind==index){
            for(int j=1;j<(ind-1);j++){
                temp=temp.next;
            }}        
            System.out.println(tail.data);
            tail=temp;
            tail.next=head;
            
        for (int i = 1; i < (ind); i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
        temp.next = temp.next.next;
        index=index-1;
    }

    public void display() {
        if (head == null && tail == null) {
            System.out.println("Invalid Circular Link List");
        } else {
            Node temp = head;
            while (temp != tail.next) {
                System.out.println();
                System.out.print("Link List:" + temp.data + ",");
                temp = temp.next;
            }
        }
    }
}

public class p53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLL li = new CLL();
        int X = 0;
        int data = 0;

        while (X != 1) {
            System.out.print("choice:(1.AddF,2.AddL,3.Delete,4.display,5.exit):");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("data:");
                    data = sc.nextInt();
                    li.addF(data);
                    break;

                case 2:
                    System.out.println("data:");
                    data = sc.nextInt();
                    li.addL(data);
                    break;

                case 3:
                    li.delete();
                    break;

                case 4:
                    li.display();
                    break;

                case 5:
                    X = 1;
            }
        }
    }
}