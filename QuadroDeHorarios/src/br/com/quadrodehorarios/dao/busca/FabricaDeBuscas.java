package br.com.quadrodehorarios.dao.busca;

import br.com.quadrodehorarios.dao.Buscar;

public class FabricaDeBuscas 
{
	public Buscar criaBusca( String tipo )
	{
		Buscar buscar = null;
		
		switch( tipo ) 
		{	
			case "usuarios" : buscar = new BuscaTodosUsuarios();
			break;
			
			case "turnos" : buscar = new BuscaTodosTurnos();
			break;
			
			case "horarios" : buscar = new BuscaTodosHorarios();
			break;
			
			case "salas" : buscar = new BuscaTodasSalas();
			break;
			
			case "tempos" : buscar = new BuscaTodosTempos();
			break;
			
			case "turmas" : buscar = new BuscaTodasTurmas();
			break;
		}
		
		return buscar;
	}

}