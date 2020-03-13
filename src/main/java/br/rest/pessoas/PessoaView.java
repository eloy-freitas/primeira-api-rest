package br.rest.pessoas;

import java.util.ArrayList;

public class PessoaView {
	
    private PessoaCollection p;
	public PessoaView(PessoaCollection collection) {
        p = collection;
    }
    
    
  
	public String listarPessoasHTML() {
		return "<html lang=pt-br><head><title>Lista de pessoas</title><meta charset=utf-8></head><body><table style=\"width:100%\">"
        + p.listarPessoas() + "</table></body></html>";
	}


	
}
