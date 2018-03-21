package br.com.quadrodehorarios.dao.cadastro;

import javax.persistence.EntityManager;

import br.com.quadrodehorarios.dao.Cadastrar;
import br.com.quadrodehorarios.dao.GerenciadorDeTabelas;

public class CadastroLista extends Cadastrar 
{
	@Override
	public <T> void cadastar( T[] objeto )
	{
		EntityManager manager = GerenciadorDeTabelas.iniciarManipulacao();
		
		manager.getTransaction().begin();
		
		for( T t : objeto ) 
		{
			manager.persist( t );
		}
		
		manager.getTransaction().commit();
		manager.close();
		
		GerenciadorDeTabelas.fechar();
	}
}