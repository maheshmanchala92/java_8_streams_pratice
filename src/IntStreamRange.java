import java.util.stream.IntStream;

public class IntStreamRange {

	public static void main(String[] args) {
		IntStream.range(1, 4)
				.forEach(System.out::println);
		//1
		//2
		//3

	}
}
