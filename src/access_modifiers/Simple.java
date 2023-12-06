package access_modifiers;
 class A{
	int a=10;  // class variable - default access modifier(visible inside the package)
	private int b=20;
	// private modifier is visible only inside the class
	void display() {
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}
}

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.display();
		System.out.println(obj.a);

	}

}
