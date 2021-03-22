import java.util.stream.Stream;

public class AnyMatch {

	public static void main(String[] args) {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });

	}
}

// map:      d2
// anyMatch: D2
// map:      a2
// anyMatch: A2