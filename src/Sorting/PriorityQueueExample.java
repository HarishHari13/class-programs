package Sorting;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer>numbers=new PriorityQueue<>();
numbers.offer(5);
numbers.offer(1);
numbers.offer(2);
System.out.println("queue"+numbers);
int accessedNumber=numbers.peek();
System.out.println("accessed element:"+accessedNumber);
int removedNumber=numbers.poll();
System.out.println("removed element:"+removedNumber);
System.out.println("updated queue:"+numbers);
	}

}
