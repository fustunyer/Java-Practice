package day04;

import java.util.Scanner;

public class SessizHarf {

	public static void main(String[] args) {
	     
      Scanner scan = new Scanner(System.in);
      String harf1=scan.nextLine();
      harf1=harf1.toLowerCase();
		
		
		if(harf1.length()<2&&harf1.charAt(0)>='a'&&harf1.charAt(0)<='z') {
        	if(harf1.charAt(0)=='a'||harf1.charAt(0)=='e'||harf1.charAt(0)=='o'||harf1.charAt(0)=='u'||harf1.charAt(0)=='i' ){
        		System.out.println(harf1+" harfi sesli harfdir.");
        	}else {
        		System.out.println(harf1+" harfi sesiz harftir.");
        	}  	
        
        }else {
        	System.out.println("Yanlis karakter girdiniz!");
        }
		scan.close();
        	

}

}



