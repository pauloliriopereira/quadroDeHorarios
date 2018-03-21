package br.com.quadrodehorarios.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Aluno extends Usuario
{
	@OneToMany private Collection<Turma> turmas = new ArrayList<Turma>();

	public Collection<Turma> getTurmas() 
	{
		return turmas;
	}

	public void setTurmas( Collection<Turma> turmas ) 
	{
		this.turmas = turmas;
	}
}