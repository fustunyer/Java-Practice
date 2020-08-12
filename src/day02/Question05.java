package day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * / Kullanýcýdan  yýþýný ve kilosunu alalým
		// 18 yaþýndan küçük ise kan baðýþý yapamaz
		// 18 yaþýndan büyük ve 50 kilo dan hafif ise kan baðýþý yapamaz.
		// 18 yaþýndan büyük ve 50 kilodan aðýr ise kan baðýþý yapabilir.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen yaþýnýzý giriniz");
		int yas=scan.nextInt();
		
		/*if(yas>18) {
			System.out.println("lütfen kilonuzu giriniz");
			int kilo=scan.nextInt();
			if(kilo>50) {
				System.out.println("kan verebilirsiniz.");
			}else {
				System.out.println("50 kilodan hafifler kan baðýþý yapamaz.");
			}
		} else {
				System.out.println("18 yaþýndan küçükler kan baðýþý yapamaz");
			}
			*/
		System.out.println("lütfen kilonuzu giriniz");
		int kilo=scan.nextInt();
		
		String result = yas>18 ? kilo>50 ? "kan verebilirsiniz" : "kan vermek için 50 kilodan fazla olamalýsýnýz." :
									"18 yaþýndan küçükler kan veremezler..";
		System.out.println(result);
				
		scan.close();
				
		}
		

	}


