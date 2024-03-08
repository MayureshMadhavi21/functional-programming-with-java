import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
       
		List<String> courses = List.of("Spring","Spring boot","Microservices","AWS","Docker","Angular","Javascript");
		//print all courses
		System.out.println("print all courses");
		courses.stream().forEach(System.out::println);
		
		//print courses having spring
		System.out.println("print courses having spring");
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		
		//print courses having alteast 4 characters
		System.out.println("print courses having alteast 4 characters");
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
		
		//print character length of each course
		System.out.println("print character length of each course");
		courses.stream().map(course -> course + " " +course.length()).forEach(System.out::println);
		
		printCubeOfOddNumbersInListFunctional(List.of(12,34,42,56,31,76,86));
	}

	private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number%2 != 0).map(number -> number*number*number).forEach(System.out::println);
	}

}
