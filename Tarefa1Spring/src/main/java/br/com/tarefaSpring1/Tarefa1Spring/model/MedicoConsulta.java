package br.com.tarefaSpring1.Tarefa1Spring.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Medico_consulta")
@Data
@IdClass(MedicoConsultaId.class)
public class MedicoConsulta {
	@Id
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Medico.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "medicoPessoa", nullable = false)
	private Medico medico;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Consulta.class, fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn( name = "consultaData", nullable = false), @JoinColumn( name = "consultaHora", nullable = false)})
	private Consulta consulta;
	
}
