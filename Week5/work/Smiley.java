package work;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Smiley extends JPanel {
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		drawFace(g);

		drawEyes(g);

		drawMouth(g);

		touchUpMouth(g);
	}

	public void drawFace(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
	}

	public void drawEyes(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
	}

	public void drawMouth(Graphics g) {
		g.fillOval(50, 110, 120, 60);
	}

	public void touchUpMouth(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
}