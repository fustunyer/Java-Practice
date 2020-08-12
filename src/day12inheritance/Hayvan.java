package day12inheritance;

public class Hayvan extends Canli {
	
	private String cins;

	public Hayvan(String isim, int uzunluk, int agirlik, String cins) {
		super(isim, uzunluk, agirlik);
		this.cins=cins;
	}
	
	public void kos() {
		System.out.println("Hayvan classinda kos methodu calisti");
	}
	
	
	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	@Override
	public void beslenme() {
		System.out.println("hayvan classinda beslenme methodu calisti");
	}

	@Override
	public void solunum() {
		System.out.println("Hayvan classinda solunum calisti");
	}

	
}
