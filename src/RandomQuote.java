import java.util.Random;

public class RandomQuote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr= {"one","two","three","four","five"};
Random random = new Random();
int c=random.nextInt(arr.length);
System.out.println(arr[c]);
}
	}


