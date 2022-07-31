package com.algaworks.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.streams.model.Produto;
import com.algaworks.streams.model.Produto.Status;

public class ExemploFilterForEach {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("�gua 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto("Carv�o", Status.INATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));
		
//		for (Produto produto : produtos) {
//			if (produto.getNome().startsWith("C")) {
//				produto.inativar();
//			}
//		}
		
		produtos.stream()								//Cria um stream de "produtos"
			.filter(p -> p.getNome().startsWith("C"))	//Filtra os produtos peganto todos que come�ar com a letra "C"
			.forEach(Produto::inativar);				//Chama o metodo "inativar()" para inativar os objetos filtrados 
	}
	
}
