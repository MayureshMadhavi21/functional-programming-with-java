import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingwithOptional {

	public static void main(String[] args) {
		
		List<String> fruits = List.of("apple","mango","banana");
        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
		Optional<String> findFirst = fruits.stream().filter(predicate).findFirst();
		System.out.println(findFirst);
		System.out.println(findFirst.isEmpty());
		System.out.println(findFirst.isPresent());
		System.out.println(findFirst.get());
		Optional<String> fruit = Optional.of("watermelon");
		Optional<String> empty = Optional.empty();
		System.out.println(fruit);
		System.out.println(empty);
	}

}
