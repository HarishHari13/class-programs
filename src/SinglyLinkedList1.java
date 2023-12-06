

public class SinglyLinkedList1 {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		}
			public Node head=null;
			public Node tail=null;
			void addNode(int data) {
				Node newNode = new Node(data);
				if(head==null) {
					head=newNode;
					tail=newNode;
				}
				else {
					tail.next=newNode;
					tail=newNode;
				}
			}
			void addBeginning(int data) {
				Node newNode = new Node(data);
				if(head==null) {
					head=newNode;
					tail=newNode;
				}
				else {
					newNode.next=head;
					head=newNode;
				}
			}
			void addLast(int data) {
				Node newNode=new Node(data);
				if(head==null) {
					head=newNode;
					tail=newNode;
					}
				else {
					tail.next=newNode;
					}
				tail=newNode;
			}
			
			void deleteFront() {
				if(this.head!=null) {
					Node temp=this.head;
					this.head=this.head.next;
					temp=null;
				}
			}
			void deleteBack() {
				if(head==null) {
					return;
				}
				else {
					if(head!=tail) {
						Node current=head;
						while(current.next!=tail) {
							current=current.next;
							}
						tail=current;
						tail.next=null;
					}
					else {
						head=tail=null;
					}
				}
			}

			public void display() {
				Node current=head;
				if(head==null) {
					System.out.println("linked list is empty");
				}
				else {
					System.out.println("singly linked list elements are: ");
					while(current!=null) {
						System.out.print(current.data+" ");
						current=current.next;
					}
				}
			}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	SinglyLinkedList1 sll = new SinglyLinkedList1();
	sll.addNode(2);
	sll.addNode(4);
	sll.addBeginning(6);
	sll.addLast(10);
	sll.addNode(12);
	sll.display();
	sll.deleteFront();
	sll.display();
	sll.deleteBack();
	sll.display();

	
		}

	}


			
