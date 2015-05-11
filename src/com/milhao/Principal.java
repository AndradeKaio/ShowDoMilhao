package com.milhao;


//package com.show.milhao;

import java.io.IOException;

import javax.swing.JFrame;

public class Principal 
{
	
	public static void menuPrincipal()
	{
		Login menu = new Login();
		menu.setVisible(true);
		menu.setSize(349,248);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setLocation(500,250);
		menu.setResizable(false);
		
	}
	public static void criarConta()//teste
	{
		CriarConta acc = new CriarConta();
		acc.setVisible(true);
		//acc.setSize(370, 300);
		//acc.setResizable(false);
		acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		acc.cadastrar();
	}
	public static void perguntas()
	{
		Perguntas jp = new Perguntas();
		jp.setVisible(true);
		jp.setSize(328, 407);
		jp.setResizable(false);
		jp.setLocation(500, 250);
		jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) throws IOException 
	{
		//menuPrincipal();
		//criarConta();
		perguntas();
			
	}

}
