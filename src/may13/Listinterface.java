package may13;

import java.util.ArrayList;
import java.util.Iterator;

public class Listinterface {

	public static void main(String[] args) {
		
		ArrayList<Integer> li= new ArrayList<Integer>();
		
		li.add(1);
		
		li.add(10);
		li.add(33);
		li.add(22);
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Integer number:li)
		System.out.println(number);

	}

}
