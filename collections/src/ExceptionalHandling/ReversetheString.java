package ExceptionalHandling;

public class ReversetheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Raguram");
		
		sb.reverse(); // Only to reverse the string
		
		//Palindrome or not 
		
		String name = "RAGU";
		
		String c = "" ;
		
		for(int i =name.length()-1;i>=0;i--)
		{
			
		c = c+ name.charAt(i) ;
		//1 - A
		//2 - AD
		//3-ADD
		//4-ADDA
		
		}	
		
		if(c.equals(name))
		{
			System.out.println("Given String is Palindrome");
		}
		
		else
		{
			System.out.println("Given String is not Palindrome");
	}

}
}
