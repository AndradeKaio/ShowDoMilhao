package com.milhao;


//package com.show.milhao;

import java.io.IOException;

import javax.swing.JFrame;

public class MainDados 
{

	public static void main(String[] args) throws IOException 
	{
		Perguntas jp = new Perguntas();
		jp.setVisible(true);
		jp.setSize(328, 407);
		jp.setResizable(false);
		jp.setLocation(500, 250);
		jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}
