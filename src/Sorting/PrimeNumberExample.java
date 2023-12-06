package Sorting;

public class PrimeNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {8,7,9,5,3,6,12,25,99,76,53,21,1,2};
for(int i=0;i<arr.length;i++) {
	boolean isPrime=true;
	for(int j=2;j<arr[i];j++) {
		if(arr[i]%j==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime)
		System.out.print(arr[i]+" ");
				}
}

}
 