package day06;

import java.util.Scanner;

public class KelimeSayisi {

	public static void main(String[] args) {
//Kullanıcıda bir String kümesi girmesini isteyelim ve Kaç kelimeden
  //oluştuğunu dönen java methodu yazınız.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir kelime gurubu yaziniz");
		String str=input.nextLine();
		
	System.out.println("Metindeki kelime sayisi: "+kelimeSayisi(str));
		
	input.close();
	}
	public static int kelimeSayisi(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {//bugun hava cok sicak
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		count+=1;
		return count;
	}

}
