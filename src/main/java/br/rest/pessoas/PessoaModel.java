package br.rest.pessoas;

public class PessoaModel {
	
	private int id;
	private String nome;
	private int idade;
	
	public PessoaModel(int id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}

}
