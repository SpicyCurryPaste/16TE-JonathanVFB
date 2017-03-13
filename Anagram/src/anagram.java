import java.util.ArrayList;
import java.util.Scanner;

public class anagram {

public static void main(String[] args) {


Scanner scnr = new Scanner (System.in);

String input = scnr.nextLine ();

ArrayList<Character> chars = new ArrayList<Character>();
for (char c : input.toCharArray()) {
chars.add(c);
}
String newString = new String();

while(!chars.isEmpty()){
int i = (int) (Math.random()*chars.size());
newString += Character.toString(chars.get(i));
chars.remove(i);
	
}
System.out.println();
System.out.println(newString);

}
}
