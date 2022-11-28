package questao03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Background extends JFrame implements ActionListener{
	
	String mensagem = "";
	JTextField text;
	
	public Background() {
		text = new JTextField(10);
		criarCaixaInput();
		
	}
	
	
	private void criarCaixaInput() {
		setSize(432,130);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Testing JTextField and JPasswordField");
		JButton botao = new JButton();
		botao.setText("ENVIAR");
		botao.setBackground(Color.WHITE);
		add(text);
		add(botao);
		botao.addActionListener(this);
		setVisible(true);
	}


	public void actionPerformed(ActionEvent arg0) {
		mensagem = text.getText();
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
