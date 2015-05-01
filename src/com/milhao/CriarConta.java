package com.milhao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


public class CriarConta 
{
	private String nome;
	private String login;
	private String senha;
	private int Pontuação;
	private boolean inGame;
	
	private JButton btnFinalizar = null;
	private JButton btnLimparCaixas = null;
	private JButton btnCancelar = null;
	
	private JTextField jtfLogin = null;
	private JPasswordField jpfSenha = null;
	
	private BancoDeDados baseJogador = null;
	

	public CriarConta()
	{
		JFrame janelaCadastroJogador = new JFrame("Cadastrar Jogador");
		baseJogador = new BancoDeDados("BaseJogadores.txt");
		
		GroupLayout groupLayout = new GroupLayout(janelaCadastroJogador.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 262, Short.MAX_VALUE)
		);
		janelaCadastroJogador.getContentPane().setLayout(groupLayout);
		
		
	}

	
	public boolean inserirJogador(  String nome, String senha, String login)
	{
		this.senha = senha;
		this.nome = nome;
		this.login = login;	
		//Concatena todo mundo e escreve no arquivo
		String textoGrande = nome+login+senha;
		baseJogador.writeArchiveString(textoGrande);
		return true;		
	}
	
	public boolean pesquisarJogador()
	{
		return true;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPontuação() {
		return Pontuação;
	}

	public void setPontuação(int pontuação) {
		Pontuação = pontuação;
	}

	public boolean isInGame() {
		return inGame;
	}

	public void setInGame(boolean inGame) {
		this.inGame = inGame;
	}

	
}
