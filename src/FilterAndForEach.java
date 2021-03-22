import java.util.stream.Stream;

public class FilterAndForEach {

	public static void main(String[] args) {
		Stream.of("d2", "a2", "b1", "b3", "c")
			  .filter(s -> {
				  System.out.println("filter: " + s);
				  return true;
			  })
			  .forEach(s -> System.out.println("forEach: " + s));
	}
}

//filter: d2
//forEach: d2
//filter: a2
//forEach: a2
//filter: b1
//forEach: b1
//filter: b3
//forEach: b3
//filter: c
//forEach: c

