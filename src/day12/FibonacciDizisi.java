package day12;

import java.util.Scanner;

public class FibonacciDizisi {

	public static void main(String[] args) {
		//Kullanicidan sayi alin. ve o sayi kadar ard arda gelen fibonacci sayi dizisini yaziniz
		//girilen 10 ise  0 1 1 2 3 5 8 13 21 34
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int sayi=input.nextInt();
		
		int sayi1=0;
		int sayi2=1;
		int ikiSayininToplami=0;
		System.out.print(sayi1+" "+sayi2);
		for (int i = 2; i <sayi ; i++) {
			ikiSayininToplami=sayi1+sayi2;
			sayi1=sayi2;
			sayi2=ikiSayininToplami;
			System.out.print(" "+ikiSayininToplami);
		}
		
		
		input.close();
		
	}

}
