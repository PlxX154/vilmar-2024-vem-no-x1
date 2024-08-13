package br.sc.senac.ads.vemnox1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sc.senac.ads.vemnox1.model.entity.Carta;

public interface CartaRepository extends JpaRepository<Carta, Integer> {

}
