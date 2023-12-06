import java.util.Scanner;

public class FindtheValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner s = new Scanner(System.in);
System.out.println("enter the no of elements:");
n=s.nextInt();
int[] arr=new int[n];
System.out.println("enter the array of elements:");
for(int i=0;i<n;i++)
	arr[i]=s.nextInt();
System.out.println("enter the elements you want to find:");
int e=s.nextInt();
for(int i=0;i<n;i++)
	if(arr[i]==e)
		System.out.println("element found at position:"+i);
	}

}
