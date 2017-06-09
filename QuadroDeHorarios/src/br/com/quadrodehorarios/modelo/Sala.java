package br.com.quadrodehorarios.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sala 
{
	@Id @GeneratedValue private Long id;
	private String identificacao;
	@ManyToMany private Collection<Professor> professores;
	
	public Long getId() 
	{
		return id;
	}
	public void setId( Long id ) 
	{
		this.id = id;
	}
	public String getIdentificacao() 
	{
		return identificacao;
	}
	
	public void setIdentificacao( String identificacao ) 
	{
		this.identificacao = identificacao;
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