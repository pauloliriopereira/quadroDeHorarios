package br.com.quadrodehorarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tempo 
{
	@Id @GeneratedValue( strategy = GenerationType.AUTO ) private Long id;
	@Column( unique = true ) private Long tempo;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	
	public Long getTempo() 
	{
		return tempo;
	}
	
	public void setTempo( Long tempo ) 
	{
		this.tempo = tempo;
	}
}