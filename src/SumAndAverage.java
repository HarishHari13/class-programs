import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter no of elements: ");
int n =s.nextInt();
int[] arr = new int[n];
System.out.println("enter all the elements: ");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	}
int sum = 0;
for(int i=0;i<n;i++) {
	sum+= arr[i];
}
 double average = (double) sum/n;
System.out.println("sum: " +sum);
System.out.println("average: " +average);
	}

}
