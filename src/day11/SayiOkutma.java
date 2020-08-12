package day11;

import java.util.Scanner;

public class SayiOkutma {

	public static void main(String[] args) {
		// 444 02 34 telefon numarasini okuyan code yaziniz
		Scanner input =new Scanner(System.in);
		System.out.println("Lütfen telefon numarasi giriniz.");
		String sayi=input.nextLine().replace(" ","");
		
		rakamlariOku(sayi);
		
		input.close();
		
		
	}
	public static void rakamlariOku(String sayi) {
		char rakam=' ';
		for (int i = 0; i < sayi.length() ; i++) {
			rakam=sayi.charAt(i);
			switch(rakam) {
			case '0':System.out.println("sifir");break;
			case '1':System.out.print("bir");break;
			case '2':System.out.print("iki");break;
			case '3':System.out.print("uc");break;
			case '4':System.out.print("dort");break;
			case '5':System.out.print("bes");break;
			case '6':System.out.print("alti");break;
			case '7':System.out.print("yedi");break;
			case '8':System.out.print("sekiz");break;
			case '9':System.out.print("dokuz");break;
			default: break;
		}
		
		
		
		

	}
	}
}
