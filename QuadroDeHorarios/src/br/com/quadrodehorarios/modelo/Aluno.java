package br.com.quadrodehorarios.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Aluno extends Usuario
{
	private String turma;
	@ManyToMany private Collection<Professor> professores;
	
	public String getTurma() 
	{
		return turma;
	}
	
	public void setTurma( String turma ) 
	{
		this.turma = turma;
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