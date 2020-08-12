package replit;

import java.util.Scanner;

public class IsItTheSame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    String str1=input.nextLine();
	    String str2=input.nextLine();
	    
	    boolean isSame=str1.equals(str2);
	    
	    System.out.println(isSame);
	    
	    input.close();

	}

}
