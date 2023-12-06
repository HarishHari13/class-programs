package Sorting;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer>numbers=new LinkedList<>();
numbers.offer(1);
numbers.offer(2);
numbers.offer(3);
System.out.println("queue:"+numbers);
int accessedNumber=numbers.peek();
System.out.println("accessed element:"+accessedNumber);
int removedNumber=numbers.poll();
System.out.println("removed element:"+removedNumber);
System.out.println("updated queue:"+numbers);
	}

}
