package may13;

import java.util.ArrayList;

public class Addinteger {

	public static void main(String[] args) {
		ArrayList<Integer> n= new ArrayList<Integer>();
		n.add(5);
		n.add(6);
		n.add(7);
		n.add(10);
		n.add(111);
		for(Integer numbers:n)
			System.out.println(numbers);
		
		ArrayList<Integer> m= new ArrayList<Integer>();
		m.add(7);
		m.add(10);
		m.add(5);
		
		m.addAll(n);
		System.out.println(m);
	}

}
