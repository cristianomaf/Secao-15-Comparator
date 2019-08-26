package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
	
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV",900.00));
		lista.add(new Produto("Notebbok",1200.00));
		lista.add(new Produto("Tablet",450.00));
		
		//ordena a lista
		Collections.sort(lista); // o tipo da lista tem que ser implementacao de compaprable
		
	
		//percorre a lista e imprime os obejtos p da lista
		for(Produto p : lista) {
			System.out.println(p);
		}
		
	}

}
