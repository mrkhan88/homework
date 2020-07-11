package welcome;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectonConcept {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Mamun");
		names.add("Hasnath");
		names.add("Touhid");
		names.add("Smith");
		names.add("MAMUN");
		
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(".......................................................");
		System.out.println(names.get(3));
	    System.out.println(names.remove(4));
		System.out.println(names);
		
		
		
		List<Integer> num = new ArrayList<Integer> ();
		num.add(14406);
		num.add(14407);
		num.add(14408);
		
		System.out.println(num);
		System.out.println(num.get(2));
		System.out.println(num.remove(1));
		System.out.println("After Remove: "+num);
		System.out.println(".............................................");
		List<String> names1 = new ArrayList<String>();
		names1.add("Bill Gates");
		names1.add("Steve Jobs");
		names1.add("Mark Jokerburg");
		names1.add("James gosly");
		names1.add("Simon Stewart");
		
		int i=0;
		while (i<=4) {
			System.out.println(names1.get(i));
			i=i+1;
		}
		System.out.println("..................................");
		
		int ii=0;
		while (ii<=3) {
			System.out.println(names.get(ii));
			ii=ii+1;
		}
		System.out.println("................................");
		
		for (int j = 0; j <names.size(); j++) {
			System.out.println(names.get(j));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
