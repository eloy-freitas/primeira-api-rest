package br.rest.pessoas;

import java.util.ArrayList;


public class PessoaCollection {
	private ArrayList<PessoaModel> array;
	

	public PessoaCollection() {
		array = new ArrayList<>();
		
	}
	
	public void addPessoa(PessoaModel p) {
		this.array.add(p);
	}
	
	
	
	public String listarPessoas(){
		String resposta =" <h1>Lista de pessoas: </h1>";
		for(PessoaModel p : this.array) {
			resposta  = resposta + "<h2> id = " + p.getId() +
					"nome = " + p.getNome() +
					" idade = " + p.getIdade() + "</h2><br>";
			
		}
		return resposta;
	}
	
}
