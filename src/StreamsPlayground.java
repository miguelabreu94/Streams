import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPlayground {

	public static void main(String[] args) {
		
		List<String> nomes = List.of("joao", "luis", "ana","sandra");
		
		
		nomes.stream()
			.skip(1) // ignora o primeiro
			.forEach(System.out::println);
		
		/*
		nomes.stream()
			.skip(1)
			.limit(2) // só 2 elementos
	 		.forEach(System.out::println);		
		*/
		
		/*
		nomes.stream()
			.map(n -> n.length())	
			.forEach(System.out::println);
		*/
		
		// com Optional orElse
		System.out.println(
				new ArrayList<String>().stream()
								.mapToInt(n -> n.length())
								.min()
								.orElse(0)
			);
			
		
		// com optional orElseGet
		System.out.println(
				new ArrayList<String>().stream()
								.mapToInt(n -> n.length())
								.min()
								.orElseGet(() -> {
									int h = 7;
									int soma = h + 5;
									
									// faz cenas
									return soma;
								})
			);
		
		// 
		/* System.out.println(
				new ArrayList<String>().stream()
			.mapToInt(n -> n.length())
			.min()
			.orElseThrow(() -> new RuntimeException("je ne sais pas!"))
			);
		*/
		
		var x = new Random().ints(10)
			// .peek((i) -> System.out.println(" --->" + i))
			.filter(i -> i > 0)
			.map(i -> i % 100)
			.boxed()
			.collect(Collectors.toList());
		
		
	}

}
