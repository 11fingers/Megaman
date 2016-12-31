package main.java;

import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * @ Description: healthPack class, creates the health boost object in each level
 * @ Author: Ryan Wang
 * @ Version: v1.0
 * September 2016
 */

public class HealthPack extends Object {

	HealthPack(int level) {
		super(0, 0);
		if (level == 1) {
			x = 20;
			y = 162;
		}
		else if (level == 2) {
			x = 370;
			y = 323;
		}
		else if (level == 3) {
			x = 20;
			y = 162;
		}
	}

	protected void paintPack(Graphics g) {
		try {
			g.drawImage(ImageIO.read((this.getClass().getResource("/main/resources/images/healthBoost.png"))), x, y, null);
		}
		catch (IOException e) {
			System.out.println("error");
		}
	}

}
