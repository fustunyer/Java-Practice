package day10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array04 {

	public static void main(String[] args) {
		// Klavyeden girilecek plaka numarasından ili gösteren uygulamayı yazalım
 /*"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
 "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
   "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
   "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
    "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
"İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
 "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
 "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
 "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
 "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
 "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
		​
		         */	
		String [] arr = {" ", "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
 "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
  "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
 "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
 "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
"İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
"K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
 "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
 "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
  "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
       "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("1 den 81 e kadar bir sayi giriniz");
		int ilPlakaKodu = input.nextInt();
		System.out.println("Girilen plaka kodu " +arr[ilPlakaKodu]+" iline aittir.");
		int plaka = Byte.valueOf(JOptionPane.showInputDialog("Lutfen Plaka Numarasini giriniz."));
		JOptionPane.showMessageDialog(null,arr[plaka]);

		input.close();

	}

}
