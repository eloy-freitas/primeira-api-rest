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
	
	public String listPessoas() {
		String resposta = "";
		for(PessoaModel p : this.array) {
			resposta = resposta + "id = " + p.getId() +
					"; nome = " + p.getNome() +
					"; idade = " + p.getIdade() + ";\n";
			
		}
		return resposta;
	}
	
}
