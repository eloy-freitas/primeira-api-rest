package br.rest.pessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.rest.pessoas.PessoaView;
@RestController
public class PessoaController {
    
    private PessoaCollection pc;
    private PessoaView pw;
    private int idPessoa;
    public PessoaController(){
        pc =  new PessoaCollection();
        idPessoa = 0;
    }

	/*@GetMapping("/getpessoa")
	public String getPessoa(@RequestParam(value = "id", defaultValue = "null") int id, 
			@RequestParam(value = "nome", defaultValue = "null") String nome,
			@RequestParam(value = "idade", defaultValue = "null") int idade) {
		
			PessoaModel p = new PessoaModel(id, nome, idade);
		return "id = " + p.getId() + " nome = " + p.getNome() + " idade = " + p.getIdade();
	}
	
	@GetMapping("/addpessoa")
	public String addPessoa(@RequestParam(value = "nome", defaultValue = "null") String nome,
			@RequestParam(value = "idade", defaultValue = "null") int idade) {
                idPessoa = idPessoa + 1;
                PessoaModel p = new PessoaModel(idPessoa, nome, idade);
                pc.addPessoa(p);
                return p.getNome() + "foi adicionado com sucesso!";
    }*/
	
	@RequestMapping(path="/{nome}/{idade}")
	public String addP(@PathVariable("nome") String nome, @PathVariable("idade") int idade) {
        idPessoa = idPessoa + 1;
        PessoaModel p = new PessoaModel(idPessoa, nome, idade);
        pc.addPessoa(p);
        return p.getNome() + " foi adicionado com sucesso!";
	}
	
    
    @GetMapping("/imprimirpessoas")
    public String imprimir(){
       pw = new PessoaView(pc);
       String resposta = pw.listarPessoasHTML();
       return resposta;
    }
	

}