import java.util.ArrayList;
import java.util.List;

public class Main {

	
	
	public static void main(String[] args) {
	
		// restringe o tipo de dado manipulado na cole��o.
		List<String> lista = new ArrayList<String>();
		
		lista.add("abc");
		lista.add("def");
		// detecta o erro no momento da compila��o
		//lista.add(100); 
		//lista.add(new Date());
		
		for(String s : lista) {
			System.out.println(s);
		}
		
	}
	
}
