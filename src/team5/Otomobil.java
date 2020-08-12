package team5;

public class Otomobil extends Kara {
	
	int i = 15;

	public static void main(String[] args) {
		
		Otomobil oto = new Otomobil();	
		Tasit oto1 = new Kara();
		
		oto.motor();
		oto.yakit();
		oto1.motor();
		oto1.yakit();
		System.out.println(oto.i);
		System.out.println(oto1.i);
		
		
	}

	@Override
	public void motor() {
		System.out.println("3000 motor");
	}

	@Override
	public void yakit() {
		System.out.println("dizel ");
	}

}
