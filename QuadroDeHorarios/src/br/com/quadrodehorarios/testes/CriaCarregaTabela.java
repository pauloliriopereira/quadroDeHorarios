package br.com.quadrodehorarios.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.quadrodehorarios.dao.GerenciadorDeTabelas;
import br.com.quadrodehorarios.modelo.Professor;
import br.com.quadrodehorarios.modelo.Sala;
import br.com.quadrodehorarios.modelo.Tempo;
import br.com.quadrodehorarios.modelo.Turma;
import br.com.quadrodehorarios.modelo.Turno;

public class CriaCarregaTabela
{
	public static void main( String[] args ) throws IOException 
	{
		geraTabelas();
		carregaTabelaProfessor( "professor.txt" );
		carregaTabelaSala( "salas.txt" );
		carregaTabelaTempo( "tempos.txt" );
		carregaTabelaTurma( "turmas.txt" );
		carregaTabelaTurno( "turnos.txt" );
	}
	
	private static void geraTabelas()
	{
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory( "bd_quadroDeHorarios" );
		factory.close();
	}
	
	private static void carregaTabelaProfessor( String nomeArquivo ) throws IOException
	{
		InputStream is = new FileInputStream( nomeArquivo );
	    InputStreamReader isr = new InputStreamReader( is, "UTF-8" );
	    BufferedReader br = new BufferedReader( isr );
	    String s = br.readLine();
	    Professor professor;
	    
	    EntityManager manager = GerenciadorDeTabelas.iniciarManipulacao();
	    manager.getTransaction().begin();
		
		while( s != null )
		{
			professor = new Professor();
			professor.setNomeDoHorario( s );
			manager.persist( professor );
			s = br.readLine();
		}
		
		manager.getTransaction().commit();
		manager.close();
		GerenciadorDeTabelas.fechar();
		br.close();
	}
	
	private static void carregaTabelaSala( String nomeArquivo ) throws IOException
	{
		InputStream is = new FileInputStream( nomeArquivo );
	    InputStreamReader isr = new InputStreamReader( is, "UTF-8" );
	    BufferedReader br = new BufferedReader( isr );
	    String s = br.readLine();
	    Sala sala;
	    
	    EntityManager manager = GerenciadorDeTabelas.iniciarManipulacao();
	    manager.getTransaction().begin();
		
		while( s != null )
		{
			sala = new Sala();
			sala.setIdentificacao( s );
			manager.persist( sala );
			s = br.readLine();
		}
		
		manager.getTransaction().commit();
		manager.close();
		GerenciadorDeTabelas.fechar();
		br.close();
	}
	
	private static void carregaTabelaTempo( String nomeArquivo ) throws IOException
	{
		InputStream is = new FileInputStream( nomeArquivo );
	    InputStreamReader isr = new InputStreamReader( is, "UTF-8" );
	    BufferedReader br = new BufferedReader( isr );
	    String s = br.readLine();
	    Tempo tempo;
	    
	    EntityManager manager = GerenciadorDeTabelas.iniciarManipulacao();
	    manager.getTransaction().begin();
		
		while( s != null )
		{
			tempo = new Tempo();
			tempo.setTempo( Long.parseLong( s ) );
			manager.persist( tempo );
			s = br.readLine();
		}
		
		manager.getTransaction().commit();
		manager.close();
		GerenciadorDeTabelas.fechar();
		br.close();
	}
	
	private static void carregaTabelaTurma( String nomeArquivo ) throws IOException
	{
		InputStream is = new FileInputStream( nomeArquivo );
	    InputStreamReader isr = new InputStreamReader( is, "UTF-8" );
	    BufferedReader br = new BufferedReader( isr );
	    String s = br.readLine();
	    Turma turma;
	    
	    EntityManager manager = GerenciadorDeTabelas.iniciarManipulacao();
	    manager.getTransaction().begin();
		
		while( s != null )
		{
			turma = new Turma();
			turma.setCodigo( s );
			manager.persist( turma );
			s = br.readLine();
		}
		
		manager.getTransaction().commit();
		manager.close();
		GerenciadorDeTabelas.fechar();
		br.close();
	}
	
	private static void carregaTabelaTurno( String nomeArquivo ) throws IOException
	{
		InputStream is = new FileInputStream( nomeArquivo );
	    InputStreamReader isr = new InputStreamReader( is, "UTF-8" );
	    BufferedReader br = new BufferedReader( isr );
	    String s = br.readLine();
	    Turno turno;
	    
	    EntityManager manager = GerenciadorDeTabelas.iniciarManipulacao();
	    manager.getTransaction().begin();
		
		while( s != null )
		{
			turno = new Turno();
			turno.setPeriodo( s );
			manager.persist( turno );
			s = br.readLine();
		}
		
		manager.getTransaction().commit();
		manager.close();
		GerenciadorDeTabelas.fechar();
		br.close();
	}
}