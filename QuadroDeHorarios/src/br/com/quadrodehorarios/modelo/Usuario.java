package br.com.quadrodehorarios.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;

@NamedQuery( name="Usuario.buscaTodos", query="SELECT p FROM Usuario p" )
@Entity
@Inheritance( strategy = InheritanceType.JOINED )
public class Usuario 
{
	@Id @GeneratedValue( strategy = GenerationType.AUTO ) private Long id;
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

	public Collection<Turno> getTurnos() 
	{
		return turnos;
	}

	public void setTurnos( Collection<Turno> turnos ) 
	{
		this.turnos = turnos;
	}
}