package br.sc.senac.ads.vemnox1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sc.senac.ads.vemnox1.model.entity.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer>{

}
