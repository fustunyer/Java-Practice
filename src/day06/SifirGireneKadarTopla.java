package day06;

import java.util.Scanner;

public class SifirGireneKadarTopla {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi=input.nextInt();
		int sum=0;
		
		do {
			System.out.println("Tekrar bir sayi giriniz");
			sum+=sayi;
			System.out.println("girilen sayilarin toplami "+sum);	
			sayi=input.nextInt();
			
		}while(sayi!=0);
		input.close();
		System.out.println("kazandiniz "+sum);
	}

}
