package day08;

import java.util.Scanner;

public class RepItSorulari {

	public static void main(String[] args) {
		/*
		 * 	/* Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, 
	 * değilse sessiz harf olduğunu ekrana yazdırsın. 
	 * Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı gostersin. 
	 * (Test girilen harfi buyuk yada kucukluğune duyarlıdır.)
​
Sesli harfler: a,e,i,o,u
​
Test Data: 
a
​
Beklenen cıktı:
a harfi sesli harfdir.

		 */
		Scanner input=new Scanner(System.in);
		String in= input.next().toLowerCase();
		
		boolean uppercase = in.charAt(0)>='A' && in.charAt(0)>='A';
		boolean lowercase = in.charAt(0)>='a' && in.charAt(0)>='a';
		
		boolean sesli=in.equals("a")||in.equals("e")||in.equals("i")||in.equals("o")||in.equals("u");
		
		if(in.length()>1) {
			System.out.println("Tek karakter giriniz");
		}else if(!uppercase||!lowercase) {
			System.out.println("yanlis karakter goirdiniz");
		}else if(sesli) {
			System.out.println(in+ " sesli harf");
		}else
		    {System.out.println(in+" sessiz harf");
		    input.close();
	}

}
}