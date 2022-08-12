package com.rcastrucci.dev.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Pessoa2 {

	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;

}