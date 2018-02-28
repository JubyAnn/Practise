
package Input;

import java.util.*;

public class Reverse {
	
	public void print(String data)
	{
		System.out.println("Original String =" +data);
	}
	
/*	public void Reverse(String data)
	{    
		System.out.print("Reverse String =");
		for(int i=(data.length()-1);i>=0;i--)
		{
			System.out.print(data.charAt(i));
		}
	}*/
	
	public void palindrome(String data1)
	{
		String Reverse= "";
	 for(int i=(data1.length()-1);i>=0;i--)
	 {
		 Reverse = Reverse + data1.charAt(i);
	 }
	// System.out.println("Reverse =" +Reverse);	
	 if(data1.equalsIgnoreCase(Reverse))
	 {
		 System.out.println("Palindrome");
	 }
	 else
	 {
		 System.out.println("Not a Palindrome"); 
	 }
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String data = "ReverseString";
		//String data = "Malayalam is Cool";
		String data = "Malayalam";
		Reverse rev = new Reverse();
		rev.print(data);
		//rev.Reverse(data);
		rev.palindrome(data);
		
		

	}

}
