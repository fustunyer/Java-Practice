package day06;

import java.util.Scanner;

public class SaniyeyeCevir {

	public static void main(String[] args) {
		//saat ve dakika girildiginde saniye return eden java methodu yazalim
		// 1 saat = 3600 
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen saat giriniz.");
		int saat=input.nextInt();
		System.out.println("Lutfen dakika giriniz.");
		int dakika=input.nextInt();
		
		
		
	System.out.println("Girilen saat ve dakika "+ saniyeyeCevir(saat,dakika)+" saniyedir");

	input.close();
	}
	public static long saniyeyeCevir(int saat,int dakika) {
		int saniye=saat*3600+dakika*60;		
		return saniye;	
	}
	
	
	
	

}
