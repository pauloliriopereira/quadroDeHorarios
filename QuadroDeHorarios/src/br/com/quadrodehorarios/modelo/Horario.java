package br.com.quadrodehorarios.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Horario 
{
	@Id @GeneratedValue( strategy = GenerationType.AUTO ) private Long id;
	@OneToOne private Sala sala;
	@OneToOne private Turma turma;
	@OneToOne private Tempo tempo;
	@OneToOne private Professor professor;
	@OneToOne private Turno turno;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId( Long id ) 
	{
		this.id = id;
	}
	
	public Sala getSala() 
	{
		return sala;
	}
	
	public void setSala( Sala sala ) 
	{
		this.sala = sala;
	}
	
	public Turma getTurma() 
	{
		return turma;
	}
	
	public void setTurma( Turma turma ) 
	{
		this.turma = turma;
	}
	
	public Tempo getTempo() 
	{
		return tempo;
	}
	
	public void setTempo( Tempo tempo ) 
	{
		this.tempo = tempo;
	}
	
	public Professor getProfessor() 
	{
		return professor;
	}
	
	public void setProfessor( Professor professor ) 
	{
		this.professor = professor;
	}
	
	public Turno getTurno() 
	{
		return turno;
	}
	
	public void setTurno( Turno turno ) 
	{
		this.turno = turno;
	}
}