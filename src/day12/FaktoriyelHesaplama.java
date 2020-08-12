package day12;

import java.util.Scanner;

public class FaktoriyelHesaplama {

	public static void main(String[] args) {
		//Gırılen sayının faktoiyelini hesaplayan bir method yazinz
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen faktoriyelini hesaplanacak sayiyi giriniz.");
		long sayi=input.nextLong();
		System.out.println("Sonuc: "+getFaktoriyel(sayi));
		
		input.close();
	}
	public static long getFaktoriyel(long sayi) {
		//if(sayi==0 || sayi==1) {
			//return 1;
		//}
		long faktoriyel=1;
		for (int i = 1; i <=sayi; i++) {
			faktoriyel*=i;
		}
		return faktoriyel;

	}

	
}
