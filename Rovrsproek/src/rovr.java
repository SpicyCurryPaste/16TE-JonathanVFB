import java.util.ArrayList;
import java.util.Scanner;

public class rovr {
	
	
public static void main(String[] args) {
	String kons = "bcdfghjklmnpqrstvwxz";
	
	char konsonanter[] = kons.toCharArray();
	Scanner scnr = new Scanner (System.in);
	String sentence = scnr.nextLine ();
	int charz = sentence.length();
	char rovr [] = sentence.toCharArray();
	String rovrsentence = "";
	for(int x = 0; x < sentence.length();x++) 
	{
		if (kons.indexOf(sentence.charAt(x))==0){
				String part = Character.toString(rovr[x]) + "o" + Character.toString(rovr[x]);	
		         rovrsentence = sentence + part;
		     
		         System.out.println(rovrsentence);
		       
		}
		
		         
	}




	



	

}
}

