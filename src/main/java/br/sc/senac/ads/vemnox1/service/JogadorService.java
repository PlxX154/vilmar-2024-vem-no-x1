package br.sc.senac.ads.vemnox1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sc.senac.ads.vemnox1.model.entity.Jogador;
import br.sc.senac.ads.vemnox1.model.repository.JogadorRepository;
import br.sc.senac.ads.vemonox1.exception.Vemnox1Exception;


@Service
public class JogadorService {

	@Autowired
	private JogadorRepository repository;
	
	public List<Jogador> pesquisarTodos(){
		return repository.findAll();
	}
	
	public Jogador pesquisarPorId(int id) {
		return repository.findById(id).get();
	}

	public Jogador inserir(Jogador novoJogador) {
		//TODO incluir depois
		//validarPerfilJogador(novoJogador);
		return repository.save(novoJogador);
	}

	public Jogador atualizar(Jogador jogadorAtualizado) throws Vemnox1Exception {
		
		if(jogadorAtualizado.getId() == null) {
			throw new Vemnox1Exception("Informe o ID");
		}
		
		return repository.save(jogadorAtualizado);
	}
}
