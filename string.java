package introduction;

public class string {

	public static void main(String[] args) {
		
		String s = "Sagar Dilip Ambre";
		String [] Splittedstring = s.split("Dilip");
		System.out.println(Splittedstring[0]);
		System.out.println(Splittedstring[1]);
		System.out.println(Splittedstring[1].trim());
		
		for (int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		

	}

}
