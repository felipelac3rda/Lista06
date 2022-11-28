package questao01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ParteDeCima extends JPanel implements ActionListener {

	private ParteDeBaixo baixo;
	JButton amarelo;
	JButton verde;
	JButton azul;

	public ParteDeCima() {
		baixo = new ParteDeBaixo();
		setPreferredSize(new Dimension(400, 50));
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		criarBotoes();

	}

	public void criarBotoes() {
		Botao ama = new Botao("Amarelo", Color.YELLOW);
		Botao v = new Botao("Verde", Color.GREEN);
		Botao az = new Botao("Azul", Color.BLUE);
		amarelo = ama;
		verde = v;
		azul = az;
		amarelo.addActionListener(this);
		verde.addActionListener(this);
		azul.addActionListener(this);
		add(amarelo);
		add(verde);
		add(azul);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == amarelo) {
			baixo.setBackground(Color.YELLOW);
		}
		if (e.getSource() == verde) {
			baixo.setBackground(Color.GREEN);
		}
		if (e.getSource() == azul) {
			baixo.setBackground(Color.BLUE);
		}

	}

	public ParteDeBaixo getBaixo() {
		return baixo;
	}
	
	
}
