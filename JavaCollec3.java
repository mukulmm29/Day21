import java.util.LinkedList;
import java.util.Stack;
public class JavaCollec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> m = new LinkedList<>();
		m.add(210);
		m.add(220);
		m.add(230);
		m.add(240);
		m.add(250);
		m.add(260);
		System.out.println(m);
		m.addFirst(200);
		System.out.println(m);
		m.addLast(500);
		System.out.println(m);
		m.set(6, 90);
		System.out.println(m);

	}

}
