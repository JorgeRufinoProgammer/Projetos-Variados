package com.algaworks.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.algaworks.streams.model.Categoria;
import com.algaworks.streams.model.Produto;
import com.algaworks.streams.model.Produto.Status;

public class ExemploMapCollect {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		Categoria categoriaBebidas = new Categoria("Bebidas");
		Categoria categoriaCarnes = new Categoria("Carnes");
		Categoria categoriaOutros = new Categoria("Outros");
		
		produtos.add(new Produto("�gua 2L", Status.ATIVO, new BigDecimal(9.9), categoriaBebidas));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5), categoriaCarnes));
		produtos.add(new Produto("Carv�o", Status.INATIVO, new BigDecimal(34.2), categoriaOutros));
		produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4), categoriaBebidas));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92), categoriaCarnes));
		
//		List<Categoria> categorias = new ArrayList<>();
//		
//		for (Produto produto : produtos) {
//			if (produto.getStatus().equals(Status.ATIVO)) {
//				Categoria categoria = produto.getCategoria();
//				
//				if (!categorias.contains(categoria)) {
//					categorias.add(categoria);
//				}
//			}
//		}
		
		List<Categoria> categorias = produtos.stream()				//Cria um fluxo de stream de "produtos"
				.filter(p -> p.getStatus().equals(Status.ATIVO))	//Filtra os produtos ativos	
				.map(Produto::getCategoria)							//Mapea e retorna um stream de "categorias" / Observe que "Produto" � o tipo de Objeto e getCategoria � o metodo				
				.collect(Collectors.toList());						//Transforma em uma "lista de categorias"
		System.out.println(categorias + " - Repare que tem elementos repetidos");
		
						categorias = produtos.stream()				//Cria um fluxo de stream de "produtos"
				.filter(p -> p.getStatus().equals(Status.ATIVO))	//Filtra os produtos ativos	
				.map(Produto::getCategoria)							//Mapea e retorna um stream de "categorias" / Observe que "Produto" � o tipo de Objeto e getCategoria � o metodo
				.distinct()											//Retorna o stream apenas com elementos distintos, ou seja, sem repeti�oes
				.collect(Collectors.toList());						//Transforma em uma "lista de categorias"
		
		System.out.println(categorias);
	}
	
}
