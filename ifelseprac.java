package introduction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ifelseprac {

	public static void main(String[] args) {
		
		int[] arr = {0,1,4,6,9};
		
		for (int i=0; i<arr.length; i++)//
		{
			if(arr[i] % 2==0)
			{
				System.out.println(arr[i] + "Multiple of 2");
				//break; // this is give to get the multiple of 2 thats it
			}
			else
			{
				System.out.println(arr[i] + "Not a multiple of 2");
			}
			
			ArrayList<String> a = new ArrayList<String>();
			
			a.add("sagar");
			a.add("ambre");
			//a.remove(1);
			System.out.println(a.get(1));
			
			for (int c=0; c<a.size(); c++)
			{
				System.out.println(a.get(c));
			}
			
			for (String val:a)
			{
				System.out.println(val);
			}
			
		System.out.println("#####");
			
			List<Integer> dynamic = new ArrayList<Integer>();
			
			dynamic.add(0);
			dynamic.add(1);
			dynamic.add(4);
			dynamic.add(6);
			dynamic.add(9);
			
			for (int d = 0; d<dynamic.size(); d++)
			{
				if (dynamic.get(d) % 2 == 0)
				{
					System.out.println(dynamic.get(1)+ "Multiple of 2");
				}
				
				
			}
			
			String[] name = {"sagar", "you", "can"};
			List<String> nameArrayList = Arrays.asList(name);

			System.out.println(nameArrayList.contains("can"));
			
			
		}

	}
	
}