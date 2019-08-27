package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
	
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV",900.00));
		lista.add(new Produto("Notebbok",1200.00));
		lista.add(new Produto("Tablet",450.00));
		
		
		//criando uma classe anonima ignorando a classe myComparator criada anteriormente
		Comparator<Produto> comp = new Comparator<Produto>() {

			@Override
			public int compare(Produto o1, Produto o2) {
				
				return o1.getNome().toUpperCase().compareTo(o2.getNome().toUpperCase());
			}
			
		};
		//ordena a lista usando metodo sort da classe List
		
		lista.sort(comp);		
	
		//percorre a lista e imprime os obejtos p da lista
		for(Produto p : lista) {
			System.out.println(p);
		}
		
	}

}
