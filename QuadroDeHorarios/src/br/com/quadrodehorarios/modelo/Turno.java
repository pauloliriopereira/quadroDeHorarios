package br.com.quadrodehorarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turno 
{
	@Id @GeneratedValue( strategy = GenerationType.AUTO ) private Long id;
	@Column( unique = true ) private String periodo;
	
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
}