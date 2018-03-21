package br.com.quadrodehorarios.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerenciadorDeTabelas 
{
	private static EntityManagerFactory factory;
	
	public static EntityManager iniciarManipulacao()
	{
		factory = Persistence.createEntityManagerFactory( "bd_quadroDeHorarios" );
		return factory.createEntityManager();
	}
	
	public static void fechar()
	{
		factory.close();
	}
}