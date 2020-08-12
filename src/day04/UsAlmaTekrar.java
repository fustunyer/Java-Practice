package day04;

import java.util.Scanner;

public class UsAlmaTekrar {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi alalim.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplayalim.
        // 3, 2  sonuc = 9(while-for-math
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen taban ve us giriniz");
		int taban=input.nextInt();
		int uss=input.nextInt();
		
		int sonuc=1;
		int i=1;
		while(i<=uss) {
			sonuc=sonuc*taban;
			i++;
		}System.out.println(sonuc);
		// sayi-- demek once sayiyi ata sonra 1 eksilt 
		//--sayi   demek once 1 eksilt sonra islem yap demek
		for(int i1=1;i1<=uss;i1++ ) {//==for( ; uss>0;--uss)
			sonuc=sonuc*taban;
		}System.out.println(sonuc);
		
	System.out.println(	Math.pow(taban,uss));
				
		
		input.close();

	}

}
