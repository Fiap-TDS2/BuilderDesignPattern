package com.rcastrucci.dev.main;

import com.rcastrucci.dev.domain.Pessoa;
import com.rcastrucci.dev.domain.Pessoa2;

public class Teste {

	public static void main(String[] args) {
		
		// Using Builder design pattern
		Pessoa pessoa1 = new Pessoa.PessoaBuilder()
				.nome("Fulano Ciclano")
				.cpf("")
				.build();
		
		// Using Framework Lombok
		Pessoa2 pessoa2 = Pessoa2.builder()
				.nome("Fulano Ciclano")
				.cpf("")
				.build();
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa2.getNome());

	}
}