import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
	
		printAllNumbersInListStrucured(List.of(12,34,41,56,31,76,86));
		printEvenNumbersInListStrucured(List.of(12,34,41,56,31,76,86));
	}

	private static void printAllNumbersInListStrucured(List<Integer> numbers) {
		//traditional approach
		//how to loop numbers
		for(int number:numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStrucured(List<Integer> numbers) {
		//traditional approach
		//how to loop numbers
		for(int number:numbers) {
			if(number%2==0) {
				System.out.println(number);
			}
		}
	}

}
