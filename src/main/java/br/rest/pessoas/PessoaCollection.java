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
		String resposta =" <h1>Lista de pessoas: </h1><tr><th>Id</th><th>Nome</th><th>Idade</th></tr>";
		for(PessoaModel p : this.array) {
			resposta  = resposta + "<tr><td>" + p.getId() + " </td> <td>" + p.getNome() + "</td><td>" + p.getIdade() + "</td></tr>";
			
		}
		return resposta;
	}
	
}
