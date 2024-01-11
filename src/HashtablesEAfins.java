import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashtablesEAfins {

	public static void main(String[] args) {
		
		// Map
		Map<Integer,String> indicativos = new HashMap<>();
		
		indicativos.put(21, "Lisboa");
		indicativos.put(22, "Porto");
		
		System.out.println(indicativos.get(22));
		
		// Set
		Set<String> indicativosNum = new HashSet<>();
		
		indicativosNum.add("Lisboa");
		indicativosNum.add("Lisboa");
		indicativosNum.add("Lisboa");
		indicativosNum.add("Porto");
		indicativosNum.add("Coimbra");
		
		indicativosNum.forEach(System.out::println);
		
		
		// Ponto
		
		class Ponto {
			private final int x;
			private final int y; 
			
			Ponto(int x, int y){
				this.x = x; 
				this.y = y;
			}
			
			public int getX() {
				return x;
			}
			
			
			public int getY() {
				return y;
			}
			
			@Override
			public String toString() {
				return String.format("(%d,%d) - %s", x,y,hashCode());
			}
			
			@Override
			public int hashCode() {
				return x + y * 100;
			}
			
			@Override
			public boolean equals(Object o) {
				if(o == null) return false;
				if(o == this) return true;
				if(o instanceof Ponto p) {
					return p.getX() == this.x && p.getY() == this.y;
				}
				
				return false;
				
			}
			
		}
		
		Set<Ponto> pontos = new HashSet<>();
		pontos.add(new Ponto(0,0));
		pontos.add(new Ponto(0,1));
		pontos.add(new Ponto(0,0));
		
		
		pontos.forEach(System.out::println);
	}

	
	
}
