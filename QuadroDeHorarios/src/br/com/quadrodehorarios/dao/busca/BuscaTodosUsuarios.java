package br.com.quadrodehorarios.dao.busca;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.quadrodehorarios.dao.Buscar;
import br.com.quadrodehorarios.dao.GerenciadorDeTabelas;
import br.com.quadrodehorarios.modelo.Usuario;

public class BuscaTodosUsuarios implements Buscar 
{
	@Override
	public Collection buscar() 
	{
		EntityManager manager = GerenciadorDeTabelas.iniciarManipulacao();
		Query consulta = manager.createNamedQuery( "Usuario.buscaTodos" );
		List<Usuario> usuarios = consulta.getResultList();
			
		GerenciadorDeTabelas.fechar();
		return usuarios;
	}

	@Override
	public void buscar(Long id) {
		// TODO Auto-generated method stub
		
	}
}