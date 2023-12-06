import java.util.NoSuchElementException;
import java.util.Scanner;

public class Node {
	protected int data;
	protected Node link;
	public Node() {
		link=null;
		data=0;
		}
	public Node(int d,Node n) {
	data=d;
	link=n;
	}
   public void setLink(Node n) {
	link=n;
}
   public void setData(int d) {
	   data=d;
   }
   public Node getLink() {
	   return link;
   }
   public int getData() {
	   return data;
   }
   class linkedStack
   {
	   protected Node top;
	   protected int size;
	   public linkedStack() {
		   top=null;
		   size=0;
	   }
	   public boolean isEmpty() {
		   return top==null;
	   }
	   public int getSize() {
		   return size;
	   }
	   public void push(int data) {
		   Node nptr=new Node(data,null);
		   if(top==null)
			   top=nptr;
		   else
		   {
			   nptr.setLink(top);
			   top=nptr;
		   }
		   size++;
	   }
	   public int pop() {
		   if(isEmpty())
			   throw new NoSuchElementException("underflow exception");
		   Node ptr=top;
		   top=ptr.getLink();
		   size--;
		   return ptr.getData();
	   }		   
	  public int peek() {
		  if(isEmpty())
			  throw new NoSuchElementException("underflow exception");
		  return top.getData();
	  }
	  public void display() {
		  System.out.print("\nstack = ");
		  if(size==0) {
			  System.out.print("empty\n");
			  return;
		  }
		  Node ptr=top;
		  while(ptr !=null) {
			  System.out.print(ptr.getData()+" ");
			  ptr=ptr.getLink();
			  }
		  System.out.println();
	  }
   }
   public class LinkedStackImplement{
	   
   public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
linkedStack ls=new linkedStack();
System.out.println("linked stack test\n");
char ch;
do
{
	System.out.println("\nlinked stack operations");
}
   }
   }
}

   
