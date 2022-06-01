package may13;

public class Arraylist {

	public static void main(String[] args) {
		
		int Ac[] = new int[3];
		Ac[0]=12;
		Ac[1]=101;
		Ac[2]=121;
		
		for (int i=0; i<Ac.length; i++)
		{
			System.out.println("this array contains numbers:" +Ac[i]);
		}
		
		//second type of initialization
		String a[]= { "apple","mango", "banana"};
		for(int j=0; j<a.length; j++) {
			System.out.println("this array contains fruit names:"+a[j]);
		}
		//for each loop
		for(String k:a)
			System.out.println("this array using for each loop:"+k);
}
}