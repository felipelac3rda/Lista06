package questao02;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Background extends JFrame{

	public Background() {
		organizarLayout();
	}
	
	private void organizarLayout() {
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Botoes botoes = new Botoes();
		Display display = botoes.getDisplay();
		add(botoes, BorderLayout.SOUTH);
		add(display, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
}
