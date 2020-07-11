package welcome;

public class IfElseConcept {

	public static void main(String[] args) {
		int diabeticRatio = 4;
		
		if (diabeticRatio>5.75) {
			System.out.println("The patient is Diabetic");
		}
		else {
			System.out.println("non diabetic");
		}
		System.out.println(".............................");
		
		int i=25;
		if (i<30) {
			System.out.println("Nice weather");
		}
		else {
			System.out.println("Hot weather");
		}
		
		
		

		
		
		int favoriteTemp = 70;
		int currentTemp = 60;
		String opinion;
		
		if (currentTemp<favoriteTemp-30) {
			opinion = "It's really very cold";
		}
//		else if (favoriteTemp>currentTemp + 5) {
//			opinion = "it's kind a warm weather";
//		}
		else if(currentTemp<favoriteTemp+20){
			opinion = "It's very hot";
		}
		
		else {
			opinion= "Beautiful Day!";
		}
		
		System.out.println(opinion);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
