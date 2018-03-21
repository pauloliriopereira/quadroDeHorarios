package br.com.quadrodehorarios.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.quadrodehorarios.dao.Cadastrar;
import br.com.quadrodehorarios.dao.cadastro.FabricaDeCadastros;
import br.com.quadrodehorarios.dao.cadastro.IniciarCadastro;
import br.com.quadrodehorarios.modelo.Turma;

public class TestaCadastro 
{
	public static void main( String[] args ) 
	{
		IniciarCadastro ic = new IniciarCadastro( new FabricaDeCadastros() );
		Cadastrar cadastro = ic.criaCadastro( "simples" );
		
		Turma turma1 = new Turma();
		turma1.setCodigo( "3252" );
		
		cadastro.cadastar( turma1 );
		
		Turma turma2 = new Turma();
		turma2.setCodigo( "3253" );
		
		Turma turma3 = new Turma();
		turma3.setCodigo( "3254" );
		
		List<Turma> turmas = new ArrayList<Turma>();
		turmas.add( turma2 );
		turmas.add( turma3 );
		
		cadastro = ic.criaCadastro( "lista" );
		cadastro.cadastar( turmas.toArray() );
	}
}