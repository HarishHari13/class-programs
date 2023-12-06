import java.util.Stack;

public class TopFromStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String>stk=new Stack<>();
stk.push("Apple");
stk.push("Grapes");
stk.push("Mango");
stk.push("Orange");
System.out.println("stack: "+stk);
String fruits=stk.peek();
System.out.println("element at top:"+fruits);
	}

}
