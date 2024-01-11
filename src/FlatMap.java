
import java.util.List;


public class FlatMap {

	public static void main(String[] args) {
		
		List <String> paises = List.of("Portugal","Espanha","Canada","Nova Zelandia","Australia","Mexico");
		
		/*
			.map(pais -> pais.toUpperCase())
			.sorted()
			.forEach(System.out::println);
	*/
		// FlatMap
		
		List<List<String>> paisesPorContinente = List.of(
				List.of("Portugal","Espanha"), // Europa
				List.of("Canada","Mexico"),
				List.of("Nova Zelandia","Australia")
				);
		
		// solucao sapateira
		/*
		List<String> listaSapateira = new ArrayList<String>();
		
		paisesPorContinente.stream()
			.map(cont -> {listaSapateira.addAll(cont);return cont;})
			.toList();
		
		listaSapateira.forEach(System.out::println);
		*/
		
		/*
		// Usando o reduce
		var lPaises = paisesPorContinente.stream()
				.reduce(new ArrayList<String>(), (x,y) -> {x.addAll(y); return x;});
		
		lPaises.forEach(System.out::println);
		*/
		
		// com flatmap
		var lPaises = paisesPorContinente.stream()
				.peek(l -> System.out.println(l))
				.flatMap(i -> i.stream())
				.peek(l -> System.out.println(l))
				.toList();
		
		lPaises.forEach(System.out::println);
		
	}
}
