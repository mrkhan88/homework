package welcome;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array
		
		/*int[] numbers = {10, 20, 30};
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
		
		System.out.println("The length of Array is "+numbers.length);*/
		
		/*int[] obj = new int [10];
		obj[0] = 10;
		obj[1] = 20;
		obj[2] = 30;
		obj[3] = 40;
		obj[4] = 50;
		obj[5] = 60;
		obj[6] = 70;
		obj[7] = 80;
		obj[8] = 90;
		obj[9] = 100;
//		System.out.println(obj[1]);
//		System.out.println(obj.length);
				
		for (int i=0; i<=9; i=i+2){
			System.out.println(i);
			System.out.println(obj[i]);
		}*/
		
		String[] names = new String[10];
		names[0] = "Mamun";
		names[1] = "Hasnath";
		names[2] = "Touhid";
		names[3] = "Rashid";
		names[4] = "Thomas";
		names[5] = "James";
		names[6] = "Bond";
		names[7] = "Alfa";
		names[8] = "Flabio";
		names[9] = "Hasan";
//		names[10] = "Gabi";//out of boundary, It will through us out of boundary exception.
		
//		System.out.println(names[9]);
		
		int i=0;
		while (i<=9) {
		System.out.println(names[i]);
		i=i+1;
		}
		
	}

}
