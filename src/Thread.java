
public class Thread {
	public static void operation1(int num) {
		int  num1=num;
		int rev=0;
		while(num1 !=0) {
			int rem=num1%10;
			num1 /= 10;
			rev = rev*10+rem;
		}
		if(num==rev) {
			System.out.println(num +"is a palindrome no");
			}else {
				System.out.println(num +"not a palindrome no");
			}
	}
	public static void operation2(int nums) {
		int countr=0;
		if(nums==2) {
			System.out.println(nums +"is a prime no");
		}else {
			System.out.println(nums +"not a prime no");
		}
		
	}

	class Thread1 extends Thread{
		public void run() {
			Thread.operation1(212);
		}
	}
	class Thread2 extends Thread{
		public void run() {
			Thread.operation2(23);
		}
	}

public class ThreadExecution{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 operation1 = new Thread1();
Thread2 operation2 = new Thread2();
operation1.run();
operation2.run();

	}
}
