package br.com.quadrodehorarios.dao.cadastro;

import javax.persistence.EntityManager;

import br.com.quadrodehorarios.dao.Cadastrar;
import br.com.quadrodehorarios.dao.GerenciadorDeTabelas;

public class CadastroSimples extends Cadastrar 
{
	@Override
	public <T> void cadastar( T objeto )
	{
		EntityManager manager = GerenciadorDeTabelas.iniciarManipulacao();
		
		manager.getTransaction().begin();
		manager.persist( objeto );
		manager.getTransaction().commit();
		manager.close();
		
		GerenciadorDeTabelas.fechar();
	}
}