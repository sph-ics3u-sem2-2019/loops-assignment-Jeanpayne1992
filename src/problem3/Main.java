package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		String x=in.nextLine();
		for(int counter=0;counter<x.length();counter+=1) {
			System.out.println(x.charAt(counter));
		}


	}

}
