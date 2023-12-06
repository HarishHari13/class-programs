
public class CircularLinkedList {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			}
	}
	public Node head=null;
	public Node tail=null;
	public void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}
		else {
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("list is empty");
			return;
			}
		else {
			System.out.println("node of the circular linked list: ");
			do {
				System.out.println(""+current.data);
				current=current.next;
			}
			while(current!=head);
			System.out.println();
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cl = new CircularLinkedList();
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.display();
		

	}

}
