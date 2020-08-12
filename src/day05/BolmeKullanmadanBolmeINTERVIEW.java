package day05;

import java.util.Scanner;

public class BolmeKullanmadanBolmeINTERVIEW {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bonunen ve bolen seklinde iki sayi alalim ve
		 *  bolme operatoru kullu\anmadan bolme islemini gerceklestirelim
		 *  blumu yazdiralim
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bolunen sayiyi giriniz");
		int bolunen=scan.nextInt();
		System.out.println("Bolen sayiyi giriniz");
		int bolen=scan.nextInt();
		
		int bolum = bolme(bolunen,bolen);
		System.out.println("bolme isleminin sonucu: "+bolme(bolunen,bolen));
		bolum=bolum*10;
		System.out.println(bolum);
		scan.close();
		
	}
		
		public static int bolme(int bolunen,int bolen ) {
		int bolum=0;
		while(bolunen>=bolen) {
			bolunen=bolunen-bolen;
			bolum++;
		}
		
		
		return bolum;
		
	}

}
