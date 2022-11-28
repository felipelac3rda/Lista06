package questao04;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Background extends JFrame{
	
	public Background() {
		setSize(565,350);
		organizarLayout();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		Inserir i = new Inserir();
		Resultados r = new Resultados();
		add(i, BorderLayout.NORTH);
		add(r, BorderLayout.SOUTH);
	}
}
