import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("no of elements: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("enter the elements: ");
for(int i=0;i<n;i++) {
	arr[i] =s.nextInt();
	}
System.out.println("enter element you want to find: ");
int pos = -1;
int key =s.nextInt();
for(int i=0;i<n;i++) {
	if(arr[i] == key) {
		pos = i+1;
		break;
	}
}
if(pos != -1) {
	System.out.println("found at position:" +pos);
}else {
	System.out.println("not found:");
}
	}

}
