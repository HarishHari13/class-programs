import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackSearchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String>stk=new Stack<>();
System.out.println(stk.isEmpty());
stk.push("MAC BOOK");
stk.push("HP");
stk.push("dell");
stk.push("ASUS");
stk.push("Linux");
System.out.println("stack:"+stk);
int location=stk.search("HP");
System.out.println(stk.search("test"));
System.out.println("location of dell: "+location);
System.out.println("size of the stack: "+stk.size());
Iterator iterator=stk.iterator();
while(iterator.hasNext())
{
	Object values=iterator.next();
	System.out.println(values);
	}
System.out.println("\nFor Each: ");
stk.forEach(n->System.out.println(n));    //Java 8
ListIterator<String>ListIterator=stk.listIterator(stk.size());
System.out.println("\nIteration over the stack from top to" +"bottom:");
while(ListIterator.hasPrevious())
{
	String avg=ListIterator.previous();
	System.out.println(avg);
}
	}

}
