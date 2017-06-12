package br.com.quadrodehorarios.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance( strategy = InheritanceType.JOINED )
public class Usuario 
{
	@Id @GeneratedValue private Long id;
	private String nome;
	private String senha;
	@ManyToMany private Collection<Turno> turnos;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId( Long id ) 
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
	
	public String getSenha() 
	{
		return senha;
	}
	
	public void setSenha( String senha ) 
	{
		this.senha = senha;
	}
}