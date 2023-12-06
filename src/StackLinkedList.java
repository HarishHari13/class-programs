import java.util.Scanner;
import java.util.Stack;

public class StackLinkedList {
	static void reversePrint(Stack<Integer>st) {
		if(st.isEmpty())
			return;
		int x=st.peek();
		st.pop();
		System.out.println(x+"");
		reversePrint(st);
		st.push(x);
	}
       public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer>sta=new Stack<Integer>();
		 Scanner s = new Scanner(System.in);
        System.out.println("Linked Stack Test\n");          
        char ch;
        do
        {
            System.out.println("\nLinked Stack Operations\n");
            System.out.println("1. push");
            System.out.println("2. pop ");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = s.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
                sta.push( s.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Pop Element: ");
                sta.pop(); 
                break;                         
            case 3 : 
                System.out.println("Peek Element: ");
                sta.peek();
                break;                                          
            case 4 : 
                System.out.println("Empty status = "+ sta.isEmpty());
                break;                   
            case 5 : 
                System.out.println("Size = "+ sta.size() +" \n");
                break;  
                                
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            System.out.println(sta);

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch =s.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');   
        s.close();
	}

}
