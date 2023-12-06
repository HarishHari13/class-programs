import java.util.Stack;

public class Splitting {
	static void reversePrint(Stack<Integer>s) {
	if(s.isEmpty())
		return;
	int x = s.peek();
	s.pop();
	System.out.print(x+" ");
	reversePrint(s);
	s.push(x);
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer>st=new Stack<Integer>();
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.push(50);
System.out.println("stack elements in forward: ");
System.out.println(st);
System.out.println("stack elements in reverse: ");
reversePrint(st);
System.out.println();
System.out.println(st);
	}

}
