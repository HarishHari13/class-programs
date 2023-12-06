import java.util.EmptyStackException;
import java.util.Stack;

public class StackPushPopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer>stk=new Stack<>();
System.out.println("stack:" +stk);
pushelmnt(stk,20);
pushelmnt(stk,13);
pushelmnt(stk,89);
pushelmnt(stk,90);
pushelmnt(stk,11);
pushelmnt(stk,45);
pushelmnt(stk,18);
popelmnt(stk);
popelmnt(stk);
try
{
	popelmnt(stk);
	}
catch(EmptyStackException e)
{
	System.out.println("empty stack");
	}
	}
	static void pushelmnt(Stack stk,int x)
 	{
		stk.push(new Integer(x));
		System.out.println("push->"+x);
		System.out.println("stack:"+stk);
		}
	static void popelmnt(Stack stk) {
		System.out.println("pop->");
		Integer x = (Integer)stk.pop();
		System.out.println(x);
		System.out.println("stack:"+stk);
	}

}
