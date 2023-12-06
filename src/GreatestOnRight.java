import java.util.Scanner;

public class GreatestOnRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter no of elemnts: ");
int n =s.nextInt();
int[] arr = new int[n];
System.out.println("enter the elements: ");
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
int max = arr[n-1];
arr[n-1] = 0;
for(int i=n-2;i>=0;i--) {
	int temp =arr[i];
	arr[i] = max;
	if(temp>max) {
		max = temp;
	}
}
System.out.println("after replacing: ");
for(int num:arr) {
	System.out.println(num +" ");
}
	}

}
