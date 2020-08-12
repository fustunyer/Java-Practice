package day05;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
/*Girilecek olan email adresinin kurallara uygun olup olmadigini kontrol edelim

*on kisim@sonkisim.
*"  " varsa 
*getEmailDogrulama(String email)
*return type boolean
*/		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen mail adresinizi giriniz");
		String email=input.nextLine();
		System.out.println("Email: "+getEmailDogrulama(email));
		
		getEmailDogrulama(email);
		
		input.close();
	}
	public static boolean getEmailDogrulama(String email) {
		if(!email.contains("@")) {
			return false;
		}if(email.length()<=4) {
			return false;
		}if(email.contains(" ")) {
			return false;
		}if(!email.contains(".")) {
			return false;
		}
		
		String [] arr = email.split("@");
		if(arr[0].length()<1) {
			return false;
		}if(arr[1].length()<3) {
			return false;
		}if(arr.length>2) {
			return false;
		}
		
		return true;
		
		}

}
