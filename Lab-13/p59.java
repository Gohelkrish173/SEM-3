import java.util.*;
import java.util.*;

class Node {
    int info;
    Node LPTR;
    Node RPTR;

    Node(int data) {
        this.info = data;
        this.LPTR = null;
        this.RPTR = null;
    }
}

class BST {
    Scanner sc=new Scanner(System.in);
    Node root = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        } else {
            Node child = root;
            Node parent = child;

            while (true) {
                parent = child;
                if (data < child.info) {
                    child = child.LPTR;
                    if (child == null) {
                        parent.LPTR = newNode;
                        // if(data<parent.info){parent.LPTR = newNode;}
                        // else{parent.RPTR=newNode;}
                        System.out.println("parent data " + parent.info);
                        System.out.println("L-child data " + parent.LPTR.info);
                        break;
                    }
                } else if (data > child.info) {
                    child = child.RPTR;
                    if (child == null) {
                        parent.RPTR = newNode;
                        System.out.println("parent data " + parent.info);
                        System.out.println("R-child data " + parent.RPTR.info);
                        break;
                    }
                } else {
                    System.out.println("Already exist");
                }
            }
        }
    }

        public void delete(int d_ele){

        if(root.LPTR == null && root.RPTR==null){
            root=null;
            return;
        }   
    
        else{
            Node current = root;
            Node parent = current;
            
                if(d_ele == current.info){
                    Node temp2=current.RPTR;System.out.println("temp 2: "+temp2.info);
                    Node temp1=current.LPTR;System.out.println("temp 1: "+temp1.info);

                    root=temp2;
                    parent=root;
                    current=parent;
                    if(current.LPTR == null){current.LPTR=temp1;System.out.println("current :"+current.info);
                    System.out.println("parent:"+parent.info);}
                    else{current=current.LPTR;
                    System.out.println("current :"+current.info);
                    System.out.println("parent:"+parent.info);
                    }    
                }

                Node curr=root;
                Node pare=curr;

            while(true){
                if(d_ele<pare.info){
                    curr=curr.LPTR;
                    if(d_ele==curr.info){
                        Node temp1 = curr.LPTR;
                        Node temp2= curr.RPTR;
                        
                        pare.LPTR=temp2;
                        curr=pare;
                        curr.LPTR=temp1;
                        System.out.println("current:"+current.info);
                        System.out.println("parent:"+parent.info);
                        break;                       
                    }
                    else{
                        pare=pare.LPTR;
                    }
                }
                else if(d_ele>pare.info){
                    curr=curr.RPTR;
                    if(d_ele==curr.info){
                        Node temp2 = curr.LPTR;
                        Node temp1= curr.RPTR;
                        
                        pare.RPTR=temp2;
                        curr=pare;
                        curr.RPTR=temp1;
                        System.out.println("current:"+current.info);
                        System.out.println("parent:"+parent.info);
                        break;                       
                    }
                    else{
                        pare=pare.RPTR;
                    }
                }
            }
        }
    }


    public void preorder(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.print(temp.info+", ");
        preorder(temp.LPTR);
        preorder(temp.RPTR);
    }

    public void inorder(Node temp){
        if(temp == null){
            return;
        }
        inorder(temp.LPTR);
        System.out.println(temp.info+",");
        inorder(temp.RPTR);
    }

    public void postorder(Node temp){
        if(temp == null){
            return;
        }
        postorder(temp.LPTR);
        postorder(temp.RPTR);
        System.out.println(temp.info+",");
    }
}


public class p59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        BST t = new BST();
        int d_ele;

        while (X != 1) {
            System.out.print("Enter Your Choice(1.insert,2.delete,3.pre-order,4.in-order,5.post-order,6.exit)");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    int n = sc.nextInt();
                    t.insert(n);
                    break;
                case 2:
                    d_ele=sc.nextInt();
                    t.delete(d_ele);
                    break;
                case 3:
                    t.preorder(t.root);
                    break;
                case 4:
                    t.inorder(t.root);
                    break;
                case 5:
                    t.postorder(t.root);
                    break;
                case 6:
                    X=1;
            }
        }
    }
}