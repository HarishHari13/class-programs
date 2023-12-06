package Sorting;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {8,7,9,5,2,6};
int t;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
		t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
		}
	
	}
	System.out.print(arr[i]+" ");
}


	}

}
