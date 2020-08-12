package okulgirisprogrami;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler {
	
	List<Ogrenci> ogrencilistesi=new ArrayList<>();
	

	public Ogrenciler() {
		
	}
	
	public void ogrenci(Ogrenci ogrenci) {
		ogrencilistesi.add(ogrenci);
	}

	@Override
	public String toString() {
		String isimler="";
		for (Ogrenci ogrenci : ogrencilistesi) {
			isimler+=ogrenci.getIsim()+"\n ";
		}
		return isimler;
	}
	

}
