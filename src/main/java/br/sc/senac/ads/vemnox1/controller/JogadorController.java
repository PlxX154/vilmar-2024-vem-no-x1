package br.sc.senac.ads.vemnox1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sc.senac.ads.vemnox1.model.entity.Jogador;

@RestController
@RequestMapping(path = "/api/jogador")
public class JogadorController {
	
	@Autowired
	private JogadorService JogadorService;

	@GetMapping
	public List<Jogador> pesquisarTodos(){
		List<Jogador> cartas = JogadorService.pesquisarTodos();
		return cartas;
	}
}
