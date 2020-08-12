package okulgirisprogrami;

public class OkulGirisProgrami {

		/*
	     * Öğretmen, öğrenci ve okul genel bilgilerinden oluşan JAVA programı yazınız.
	     *
	     * 1. Adım : Okulun sabit bilgilerini içerisine ekleyeceğimiz SabitBilgiler adlı bir class oluşturalım
	     *           Buradaki verileri public static final olarak tutalım.
	     *           MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	     *
	     * 2. Adım : Ogretmen adlı bir class oluşturalım.
	     *           Bu classta öğretmenin adı, branşı ve telefon numaralarını tutalım.
	     *           String isim, brans, telefon ;
	     *           içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman öğretmenlerin bilgilerini yazdıralım
	     *
	     * 3. Adım : Ogrenci adlı bir class oluşturalım.
	     *           Bu classta ogrencinin adı, okulnumarası bulunsun.
	     *           String isim;
	     *           int ogrenciNo;
	     *			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman ogrencilerin bilgilerini yazdıralım
	     *
	     * 4. Adım : Ogretmenler adlı class oluşturalım.
	     *           Bu classta tüm öğretmenleri tutualım.
	     *           İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	     *           Bu class'ın içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öğretmen ekleyebilelim.
	     *
	     * 5. Adım : Ogrenciler adlı class oluşturalım.
	     *           Bu classta tüm öğrenciler tutualım.
	     *           İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	     *           Bu class'ın içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öğrenci ekleyebilelim.
	     * */
	public static void main(String[] args) {
		System.out.println("****OKULUMUZA HOS GELDINIZ******");
		System.out.println("**** OKULUMUZA HOS GELDINIZ ****");
		System.out.println("Okul Ismi : " + SabitBilgiler.OKUL_ISMI);
		System.out.println("Okul Muduru: " + SabitBilgiler.MUDUR);
		System.out.println("Okul Telefon Numarasi: " + SabitBilgiler.TELEFON_NO);
		System.out.println("Okul Adresi: " + SabitBilgiler.ADRES);
		System.out.println("Okul Web Sitesi: " + SabitBilgiler.WEB_SITESI);
		System.out.println("Okul Teknik Destek: " + SabitBilgiler.TEKNIK_DESTEK);

		System.out.println("\n OGRETMEN OLUSTURALIM \n");
		
		Ogretmen ogretmen1 = new Ogretmen();
		ogretmen1.setIsim("Suleymen Bey");
		ogretmen1.setBrans("Java");
		ogretmen1.setTelefon("+1546484");
		
		System.out.println("\n isim: "+ ogretmen1.getIsim());
		System.out.println("\n brans: "+ ogretmen1.getBrans());
		System.out.println("\n telefon "+ ogretmen1.getTelefon());
		
		Ogretmen ogretmen2 = new Ogretmen();
		ogretmen2.setIsim("Hamza Bey");
		ogretmen2.setBrans("Selenium");
		ogretmen2.setTelefon("+14554646854");
		
		System.out.println("\nisim: "+ ogretmen2.getIsim());
		System.out.println("\nbrans: "+ ogretmen2.getBrans());
		System.out.println("\ntelefon: "+ ogretmen2.getTelefon());
		
		Ogretmen ogretmenAli= new Ogretmen("Ali" , "Mat", "6485615");
		
		System.out.println("isim: "+ogretmenAli.getIsim());
		System.out.println("Brans: "+ ogretmenAli.getBrans());
		System.out.println("Telefon: "+ogretmenAli.getTelefon());
		
		System.out.println(ogretmen1.toString());
		System.out.println(ogretmenAli.toString());
		System.out.println(ogretmen2.toString());
		
		
		
		System.out.println("\n OGRENCI OLUSTURALIM ");
		
		Ogrenci ogrenci1= new Ogrenci();
		Ogrenci ogrenci2= new Ogrenci();
		
		ogrenci1.setIsim("Hasan Dogan");
		ogrenci1.setOgrenciNo(1);
		ogrenci2.setIsim("Mehmet Kocaaslan");
		ogrenci2.setOgrenciNo(2);
		
		System.out.println(ogrenci1.toString());
		System.out.println(ogrenci2.toString());
		
		
		System.out.println("\nOGRETMENLER OLUSTURUYORUZ");
		
		Ogretmenler ogretmenler=new Ogretmenler();
		
		ogretmenler.ogretmenEkle(ogretmen1);
		ogretmenler.ogretmenEkle(ogretmen2);
		System.out.println(ogretmenler.toString());
		
		
		
		
		
		
		
	}

}
