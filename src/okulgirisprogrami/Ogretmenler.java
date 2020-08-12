package okulgirisprogrami;

import java.util.ArrayList;
import java.util.List;

public class Ogretmenler {
	
	List<Ogretmen> ogretmenlistesi= new ArrayList<>();
	
	
	

	public Ogretmenler() {
		
	}
	public void ogretmenEkle(Ogretmen ogretmen) {
		ogretmenlistesi.add(ogretmen);
	}
	@Override
	public String toString() {
		String isimler="";
		for (Ogretmen ogretmen : ogretmenlistesi) {
			isimler+=ogretmen.getIsim()+"\n ";
		}
		return isimler;
	
	}
	

}
