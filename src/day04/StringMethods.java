package day04;

public class StringMethods {

	public static void main(String[] args) {
		//indexOf() karaterin yerini belirler		
		String str = "istanbullu";
		System.out.println(str.indexOf('u'));
		//lastIndexOf() karakterin son yerini verir
		System.out.println(str.lastIndexOf('l'));
		//lenght() Stringin uzunlugunu verir
		System.out.println(str.length());
		//Kullanicidan ismini alin ilk harfini ve son harfini yer degistirin
		
		char ilkHarf = str.charAt(0);
	    char sonHarf=str.charAt(str.length()-1);
		
		String orta=str.substring(1, str.length()-1);
		
		System.out.println(sonHarf+orta+ilkHarf);
		
		
		
		
		
		
		
		
		
		  }
	}
		
		

	


