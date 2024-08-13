package br.sc.senac.ads.vemnox1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sc.senac.ads.vemnox1.model.entity.Carta;
import br.sc.senac.ads.vemnox1.servise.CartaService;
import jakarta.websocket.server.PathParam;

@RestController
public class CartaController {

	@Autowired
	private CartaService cartaService;
	
	@GetMapping
	public List<Carta> pesquisarTodas(){
		List<Carta> cartas = cartaService.pesquisarTodas();
		
		return cartas;
	}
	
	
	public Carta consultarPorId(@PathParam int id){
		 return cartaService.consultarPorId(id);
	}
	
}
