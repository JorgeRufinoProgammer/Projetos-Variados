package aplications;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>(); 
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Ana");
		lista.add(2, "Marco"); //adiciona na posi�ao 2
		lista.add("marta");
		
		for (String obj : lista) {	// foreach (TIPO nome_qualquer : variavel_que_ser_percorrer) 
			System.out.println(obj);
		}
		System.out.println("-----------------------");
		System.out.println(lista.size());	//tamanho da lista
		
		lista.remove("Alex");	//remove fazendo compara�oes dentro da lista
		lista.remove(3);		//removeu a posi��o 3 
		lista.removeIf(x -> x.charAt(0) == 'M'); //removeu todas Strings que come�avam com M
		
		for (String obj : lista) {	// foreach (TIPO nome_qualquer : variavel_que_ser_percorrer) 
			System.out.println(obj);
		}
		//for (int i = 0 ; i < lista.size(); i++) {
			//System.out.println(lista.get(i));
		//}
	}

}
