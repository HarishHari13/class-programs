package access_modifiers;

public class File1 {
    public int a=10;  // class variable
	private int b=20;
	// private modifier is visible only inside the class
	public void display() {
		System.out.println("a ="+a);
		System.out.println("b ="+b);
}
}
//public - visible to the world
//protected - visible to same package and sub package
//default - visible inside the package
//private - visible only inside the class