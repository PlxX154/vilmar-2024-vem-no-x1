package br.sc.senac.ads.vemnox1.model.entity;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Jogador {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String email;
	
	private String senha;
	
	@Column(nullable = false)
	private LocalDate dataNascimento;
	
	
	
	private int totalPartidas;
	private double percentualVitorias;
	//private PerfilAcesso perfil;
	//private String idSessao;
}
