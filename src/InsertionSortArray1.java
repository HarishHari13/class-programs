import java.util.Scanner;

public class InsertionSortArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter no of elements: ");
int n= s.nextInt();
int[] arr = new int[n];
System.out.println("enter the elements: ");
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
System.out.println("original array: ");
printArray(arr);
for(int i=1;i<n;i++) {
	int key = arr[i];
	int j =i-1;
	while(j>=0 && arr[j]>key){
		arr[j+1] = arr[j];
		j--;
	}
	arr[j+1] = key;
}
System.out.println("sorted array: ");
printArray(arr);
	}
	static void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

}
