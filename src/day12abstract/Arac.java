package day12abstract;

public abstract class Arac {
	
	private int hiz;
	private int vites;
	public Arac(int hiz, int vites) {
		super();
		this.hiz = hiz;
		this.vites = vites;
	}
	public int getHiz() {
		return hiz;
	}
	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	public int getVites() {
		return vites;
	}
	public void setVites(int vites) {
		this.vites = vites;
	}
	abstract void vitesAt(int vites);//abstract classin abstract class olabilmesi icin en az bir abstract method olmasi gerekir.
	abstract void hizArtir(int hiz);
	
	public void bilgileriGoster() {
		System.out.println("Vites"+vites+"\nHiz"+hiz);
	}

}
