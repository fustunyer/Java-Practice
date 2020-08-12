package day06;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
	//Klavyeden girilen bir cumlede belirledigimiz bir harfin tekrar sayisini 
	//bulan java kodunu yaziniz
		Scanner input=new Scanner(System.in);
		System.out.println("Bir yazi giriniz.");
		String str=input.nextLine();
		System.out.println("Bir karakter giriniz.");
		String chr=input.next();
		int harfSayisi=0;
	
		
		
	for (int i = 0; i < str.length(); i++) {
		
		if (str.substring(i,i+1).equals(chr)) {
			harfSayisi++;
		}
					
		}System.out.println("cumledeki "+chr+" sayisi "+harfSayisi);
		
		input.close();
		
}
}