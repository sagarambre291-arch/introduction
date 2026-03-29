package introduction;

public class metchods {

	public static void main(String[] args) {
		
		metchods a= new metchods();
		String name = a.getData();
		System.out.println(name);
		method2access d = new method2access();
		d.getuserData();
		getData2();
		//System.out.println(d.getuserData());
		

	} 
	
	
	public String getData()
	{
		System.out.println("Hello world");
		return "Sagar ambre";
		
	}
	

	public static String getData2()
	{
		System.out.println("Hello world");
		return "Sagar ambre";
		
	}

	
}
	
	
	//public void getData()
	//{
	//	System.out.println("Hello world");
		
	//}


