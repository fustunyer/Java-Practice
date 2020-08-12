package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciIsleri {
	
	public static void main(String[] args) {
		
	ArrayList<Ogrenci> ogrenciler= new ArrayList<>();	
	
	Scanner input = new Scanner(System.in);
	
	while(true) {
		System.out.println("Hangi islemi yapmak istiyorsunuz? \n1.Ogrenci Kaydet\n2.Ogrenci Sil\n3.Ogrencileri goruntule \n4.Cikis");
	
	int islem=input.nextInt();
	input.nextLine();
	if(islem==1) {
		System.out.println("Ogrenci adini giriniz");
		String isim=input.nextLine();
		System.out.println("Ogrenci Soyadini giriniz");
		String soyisim=input.nextLine();
		System.out.println("Ogrenci numarasi giriniz");
		int numarasi=input.nextInt();
		System.out.println("Ogrencinin ortalamasini giriniz");
		double ortalama= input.nextDouble();
		input.nextLine();
		
		Ogrenci ogrenci=new Ogrenci(numarasi,isim,soyisim,ortalama);
		
		ogrenciler.add(ogrenci);
	}else if(islem==2) {
		System.out.println("hangi ogrenciyi silmek isterisiniz");
		String isim=input.nextLine();
		Ogrenci ogrenci=null;
		for (Ogrenci ogr : ogrenciler) {
			if(ogr.getAdi().equals(isim)) {
				ogrenci=ogr;
			}
		}ogrenciler.remove(ogrenci);
	}
	else if(islem==3) {
		if(ogrenciler.isEmpty()) {
			System.out.println("su an listede kayitli ogrenci bulunmamaktadir\n.....");
		}
		for(Ogrenci ogrenci:ogrenciler) {
			System.out.println("Ogrencinin Adi: "+ogrenci.getAdi()+"\nOgrencinin soyadi: "+ogrenci.getSoyadi()+"\nOgrencinin numarasi: "+
					ogrenci.getNumarasi()+"\nOgrencinin ortalamasi; "+ogrenci.getOrtalama()+"\\n.....");
		}
		
	}else if(islem==4) {
		System.out.println("program sonlandirildi.");
		break;
	}
		
	}
	
	input.close();
	
	}
	}


