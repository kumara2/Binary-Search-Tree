package enumateNumbers;
import java.util.*;
public class Enumerate {
	public List<Double> findSequence(int k) {
		List<Double> enumeration = new ArrayList<Double>();
		Queue<Number> q1 = new LinkedList<Number>();
		Queue<Number> q2 = new LinkedList<Number>();
		q1.add(new Number(0,0));
		for(int i = 0; i < k; i++) {
			Number first = q1.peek();
			Number two = q2.size() == 0 ? null : q2.peek();
			if(two == null || first.compareTo(two) < 0) {
				enumeration.add(first.val);
				q1.poll();
				q1.add(new Number(first.a + 1, first.b));
				q2.add(new Number(first.a , first.b+1));				
			} else {
				enumeration.add(two.val);
				q2.poll();
				//q1.add(new Number(first.a + 1, first.b));
				q2.add(new Number(two.a , two.b+1));
			}
		}
		return enumeration;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> sol = new Enumerate().findSequence(10);
		System.out.println(sol);
	}

}
