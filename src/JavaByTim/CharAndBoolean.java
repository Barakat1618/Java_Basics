
public class CharAndBoolean {

	public static void main(String[] args) {
		
		//Char has a width of 16 bits ie 2 bytes value
		
		char myCharCaps = 'A';
		char myCharSmall = 'd';
		
		//Char can take unicodes as well, Check the unicode from google \u00A9
		//backslash and u is compulsory before writing unicodes
		char myCharUnicode = '\u00A9';
		System.out.println(myCharUnicode);
		
		boolean myBoolean = true;
		boolean isMale = false;
		
		
		///////Challenge////
		
		char myChallengeUnicode = '\u00AE';
		System.out.println(myChallengeUnicode);
		System.out.println( "\u00A9 + \u00AE");
		System.out.println('a' == 'a');
	}

}
