package com.rcastrucci.dev.domain;

import java.util.Date;

public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	
	public Pessoa(PessoaBuilder pessoaBuilder) {
		this.nome = pessoaBuilder.nome;
		this.cpf = pessoaBuilder.cpf;
		this.rg = pessoaBuilder.rg;
		this.dataNascimento = pessoaBuilder.dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public static class PessoaBuilder {
		
		private String nome;
		private String cpf;
		private String rg;
		private Date dataNascimento;
		
		public PessoaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public PessoaBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		
		public PessoaBuilder rg(String rg) {
			this.rg = rg;
			return this;
		}
		
		public PessoaBuilder dataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
			return this;
		}
		
		public Pessoa build() {
			return new Pessoa(this);
		}
		
	}
	
}