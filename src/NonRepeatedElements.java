import java.util.Scanner;

public class NonRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter array size: ");
int n =s.nextInt();
int[] arr =new int[n];
System.out.println("enter array elements: ");
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
	}
System.out.println("non repeated elements are: ");
boolean repeated;
for(int i=0;i<n;i++) {
	repeated = false;
	for(int j=0;j<n;j++) {
		if(i !=j && arr[i] == arr[j]) {
			repeated = true;
			break;
			}
	}
	if(!repeated) {
		System.out.println(arr[i]);
	}
}
		
	
	}

}
