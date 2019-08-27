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
		
		
		//usando expressoes lambda
		//criando uma classe anonima ignorando a classe myComparator criada anteriormente
		                           //funcao anonima
		//enxugando a expressao****
		Comparator<Produto> comp = (p1,p2) ->p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
				
		
		lista.sort(comp);		
	
		//percorre a lista e imprime os obejtos p da lista
		for(Produto p : lista) {
			System.out.println(p);
		}
		
	}

}
