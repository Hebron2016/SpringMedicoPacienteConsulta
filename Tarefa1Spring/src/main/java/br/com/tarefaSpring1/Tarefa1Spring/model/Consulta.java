package br.com.tarefaSpring1.Tarefa1Spring.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "consulta")
@Data
public class Consulta {
	
	@Id
	@Column(name= "data", nullable = false)
	private LocalDate data;
	@Id
	@Column(name= "hora", nullable = false)
	private int hora;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Paciente.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "pacientePessoaCodigo", nullable = false)
	private Paciente PacientePessoaCodigo;
	
}
