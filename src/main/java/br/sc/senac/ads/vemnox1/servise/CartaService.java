package br.sc.senac.ads.vemnox1.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sc.senac.ads.vemnox1.model.entity.Carta;
import br.sc.senac.ads.vemnox1.model.repository.CartaRepository;

@Service
public class CartaService {
	
	@Autowired
	private CartaRepository cartaRepository;
	
	public List<Carta> pesquisarTodas(){
		return cartaRepository.findAll();
	}
	
	public Carta consultarPorId(int id) {
		return cartaRepository.findById(id).get();
	}

}
