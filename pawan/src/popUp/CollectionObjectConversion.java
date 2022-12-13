package popUp;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionObjectConversion {

	public static void main(String[] args)
	{
	
		
		HashSet<Object>hs =new HashSet<>();
		
		hs.add("Pune");
		hs.add("Pune");
		hs.add(1);
		hs.add(2);
		
		System.out.println(hs);
 
		
		//set--------->list
		
		ArrayList<Object>al=new ArrayList<>(hs);
		
		System.out.println(al);
		
		
		System.out.println(al.get(2));
		
		
		

	}

}
