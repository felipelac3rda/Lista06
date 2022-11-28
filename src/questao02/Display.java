package questao02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Display extends JPanel implements ActionListener{
	private JTextField retorno;

	public Display() {
		organizarLayout();
	}

	private void organizarLayout() {
		setPreferredSize(new Dimension(400, 50));
		setLayout(new BorderLayout());
		retorno = new JTextField(5);
		retorno.setEditable(false);
		retorno.setBorder(new EmptyBorder(10,20,10,10));
		add(retorno, BorderLayout.CENTER);
		
	}


	public void actionPerformed(ActionEvent e) {
		JButton b =(JButton) e.getSource();
		retorno.setText(b.getText());
		
	}
	
	
}
