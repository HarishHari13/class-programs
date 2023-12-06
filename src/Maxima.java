import java.util.Scanner;

public class Maxima {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Size: ");
			
			int n=s.nextInt();
			
			System.out.println("Enter Numbers: ");
			int arr[] = new int[n];
			
			for(int i=0; i<n;i++) {
				arr[i] = s.nextInt();
			}
			int max = arr[0];
		
			  for (int i = 0; i < arr.length; i++) {  
		             
		           if(arr[i] > max)  
		               max = arr[i];  
		        }  
			  
			   System.out.println("Largest element: " + max); 
}
}