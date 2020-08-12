package day05;

import java.util.Scanner;

public class IslemMethodlari {
	public static void toplama(double num1, double num2) {
		System.out.println("Toplama isleminin sonucu= "+ (num1+num2));
	}
	public static void cikarma(double num1, double num2) {
		System.out.println("cikarma isleminin sonucu= "+ (num1-num2));
	}
	

	public static void bolme(double num1, double num2) {
		System.out.println("bolme isleminin sonucu= "+ (num1/num2));
	}
	
	public static void carpma(double num1, double num2) {
		System.out.println("carpma isleminin sonucu= "+ (num1*num2));
	}
	public static void main(String[] args) {
	//kullanicidan iki sayi girmesini ve ardindan islem secmesi istenecek
		//tum islemler methodlarla yapilacak
		//toplama cilarma carpma bolme
		
		Scanner input = new Scanner(System.in);
		System.out.println("lutfen birinci sayiyi giriniz");
		double num1 = input.nextDouble();
		System.out.println("lutfen ikinci sayiyi giriniz");
		double num2 = input.nextDouble();
		System.out.println("dort islemden birini seciniz toplama,cikarma,bolme,carpma");
		String islem=input.next();
		islem=islem.toLowerCase();
		
		islem(islem,num1,num2);
		
		input.close();
	}
	public static void islem(String islem,double num1,double num2) {
		switch(islem) {
		case "toplama":
			toplama(num1,num2);
			break;
		case "cikarma":
			cikarma(num1,num2);
			break;	
		case "bolme":
			bolme(num1,num2);
			break;	
		case "carpma":
			carpma(num1,num2);
			break;	
		default:
			System.out.println("gecerli islem secimiz");
		}		
		
}
	
	

}
