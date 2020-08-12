package day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		
		/*System.out.println(5+"Ali");//5Ali
		System.out.println(5+5+"Ali"+4+3);//10Ali43
		
		System.out.println(1==3);
		System.out.println(2==2);
		*/
		//kullanýcýdan adýný ve soyadýný alalým ve ilk harflerini yazdýralým
		Scanner scan = new Scanner(System.in);
		//System.out.println("Adýnýzý yazýnýz");
		//char ad= scan.next().charAt(0);
		//System.out.println("Soyadýnýzý yazýnýz");
		//char soyad= scan.next().charAt(0);
		
		//hasan kara
		System.out.println("ad ve soyadýnýzý yazýnýz");
		
		String adSoyad=scan.nextLine();
		System.out.println("isminizin ilk harfi:"+ adSoyad.charAt(0)+"\n"+
		"soyisminizin ilk harfi: "+adSoyad.charAt(6));
		
		
		
		
		
	//	System.out.println(ad+" "+soyad);
		scan.close();
		

	}

}
