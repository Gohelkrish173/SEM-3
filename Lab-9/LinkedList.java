class Node{
	int data;
	Node next;
}
class LList{
 	Node head;
 		public void insert(int data){
 			Node node =new Node();
 			node.data=data;
 				if (head==null) {
 					head=node;
 				}
 				else{
 					Node n=head;
 					while(n.next!=null){
 						n=n.next;
 					}
 					n.next=node;
 				}
 		}
 		public void show(){
 			Node node=head;
 				while(node.next!=null){
 					System.out.println(node.data);	
 					node=node.next;
 				}
			System.out.println(node.data);
 		}
 		public void insertAtHead(int data){
 			Node node =new Node();
 			node.data= data;
 			node.next=head;
 			head=node;
 		}
 		public void addAt(int index,int data){
 			Node node =new Node();
 			node.data= data;
 			Node n=head;
 			if (index==0){
 				insertAtHead(data);
 			}
 			else{
 			 	for(int i=0;i<index-1;i++) {
 			 		n=n.next;
 			 	}
 			 	node.next=n.next;
 				n.next=node;
 			}
 		}
 		public void deleteAt(int index){
 			if(index==0){
 				head=head.next;
 			}
 			else{
 				Node n=head;
 				Node remove=null;
 				for (int i=1;i<index-1 ;i++ ) {
 					n=n.next;
 				}
 				remove=n.next;
 				n.next=remove.next;
 				remove=null;
 			}
 		}
 	}
public class LinkedList{
	public static void main(String[] args) {
		LList li=new LList();
		li.insert(1);
		li.insert(3);
		li.insert(7);
		li.insert(10);
		li.insert(2);
        li.insertAtHead(5000);
		li.show();
	}
}