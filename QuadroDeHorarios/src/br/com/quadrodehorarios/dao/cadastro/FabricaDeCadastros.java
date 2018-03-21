package br.com.quadrodehorarios.dao.cadastro;

import br.com.quadrodehorarios.dao.Cadastrar;

public class FabricaDeCadastros 
{
	public Cadastrar criarCadastro( String tipo )
	{
		Cadastrar cadastro = null;
		
		switch( tipo ) 
		{
			case "simples" : cadastro = new CadastroSimples();
			break;
			
			case "lista" : cadastro = new CadastroLista();
			break;
		}
		
		return cadastro;
	}
}