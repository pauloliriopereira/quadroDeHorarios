package br.com.quadrodehorarios.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Professor 
{
	@Id @GeneratedValue private Long id;
	private String nome;
	private String situacao;
	@ManyToMany private Collection<Aluno> alunos;
	@ManyToMany private Collection<Sala> salas;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome( String nome ) 
	{
		this.nome = nome;
	}
	
	public String getSituacao() 
	{
		return situacao;
	}
	
	public void setSituacao( String situacao ) 
	{
		this.situacao = situacao;
	}
	
	public Collection<Aluno> getAlunos()
	{
		return alunos;
	}
	
	public void setAlunos( Collection<Aluno> alunos )
	{
		this.alunos = alunos;
	}
	
	public Collection<Sala> getSalas() 
	{
		return salas;
	}
	
	public void setSalas( Collection<Sala> salas ) 
	{
		this.salas = salas;
	}
}