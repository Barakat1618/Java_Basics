
public class StringReverse {

	public static void main(String[] args) {

String word = "bar/kat";		
String reverse ="";
String[] array = word.split("/");



System.out.println(array[0]);
System.out.println(array[1]);

System.out.println(word.indexOf('a'));

for(int i=word.length()-1; i>=0; i--) {
	reverse = reverse + word.charAt(i);
}

System.out.println(reverse);		


StringBuilder sb = new StringBuilder("barkat");

System.out.println(sb.reverse());

	}

}
