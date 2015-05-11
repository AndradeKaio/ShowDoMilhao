package com.milhao;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends JFrame
{
		private JFrame window = null;
		private JLabel label = null;
		
		private JPasswordField btnSenha = null;
		
		
		private JButton btnCriarConta  = null;
		private JButton btnCriarConta_1;
		private ImageIcon imgJogar = null;
		private JTextField textField;
		private JTextField textField_1;
		private JButton btnConectar = null;
		private JButton btnConectar_1;
		private JButton btnSair = null;
		private JButton btnSair_1;
		private JLabel lblLogin;
		private JLabel lblSenha;
		/**
		 * Tratamento de evento
		 * para os Buttons
		 */
		
		public void configureButtons()
		{
			btnCriarConta_1 = new JButton("Criar Conta");
			btnCriarConta_1.setBackground(Color.WHITE);
			btnSair_1 = new JButton("Sair");
			btnSair_1.setBackground(Color.WHITE);
			btnConectar_1 = new JButton("Conectar");
			btnConectar_1.setBackground(Color.WHITE);
		}
		public void eventButtons()
		{
		
			/**
			 * Criar nova conta para usuario.
			 * Abrir novo menu para cadastro.
			 */
			btnCriarConta_1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					CriarConta acc = new CriarConta();
					acc.cadastrar();
				}
			});
			
			/**
			 * Fechar Janela.
			 */
			btnSair_1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					dispose();
				}
			});
			
			/**
			 * Autenticar usuario e senha.
			 * Abrir novo menu para usuario jogar. 
			 */
			btnConectar_1.addActionListener( new ActionListener()
			{
				public void actionPerformed( ActionEvent e )
				{
					//Chamar novo menu
					//validar a conta
				}
			});
		}
		
		
		/**
		 * Construtor Padrao
		 */
		public Login()
		{
			getContentPane().setForeground(Color.DARK_GRAY);
			getContentPane().setBackground(Color.DARK_GRAY);
			window = new JFrame("Show Do Milhão");
			
			configureButtons();
			
			eventButtons();
			textField = new JTextField();
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			
			JLabel lblShowDoMilho = new JLabel("Show Do Milh\u00E3o");
			lblShowDoMilho.setForeground(Color.WHITE);
			
			lblLogin = new JLabel("LOGIN");
			lblLogin.setForeground(Color.WHITE);
			
			lblSenha = new JLabel("SENHA");
			lblSenha.setForeground(Color.WHITE);
			GroupLayout groupLayout = new GroupLayout(getContentPane());
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(39)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblLogin)
									.addComponent(lblSenha))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField, Alignment.LEADING)
									.addComponent(textField_1, Alignment.LEADING)
									.addComponent(btnConectar_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(124)
								.addComponent(lblShowDoMilho))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(btnCriarConta_1)
								.addPreferredGap(ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
								.addComponent(btnSair_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(27)
						.addComponent(lblShowDoMilho)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblLogin))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblSenha))
						.addGap(18)
						.addComponent(btnConectar_1)
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCriarConta_1)
							.addComponent(btnSair_1))
						.addContainerGap(76, Short.MAX_VALUE))
			);
			getContentPane().setLayout(groupLayout);
		}
}
