package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KelimeOyunu {

	public static void main(String[] args) {
		/*
		 * "ab" "aba" "kaba" "kabak" 
		 *  1.    2.    1.     2.
		 */
		List<String> kelimeler=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		boolean devamMi = true;
		int sirakimde=0;
		int oyunSayisi=0;
		 
		while(devamMi) {
			sirakimde=oyunSayisi%2+1;
			System.out.println(sirakimde+". kullanici kelime yaziniz: ");
			String kelime=input.next();
			kelimeler.add(kelime);
			oyunSayisi++;
			devamMi=getDevamMi(kelimeler);
		}	
			int KazananiBelirle = sirakimde==1?2:1;
			System.out.println(KazananiBelirle+ ". kullanici kazandi");
			System.out.println(kelimeler);
			input.close();
		}
		private static boolean getDevamMi(List<String> kelimeler) {
			//yazilan kelime bir onceki kelimeyi kapsiyor  mu?
			//yazilan kelimenin uzunlugu bir onceki kelimenin uzunlugu farki 1 olmali
			
			if(kelimeler.size()<2) 
				return true;
			String sonKelime=kelimeler.get(kelimeler.size()-1);
			String birOncekiKelime = kelimeler.get(kelimeler.size()-2);
			if(sonKelime.length()-birOncekiKelime.length()!=1);
				return false;
			//if(!sonKelime.contains(birOncekiKelime));
			//	return false;
			//return true;
			
				
			
		}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		

	


