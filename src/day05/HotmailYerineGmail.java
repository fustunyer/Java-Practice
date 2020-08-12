package day05;

import java.util.Scanner;

public class HotmailYerineGmail {

	public static void main(String[] args) {
		
// Kullanicidan alacagimiz hotmail.com yerine gmail.com degistirelim
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen Hotmail adresinizi giriniz");
		String email=input.nextLine();
		
	
	
		if(email.contains("hotmail")) {
			System.out.println(email.replace("hotmail", "gmail"));
		}else {
			System.out.println("Mail adresiniz hotmail icermiyor");
		}
		input.close();
		
		
		
		}

}
