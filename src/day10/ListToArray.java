package day10;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		//ArrayList i Array e ceviren java kodu yaziniz
        //"Python", "JAVA", "PHP",  "Perl", "C#", "C++"
		
		List<String> lstr = new ArrayList<>();
		lstr.add("Python");
		lstr.add("JAVA");
		lstr.add("PHP");
		lstr.add("Perl");
		lstr.add("C#");
		lstr.add("C++");
		
		String [] arr = new String[lstr.size()];
		lstr.toArray(arr);
		for (String str : arr) {
			System.out.println(str);

	}
	}
}
