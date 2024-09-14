package br.com.tarefaSpring1.Tarefa1Spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Medico extends Pessoa {
	
	@Column(name = "especialidade", length = 100)
	private String Especialidadde;
	
}
