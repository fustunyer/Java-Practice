package day10;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		//Kullanıcidan 5 adet tam sayi girmesini isteyelim ve bu sayilari bir 
        // arrayde toplayalim,
        // içindeki çift sayilarin sayisini yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" 5 adet tamsayi giriniz");
		int [] s1 = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		
		int count=0;
		for (int i = 0; i < s1.length; i++) {
			if(s1[i]%2==0) {
				count++;
			}
				
		}
		System.out.println("Girilen sayilarda cift sayi adedi: "+ count);
		scan.close();
		
		
	}

}
