import java.util.Arrays;
import java.util.List;

public class FindElementsStartsWithFromListOffSetValue {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "abc2", "xyc1");

		myList.stream()
		.filter(s -> s.startsWith("c",2))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
	
		//OUTPUT:-
		//abc2
		//xyc1
	}
}
