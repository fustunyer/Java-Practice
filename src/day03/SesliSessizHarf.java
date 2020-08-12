package day03;

import java.util.Scanner;

public class SesliSessizHarf {


		public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        String harf1 = in.nextLine();
	        if(harf1.length()<2){
	          char harf= harf1.charAt(0);
	          boolean harfMi=(harf>='a'&&harf<='z')|| (harf>='A'&&harf<='Z');
	             if(harfMi){
	             boolean sesliMi=harf=='a'||harf=='A'||harf=='e'||harf=='E'||
	             harf=='i'||harf=='I'||harf=='o'||harf=='O'||harf=='u'||harf=='U';
	                  if(sesliMi){
	                   System.out.println(harf+ " harfi sesli harfdir.");
	                     }else {
	                    System.out.println(harf+ " harfi sesiz harftir.");
	                      }
	            }else{
	              System.out.println("Yanlis karakter girdiniz.");
	               }
	        }else{
	          System.out.println("Yanlis karakter girdiniz.");
	        
	        in.close();
	}

}
}
