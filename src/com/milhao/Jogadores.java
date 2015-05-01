package com.milhao;

public class Jogadores
{
	private String nome;
	private String login;
	private String senha;
	private int Pontua��o;
	private boolean inGame;
	
	
	private BancoDeDados baseJogador = null;
	

	public Jogadores()
	{
		
		baseJogador = new BancoDeDados("BaseJogadores.txt");
		
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

	public int getPontua��o() {
		return Pontua��o;
	}

	public void setPontua��o(int pontua��o) {
		Pontua��o = pontua��o;
	}

	public boolean isInGame() {
		return inGame;
	}

	public void setInGame(boolean inGame) {
		this.inGame = inGame;
	}

	
}
