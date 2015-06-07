import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, 550, 350);
		g.setColor(Color.black);
		g.drawRect(0, 0, 550, 350);

		g.setColor(Color.BLACK);
		g.drawRect(70, 30, 150, 300);

		g.drawRect(100, 80, 110, 100);

		g.drawRect(110, 110, 95, 30);
		g.drawRect(110, 147, 95, 30);

		g.drawRect(100, 200, 110, 50);
		g.drawRect(100, 270, 110, 50);

		g.drawRect(250, 30, 150, 300);

		g.drawRect(280, 80, 110, 100);

		g.drawRect(290, 110, 95, 30);
		g.drawRect(290, 147, 95, 30);

		g.drawRect(280, 200, 110, 50);
		g.drawRect(280, 270, 110, 50);

		g.drawRect(430, 30, 100, 300);


		g.setFont(new Font("default", Font.BOLD, 16));
		g.setColor(Color.blue);
		g.drawString("java", 20, 20);

		g.drawString("lang", 80, 45);
		g.drawString("awt", 260, 45);
		g.drawString("util", 440, 45);

		g.setColor(Color.GREEN);
		g.drawString("Math", 110, 100);
		g.drawString("Graphics", 290, 100);

		g.drawString("String", 110, 220);
		g.drawString("Integer", 110, 290);
		g.drawString("Color", 290, 220);
		g.drawString("Font", 290, 290);

		g.setColor(Color.red);
		g.drawString("sqrt()", 115, 128);
		g.drawString("random()", 115, 170);
		g.drawString("drawRect()", 300, 128);
		g.drawString("setColor()", 300, 170);

		w.setImage(img);
	}

}