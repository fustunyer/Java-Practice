package day03;

import java.util.Scanner;

public class UstAlma {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi alalim.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplayalim.
        // 3, 2  sonuc = 9
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen taban ve üs giriniz");
		int taban =scan.nextInt();
		int us =scan.nextInt();
		long sonuc=1;
		
		while(us!=0) {
			sonuc*=taban;
			us--;
		}System.out.println("cevap= "+sonuc);
		scan.close();
				
		for (   ;us!=0;--us) {
			sonuc*=taban;
		}System.out.println("cevap= "+sonuc);
		
		sonuc=(long) Math.pow(taban, us);
		System.out.println("cevap= "+sonuc);
			
		scan.close();
	
		
	}

}
