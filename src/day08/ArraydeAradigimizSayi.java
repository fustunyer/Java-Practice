package day08;

public class ArraydeAradigimizSayi {

	public static void main(String[] args) {
		//bir int array icerisinde aradigimiz sayiyi kontrol edelm
		//[12,32,34,54,45]
		
		int [] sayilar = {12,32,34,54,45};
		
		System.out.println(getVarmi(sayilar));
	}
	public static boolean getVarmi(int [] sayilar) {
			for (int i = 0; i < sayilar.length; i++) {
					if(String.valueOf(sayilar[i]).contains("2")) {
						return true;
						
					}
						
		
				}return false;
		
	}

}
