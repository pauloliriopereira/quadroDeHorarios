package br.com.quadrodehorarios.dao.cadastro;

import br.com.quadrodehorarios.dao.Cadastrar;

public class IniciarCadastro 
{
	private FabricaDeCadastros fabricaDeCadastros;
	
	public IniciarCadastro( FabricaDeCadastros fabrica )
	{
		this.fabricaDeCadastros = fabrica;
	}
	
	public Cadastrar criaCadastro( String tipo )
	{
		Cadastrar cadastro = fabricaDeCadastros.criarCadastro( tipo );
		
		return cadastro;
	}
}