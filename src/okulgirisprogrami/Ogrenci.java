package okulgirisprogrami;

public class Ogrenci {
	
	private String isim;
	private int ogrenciNo;

	
	
	
	public Ogrenci() {
		
	}




	public String getIsim() {
		return isim;
	}




	public void setIsim(String isim) {
		this.isim = isim;
	}




	public int getOgrenciNo() {
		return ogrenciNo;
	}




	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}




	@Override
	public String toString() {
		return "Ogrenci isim=" + isim + ",\nogrenciNo=" + ogrenciNo;
	}

}
