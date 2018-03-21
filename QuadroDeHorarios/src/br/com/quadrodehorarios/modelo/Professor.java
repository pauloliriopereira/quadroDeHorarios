package br.com.quadrodehorarios.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Professor extends Usuario
{
	@Column( unique = true ) private String nomeDoHorario;
	@OneToMany private Collection<Turma> turmas = new ArrayList<Turma>();
	
	public String getNomeDoHorario() 
	{
		return nomeDoHorario;
	}
	
	public void setNomeDoHorario( String nomeDoHorario ) 
	{
		this.nomeDoHorario = nomeDoHorario;
	}
	
	public Collection<Turma> getTurmas() 
	{
		return turmas;
	}
	
	public void setTurmas( Collection<Turma> turmas ) 
	{
		this.turmas = turmas;
	}
}