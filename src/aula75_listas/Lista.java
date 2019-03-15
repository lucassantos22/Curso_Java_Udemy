package aula75_listas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Anna");
		list.add("Marcos");
		list.add(2,"Lucas");
		
		System.out.println("Tamanho da lista: " + list.size());
		
		for(String nome:list) {
			System.out.println(nome);
		}
		
		System.out.println("---------------");
		
		list.remove(1);
		list.remove("Bob");
		list.removeIf(x -> x.charAt(0)=='M');
		
		for(String nome:list) {
			System.out.println(nome);
		}
		
		System.out.println("Primeiro index of Anna: " + list.indexOf("Anna"));
		System.out.println("Último index of Anna: " + list.lastIndexOf("Anna"));
		
		String primeiroDaLista = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(primeiroDaLista);
		
	}

}
