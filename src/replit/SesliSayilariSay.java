package replit;

import java.util.Scanner;

public class SesliSayilariSay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    str.toLowerCase();
	    int count=0;
	    for(int i=0 ; i<str.length() ; i++ ){
	      if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='u'||str.charAt(i)=='o'){
	        count++;
	      }
	    }
	    System.out.println(count);
	    sc.close();
	    
	}

}
