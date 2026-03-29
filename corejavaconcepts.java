package introduction;

public class corejavaconcepts {

	public static void main(String[] args) {
		
		int myNumb=44;
		System.out.printf(myNumb + "My NUmber");
		
		//Arrays
		
		int[] arr = {0,1,4,7,9};
		
		System.out.println(arr[2]);
		
		//for loop
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		String [] name = {"sagar","ambre"};
		
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for (String s:name)
		{
			System.out.println(s);
		}
		
		for (int a:arr)
		{
			System.out.println(a);
		}
		

	}

}
