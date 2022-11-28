package questao04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Inserir extends JPanel{
	JLabel digite;
	JTextField caixa;
	JButton botao;
	
	public Inserir() {
		setPreferredSize(new Dimension(565, 122));
		organizarLayout();
	}
	
	private void organizarLayout() {
		setLayout(new GridLayout(2,2));
		setBorder(new EmptyBorder(10,10,10,10));
		
			
		digite = new JLabel();
		digite.setText("Digite o número:");
		add(digite);
		JLabel digite2 = new JLabel();
		add(digite2);

		
		caixa = new JTextField();
		caixa.setColumns(5);
		add(caixa);
		
		
		botao = new JButton();
		botao.setText("OK");
		botao.setPreferredSize(new Dimension(10,10));
		add(botao);
		
	}
}
