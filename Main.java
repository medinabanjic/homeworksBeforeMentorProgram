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
		g.setColor(Color.black);

		for (int i = 50; i <= 500; i += 50) {
			g.drawRect(i, 50, 50, 50);
		}

		g.setFont(new Font("default", Font.BOLD, 16));
		g.drawString("An array of numbers", 210, 25);
		g.drawString("Types int", 265, 125);

		for (int i = 70; i < 521; i += 50) {
			g.drawString("" + ((int) (Math.random() * 11)), i, 80);

		}

		w.setImage(img);
	}

}
