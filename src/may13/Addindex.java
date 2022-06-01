package may13;

import java.util.ArrayList;
import java.util.Iterator;

public class Addindex {

	public static void main(String[] args) {
		
		ArrayList<String> li= new ArrayList<String>();
		
		li.add("mom");
		
		li.add("dad");
		li.add("bro");
		li.add("sissy");
		li.add("elder brother");
		li.add("elder sister");
		
		System.out.println("-----------list displaying---------");

		for(String name:li)
		System.out.println(name);
		System.out.println("----------------------");
		li.add(3,"abcd");
		System.out.println("-----------------------");
		li.get(4);
		System.out.println("name we have to replace:"+li.get(4));
		li.set(4, "elder sister");
		System.out.println("------------"+ li.get(3));
		for(String name:li)
		System.out.println(name);
			

	}

	}
