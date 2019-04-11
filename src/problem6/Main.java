package problem6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a name, and print out the box
		/*
		 * Example input: Zebarth
		 * Output:
		 * Zebarth
		 * ebarthZ
		 * barthZe
		 * arthZeb
		 * rthZeba
		 * thZebar
		 * hZebart
		 */
		Scanner in=new Scanner(System.in);
		String word=in.nextLine();
		for (int x=0;x<word.length();x++) {
			System.out.println(word.substring(x)+word.substring(0, x));
		}
	}

}
