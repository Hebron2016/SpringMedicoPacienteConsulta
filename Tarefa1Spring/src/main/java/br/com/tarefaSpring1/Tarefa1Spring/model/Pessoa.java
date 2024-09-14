package br.com.tarefaSpring1.Tarefa1Spring.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pessoa")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {

	@Id
	@Column( name = "codigo", nullable = false)
	private int codigo;
	@Column( name = "nome",length = 100, nullable = false)
	private String nome;
	@Column( name = "ruaEndereco",length = 100, nullable = false)
	private String ruaEndereco;
	@Column( name = "numeroEndereco", nullable = false)
	private int numeroEndereco;
	@Column( name = "cepEndereco", nullable = false)
	private int cepEndereco;
	@Column( name = "complEndereco",length = 100, nullable = false)
	private String complEndereco;
	@Column( name = "telefone", nullable = false)
	private int telefone;
	
}
