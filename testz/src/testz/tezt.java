package testz;
import java.util.Scanner;
public class tezt {
	static char nyckel[] = new char[26];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int bytut = in.nextInt();
		String bytuttill = in.nextLine();
		nyckel[bytut] = bytuttill.charAt(1);	
		
		
		
	}
}
