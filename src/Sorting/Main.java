package Sorting;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer>numbers=new PriorityQueue<>();
numbers.add(4);
numbers.add(2);
numbers.add(1);
System.out.print("priority queue using iterator():");
Iterator<Integer>iterate=numbers.iterator();
while(iterate.hasNext()) {
	System.out.print(iterate.next());
	System.out.print(",");
}
	}

}
