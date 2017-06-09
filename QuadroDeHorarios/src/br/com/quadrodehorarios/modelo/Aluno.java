package br.com.quadrodehorarios.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Aluno 
{
	@Id @GeneratedValue private Long id;
	private String turma;
	private String turno;
	@ManyToMany private Collection<Professor> professores;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId( Long id ) 
	{
		this.id = id;
	}
	
	public String getTurma() 
	{
		return turma;
	}
	
	public void setTurma( String turma ) 
	{
		this.turma = turma;
	}
	
	public String getTurno()
	{
		return turno;
	}
	
	public void setTurno( String turno ) 
	{
		this.turno = turno;
	}
	
	public Collection<Professor> getProfessores() 
	{
		return professores;
	}
	
	public void setProfessores( Collection<Professor> professores )
	 {
		this.professores = professores;
	}
}