package br.com.quadrodehorarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery( name = "Turma.buscaAluno", query = "SELECT p FROM Turma p WHERE p.codigo = ?1" )
public class Turma 
{
	@Id @GeneratedValue( strategy = GenerationType.AUTO ) private Long id;
	@Column( unique = true ) private String codigo;

	public Long getId() 
	{
		return id;
	}
	
	public void setId( Long id ) 
	{
		this.id = id;
	}
	
	public String getCodigo() 
	{
		return codigo;
	}
	
	public void setCodigo( String codigo ) 
	{
		this.codigo = codigo;
	}
}