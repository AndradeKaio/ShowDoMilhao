package com.milhao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Perguntas extends JFrame 
{
	private JTextField txfPergunta;
	private JTextField txfA;
	private JTextField txfB;
	private JTextField txfC;
	private JTextField txfD;
	
	private String pergunta;		//pergunta da janela
	private String altA, altB, altC, altD; 								
	
	
	private short codigo; 
	private char lapide;   //5000 < pergunta medio //10000 < pergunta dificil
	private String texto;           
	private double dinheiro;
	
	
	JCheckBox nivelFacil;
	JCheckBox nivelMedio;
	JCheckBox nivelDificil;
	
	BancoDeDados cadastroBase, wPerguntasFacil, wPerguntasMedio, wPerguntasDificil = null;
	
	private JCheckBox altAcorreta;
	private JCheckBox altBcorreta;
	private JCheckBox altCcorreta;
	private JCheckBox altDcorreta;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	
	
	public Perguntas()
	{
		
		getContentPane().setBackground(Color.DARK_GRAY);
		
		JTextPane txtfpMsg1 = new JTextPane();
		txtfpMsg1.setForeground(Color.WHITE);
		txtfpMsg1.setBackground(Color.DARK_GRAY);
		txtfpMsg1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		txtfpMsg1.setEditable(false);
		txtfpMsg1.setText("  Digite a Pergunta:");
		
		txfPergunta = new JTextField();
		txfPergunta.setColumns(10);
		
		JTextPane txtpnDigiteAsAlternativas = new JTextPane();
		txtpnDigiteAsAlternativas.setBackground(Color.DARK_GRAY);
		txtpnDigiteAsAlternativas.setForeground(Color.WHITE);
		txtpnDigiteAsAlternativas.setText("Digite as alternativas:");
		txtpnDigiteAsAlternativas.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		txtpnDigiteAsAlternativas.setEditable(false);
		
		txfA = new JTextField();
		txfA.setColumns(10);
		
		txfB = new JTextField();
		txfB.setColumns(10);	
		
		txfC = new JTextField();
		txfC.setColumns(10);
				
		txfD = new JTextField();
		txfD.setColumns(10);
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() 
		{  
            public void actionPerformed(ActionEvent e) 
            {  
            	texto = txfPergunta.getText();
    			altA = txfA.getText();
    			altB = txfB.getText();
    			altC = txfC.getText();
    			altD = txfD.getText();
    				
    			if( allTrue())
    			{
    				JOptionPane.showMessageDialog(null,
    					    "Por favor, preencha corretamente os campos!",
    					    "Inane error",
    					    JOptionPane.ERROR_MESSAGE);
    			}
    			else
    			{
    				JOptionPane.showMessageDialog(null, "Cadastrador com sucesso! \n"+ 
    										  texto + " \n" + altA + " \n"+ altB + "\n" + altC + "\n"  + altD );
    				cadastrarPergunta();
    				dispose();						
    			}
            }  
        });  
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				txfPergunta.setText("");
				txfA.setText("");
				txfB.setText("");
				txfC.setText("");
				txfD.setText("");
				
			}
		});
		
		nivelFacil = new JCheckBox("F\u00E1cil");
		buttonGroup_1.add(nivelFacil);
		nivelFacil.setBackground(Color.DARK_GRAY);
		nivelFacil.setForeground(Color.WHITE);
		
		nivelMedio = new JCheckBox("M\u00E9dio");
		buttonGroup_1.add(nivelMedio);
		nivelMedio.setBackground(Color.DARK_GRAY);
		nivelMedio.setForeground(Color.WHITE);
		
		nivelDificil = new JCheckBox("Dif\u00EDcil");
		buttonGroup_1.add(nivelDificil);
		nivelDificil.setForeground(Color.WHITE);
		nivelDificil.setBackground(Color.DARK_GRAY);
		
		altAcorreta = new JCheckBox("");
		buttonGroup.add(altAcorreta);
		altAcorreta.setBackground(Color.DARK_GRAY);
		altAcorreta.setForeground(Color.DARK_GRAY);
		
		altBcorreta = new JCheckBox("");
		buttonGroup.add(altBcorreta);
		altBcorreta.setBackground(Color.DARK_GRAY);
		
		altCcorreta = new JCheckBox("");
		buttonGroup.add(altCcorreta);
		altCcorreta.setBackground(Color.DARK_GRAY);
		
		altDcorreta = new JCheckBox("");
		buttonGroup.add(altDcorreta);
		altDcorreta.setBackground(Color.DARK_GRAY);
		

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(80)
							.addComponent(txtfpMsg1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(83)
							.addComponent(txtpnDigiteAsAlternativas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txfD, Alignment.LEADING)
								.addComponent(txfC, Alignment.LEADING)
								.addComponent(txfB, Alignment.LEADING)
								.addComponent(txfA, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(altAcorreta, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(altBcorreta, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(altCcorreta, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(altDcorreta, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(12))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(nivelFacil)
						.addComponent(btnCadastrar))
					.addGap(18)
					.addComponent(nivelMedio)
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(nivelDificil)
						.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
					.addGap(31))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txfPergunta, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(txtfpMsg1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txfPergunta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(txtpnDigiteAsAlternativas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txfA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txfB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(altBcorreta, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txfC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(altCcorreta, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txfD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(altDcorreta, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
						.addComponent(altAcorreta))
					.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(nivelFacil)
						.addComponent(nivelMedio)
						.addComponent(nivelDificil))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar)
						.addComponent(btnLimpar))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		
}

	public boolean allTrue()
	{
		boolean retorno = false;
		if( texto.equals("") || altA.equals("") || altB.equals("") 
				             || altC.equals("") || altD.equals("") || !nivelFacil.isSelected() 
				             & !nivelMedio.isSelected() & !nivelDificil.isSelected() || !altAcorreta.isSelected()
				             & !altBcorreta.isSelected() & !altCcorreta.isSelected() & !altDcorreta.isSelected())
		{
			retorno = true;
		}
		else if ( nivelFacil.isSelected() & nivelMedio.isSelected() & nivelFacil.isSelected() || 
				  altAcorreta.isSelected() & altBcorreta.isSelected() & altCcorreta.isSelected() & altDcorreta.isSelected())
		{
			retorno = true;
		}
		else
		{
			retorno = false;
		}
		
		return retorno;
	}
	
	public char getLapide()
	{
		return this.lapide;
	}
	public void setLapide(boolean situacao)
	{
		if( situacao )
		{
			this.lapide = '*';
		}
		else
		{
			this.lapide = ' ';
		}
	}


	public BancoDeDados selectNivelPerguntas()
	{
		if( nivelFacil.isSelected() )
		{
			return wPerguntasFacil = new BancoDeDados("nivelFacil.txt");
		}
		else if( nivelMedio.isSelected())
		{
			return wPerguntasMedio = new BancoDeDados("nivelMedio.txt");
		}
		else if( nivelDificil.isSelected())
		{
			return wPerguntasDificil = new BancoDeDados("nivelDificil.txt");
		}
		
		return null;
	}
	public String alternativaCorreta()
	{
		if( altAcorreta.isSelected())
		{
			
		}
		return "";
	}
	public void cadastrarPergunta( )
	{
			
		//iniciaVetor();
		
		
		BancoDeDados corrent = null;
		corrent = selectNivelPerguntas();
		
		String pergunta ="";
		setLapide(false);
		
		pergunta += getLapide();
		pergunta += txfPergunta.getText(); 
		
		pergunta += "#A)"+ altA+"#B)"+ altB+ "#C)"+altC+"#D)"+altD;
		
		corrent.writeArchiveString(pergunta);
		corrent.close();
	}
	
	
	public void pesquisarPergunta()
	{
		
	}	
	public void alterarPergunta()
	{
		
	}		
	public boolean excluirPergunta(short s)
	{
		return true;
	}
	

	public String getTxfPergunta() {
		return txfPergunta.getText();
	}
	public void setTxfPergunta(JTextField txfPergunta) {
		this.txfPergunta = txfPergunta;
	}
	public String getTxfA() {
		return txfA.getText();
	}
	public void setTxfA(JTextField txfA) {
		this.txfA = txfA;
	}
	public String getTxfB() {
		return txfB.getText();
	}
	public void setTxfB(JTextField txfB) {
		this.txfB = txfB;
	}
	public String getTxfC() {
		return txfC.getText();
	}
	public void setTxfC(JTextField txfC) {
		this.txfC = txfC;
	}
	public String getTxfD() {
		return txfD.getText();
	}
	public void setTxfD(JTextField txfD) {
		this.txfD = txfD;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getAltA() {
		return altA;
	}
	public void setAltA(String altA) {
		this.altA = altA;
	}
	public String getAltB() {
		return altB;
	}
	public void setAltB(String altB) {
		this.altB = altB;
	}
	public String getAltC() {
		return altC;
	}
	public void setAltC(String altC) {
		this.altC = altC;
	}
	public String getAltD() {
		return altD;
	}
	public void setAltD(String altD) {
		this.altD = altD;
	}
}
