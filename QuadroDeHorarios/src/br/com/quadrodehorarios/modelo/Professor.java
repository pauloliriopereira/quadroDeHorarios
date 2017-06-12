package br.com.quadrodehorarios.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Professor extends Usuario
{
	private String nomeDoHorario;
	private String situacao;
	@ManyToMany private Collection<Aluno> alunos;
	@ManyToMany private Collection<Sala> salas;
	
	public String getNomeDoHorario() 
	{
		return nomeDoHorario;
	}
	
	public void setNomeDoHorario( String nomeDoHorario ) 
	{
		this.nomeDoHorario = nomeDoHorario;
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