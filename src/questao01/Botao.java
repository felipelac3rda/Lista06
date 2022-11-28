package questao01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {
	Color color;

	public Botao(String text, Color color) {
		setPreferredSize(new Dimension(70, 30));
		setText(text);
		setFont(new Font("arial", Font.BOLD, 12));
		setOpaque(true);
		setForeground(Color.BLACK);
		this.color = color;
		setBorder(BorderFactory.createLineBorder(this.color, 3));
	}
}
