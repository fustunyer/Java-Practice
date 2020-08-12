package day05;

public class IsminOratasinaIsim {

	public static void main(String[] args) {
		// name1 ve name2 seklinde iki String tanimlayalim
	//name1 karakterf sayisi cift ise name 1i orta kismindan icine yazsin
//name1 tek ise eklenemiyor desin		
		//Me
		String name1="SULEYMA";
		String name2="Fatih";
		
		boolean name1CiftMi=name1.length()%2==0;
		String ilkYarisi=name1.substring(0, name1.length()/2);
		String ikinciYarisi=name1.substring(name1.length()/2);
		
		if(name1CiftMi) {
			System.out.println(ilkYarisi +name2+ikinciYarisi);
		}else {
			System.out.println("eklenemiyor.");
		}
		
		
		
		
		
		
		
	}

}
