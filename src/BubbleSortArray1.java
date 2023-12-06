import java.util.Scanner;

public class BubbleSortArray1 {

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
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
