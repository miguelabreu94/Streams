import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Pais1 {
	String nome;
	String codigo;
	int ano;
	long populacao;
	
	public Pais1(String nome, String codigo, int ano, long populacao) {
		this.nome = nome;
		this.codigo = codigo;
		this.ano = ano;
		this.populacao = populacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return String.format("%s,%s,%d,%d", nome, codigo, ano, populacao);
	}
}

public class LerFicheiroPaises {
	
	
		static final String filePath = "C:\\Users\\jhgh\\Downloads\\PopulacaoPaises.csv";
		
		public static List<String> criarLista(String filepath){
			
			List<String> result = new ArrayList<String>();
			
			try {
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				String line;
				
				while((line = br.readLine()) != null) {
					result.add(line);
				}
				
				br.close();
								
			} catch (Exception e) {
				e.printStackTrace();
			} 

			return result;
			
			
		}

		
	public static void main(String[] args) {
		
		// 1. Ler ficheiro dos paises e criar ao mesmo tempo uma lista de Países
		// DICA: Usar FileReader com BufferedReader 
		// 2. Imprimam o numero de items na lista (16400)
		
		var lista = criarLista(filePath);
		
		List <Pais1> pop = lista.stream()
				.skip(1)
				.map(item -> {var i = item.split(",");
					return new Pais1(i[0], i[1], Integer.valueOf(i[2]), Long.valueOf(i[3]));
				})
				.collect(Collectors.toList());
		pop.forEach(System.out::println);
		
		
		long num = 
		pop.stream()
		.count();
		System.out.println("O numero de items na lista é de :" + num);
	
	
	}

	
}
