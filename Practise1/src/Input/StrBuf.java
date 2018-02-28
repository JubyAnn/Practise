package Input;


public class StrBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbuff = new StringBuffer("John Doe");
		sbuff.append(" Hello!");
		System.out.println(sbuff);
		
		String str = new String("John Doe");
		//String does not have append option
		System.out.println(str);
		
		StringBuilder sbr = new StringBuilder("Hello !!");
		sbr.append(" John Doe");
		System.out.println(sbr);

	}

}
