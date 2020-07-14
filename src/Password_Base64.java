import java.util.Base64;

public class Password_Base64 {

	public static void main(String[] args) {
		String sample = "prakashsmart99";
		 System.out.println("Sample String:\n" + sample);
	 
		 // logic to encode the given password......
		 String BasicBase64format  = Base64.getEncoder().encodeToString(sample.getBytes()); 

		 System.out.println("Encoded String:\n" + BasicBase64format);
	//cHJha2FzaHNtYXJ0OTk=    encoded string
		 
		 // logic to decode the given string.....
		 String encoded = "cHJha2FzaHNtYXJ0OTk="; 
		 System.out.println("Encoded String:\n" + encoded); 
		 byte[] actualByte = Base64.getDecoder() .decode(encoded); 
		 String actualString = new String(actualByte);
		 System.out.println("actual String:\n" + actualString);
	}

}
