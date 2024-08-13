package br.sc.senac.ads.vemnox1.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Carta {

@Id
@GeneratedValue
private int id;
private String nome;
private int forca;
private int inteligencia;
private int velocidade;
private LocalDate dataCadastro;

}
