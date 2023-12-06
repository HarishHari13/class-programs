
public class ExampleSmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = new int[] {9,8,3,5,1,7,12};
int min =
0;
int max =0;
for(int i=0;i<arr.length;i++)
{
	if  (i==0) {
		min=arr[i];
		max=arr[i];
	}
	if(arr[i]<min)
		min=arr[i];
	
if(arr[i]>max)
	max=arr[i];
}
System.out.println("smallest element present in given array:"+min);
System.out.println("largest element present in given array:"+max);
	}

}

