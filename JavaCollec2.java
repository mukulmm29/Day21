import java.util.Stack;
public class JavaCollec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> m = new Stack<>();
		m.add("Hi");
		m.add("bro");
		m.add("Welcome");
		m.add("Mukul");
		m.add("Mayacharya");
		
		System.out.println(m);
		m.pop();
		m.pop();
		
		System.out.println(m);
		m.peek();
		
		System.out.println(m);
	}

}
