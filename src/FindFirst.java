import java.util.Arrays;
import java.util.stream.Stream;

public class FindFirst {
	public static void main(String[] args) {
		Arrays.asList("a1", "a2", "a3")
		.stream()
		.findFirst()
		.ifPresent(System.out::println); // a1
		
		Arrays.asList("a2", "a1", "a3")
		.stream()
		.findFirst()
		.ifPresent(System.out::println); // a2
		
		Stream.of("a1", "a2", "a3")
	    .findFirst()
	    .ifPresent(System.out::println);  // a1
	}
}
