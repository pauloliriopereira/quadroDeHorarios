package br.com.quadrodehorarios.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Turno 
{
	@Id @GeneratedValue private Long id;
	private String periodo;
	@ManyToMany private Collection<Usuario> usuarios;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId( Long id )
	{
		this.id = id;
	}
	
	public String getPeriodo() 
	{
		return periodo;
	}
	
	public void setPeriodo(String periodo) 
	{
		this.periodo = periodo;
	}
	
	public Collection<Usuario> getUsuarios() 
	{
		return usuarios;
	}
	
	public void setUsuarios( Collection<Usuario> usuarios ) 
	{
		this.usuarios = usuarios;
	}
}