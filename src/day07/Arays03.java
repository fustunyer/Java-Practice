package day07;

public class Arays03 {

	public static void main(String[] args) {
		// Array  elemanlarinin ortalamasini alan code yazalim
		
		int [] num= {20,30,40,21,-15,55};
		double sum=0;
		double ort=0;
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		ort=sum/num.length;
		System.out.println("Arrayin elemanlarinin ortalamasi= "+ort);
		
		
		
		

	}

}
