package questao01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Background extends JFrame {

	public Background() {
		organizarLayout();
	}

	private void organizarLayout() {
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		ParteDeCima cima = new ParteDeCima();
		ParteDeBaixo baixo = cima.getBaixo();
		
		add(cima, BorderLayout.NORTH);
		add(baixo, BorderLayout.SOUTH);
		setVisible(true);

	}
}
