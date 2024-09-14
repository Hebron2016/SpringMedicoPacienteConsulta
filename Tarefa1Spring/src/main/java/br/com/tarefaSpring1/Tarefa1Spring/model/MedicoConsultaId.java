package br.com.tarefaSpring1.Tarefa1Spring.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class MedicoConsultaId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Medico medico;
	private Consulta consulta;
}
