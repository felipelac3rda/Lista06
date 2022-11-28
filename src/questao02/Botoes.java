package questao02;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Botoes extends JPanel {
	private Display display;

	public Botoes() {
		organizarLayout();
	}

	private void organizarLayout() {
		display = new Display();
		setPreferredSize(new Dimension(400, 170));
		criarBotoes();
	}
	
	
	private void criarBotoes() {
		String nomes[] = new String[6];
		nomes[0] = "Java";
		nomes[1] = "JavaScript";
		nomes[2] = "Python";
		nomes[3] = "C++";
		nomes[4] = "C#";
		nomes[5] = "C";
		for(int i = 0; i < nomes.length; i++) {
			JButton b = new JButton();
			b.setText(nomes[i]);
			b.setPreferredSize(new Dimension(100,30));
			b.setBackground(new Color(211,211,211));
			b.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
			add(b);
			b.addActionListener(display);
		}
	}

	public Display getDisplay() {
		return display;
	}

}
