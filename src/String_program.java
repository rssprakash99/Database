
public class String_program {
	public static void main(String args[])
	{
	String str = "madam";
	StringBuilder str1 = new StringBuilder(str);
	System.out.println(str1.reverse());
	
	String strR = "Prakash";
	StringBuffer str2 = new StringBuffer(strR);
	System.out.println(str2.reverse());
	
	
	String str3 = "Garapati Puja";
	for (int i = (str3.length() - 1); i >= 0; i--) {
		System.out.print(str3.charAt(i));
		}
	
	System.out.print("\n");
	String s2 = "helloThisIsA1234Sample";
	s2 = s2.replaceAll("\\d","");
	System.out.println("Only String : "+s2);

}
}
