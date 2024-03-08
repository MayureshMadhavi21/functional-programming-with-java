import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
	
		//printAllNumbersInListFunctional(List.of(12,34,42,56,31,76,86));
		//printEvenNumbersInListFunctional(List.of(12,34,42,56,31,76,86));
		//printOddNumbersInListFunctional(List.of(12,34,42,56,31,76,86));
		printSqaresOfEvenNumbersInListFunctional(List.of(12,34,42,56,31,76,86));
	}
    
//	private static boolean isEven(int number) {
//		return number%2 == 0;
//	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number%2 != 0).forEach(System.out::println);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//Functional approach
		//convert list to stream of elements
//		numbers.stream().
//		forEach(FP01Functional::print);//syntax of method reference
		
		numbers.stream().forEach(System.out::println);
	}
    
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
//		numbers.stream()
//		.filter(FP01Functional::isEven)
//		.forEach(System.out::println);
		
		numbers.stream()
		.filter(number -> number%2==0) //lambda expression
		.forEach(System.out::println);
	}
	
	private static void printSqaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.filter(number -> number%2==0) //lambda expression
        .map(number -> number*number)
		.forEach(System.out::println);
	}
}
