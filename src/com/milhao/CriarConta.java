package com.milhao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;


public class CriarConta extends JFrame
{
	private String nome;
	private String login;
	private String senha;
	private int Pontuação;
	private boolean inGame;
	

	private BancoDeDados baseJogador = null;
	private JTextField txfNome;
	private JTextField txfLogin;
	private JPasswordField psfSenha;
	
	
	private JButton btnCadastrar_1 = null;	
	private JButton btnCancelar_1 = null;
	
	public CriarConta()
	{
		JFrame janelaCadastroJogador = new JFrame("Cadastrar Jogador");
		janelaCadastroJogador.getContentPane().setBackground(Color.DARK_GRAY);
		
		JLabel lblCriarNovaConta = new JLabel("CRIAR NOVA CONTA");
		lblCriarNovaConta.setForeground(Color.WHITE);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setForeground(Color.WHITE);
		
		txfNome = new JTextField();
		txfNome.setColumns(10);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		
		txfLogin = new JTextField();
		txfLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setForeground(Color.WHITE);
		
		psfSenha = new JPasswordField();
		
		configureButtons();
		eventButtons();
		
		
		
		GroupLayout groupLayout = new GroupLayout(janelaCadastroJogador.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSenha)
								.addComponent(lblNome)
								.addComponent(lblLogin))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(psfSenha)
								.addComponent(txfLogin)
								.addComponent(txfNome, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(108)
							.addComponent(lblCriarNovaConta))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnCadastrar_1)
							.addGap(172)
							.addComponent(btnCancelar_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCriarNovaConta)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(txfLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(psfSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar_1)
						.addComponent(btnCancelar_1))
					.addContainerGap())
		);
		
		janelaCadastroJogador.getContentPane().setLayout(groupLayout);
		baseJogador = new BancoDeDados("BaseJogadores.txt");
		
		
	}//End Construtor
	
	/**
	 * Configura os botoes
	 */
	public void configureButtons()
	{
		btnCancelar_1 = new JButton("Cancelar");
		
		btnCadastrar_1 = new JButton("Cadastrar");	
	}
	
	/**
	 * Trata evento dos botoes
	 * btnCadastrar
	 * btnCancelar
	 */
	public void eventButtons()
	{
		btnCancelar_1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
				
			}
		});
		
		btnCadastrar_1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				//Escrever em disco os dados do jogador
				
			}
		});
	}
	/**
	 * Seta as configurações
	 * para a criação da janela como
	 * evento em um botao de outra tela
	 */
	public void cadastrar()
	{
		
	}
	
}
