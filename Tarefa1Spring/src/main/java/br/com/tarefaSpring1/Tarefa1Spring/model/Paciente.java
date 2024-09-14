package br.com.tarefaSpring1.Tarefa1Spring.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "paciente")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Paciente extends Pessoa{

	@Column(name = "numeroBeneficiario", nullable = false)
	private int numeroBeneficiario;
	
}
