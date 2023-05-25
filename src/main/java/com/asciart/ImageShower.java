package com.asciart;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Shows of popup of the scaled image re-scaled to 400x400 pixel.
 *
 * @author Navjot Singh Rakhra
 * @version 1.0
 */
public class ImageShower extends JFrame {
	static JFrame frame = new JFrame();

	private ImageShower() {
	}

	public ImageShower(BufferedImage image) {
		BufferedImage image1 = new BufferedImage(400, 400, image.getType());
		Image im = image.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		image1.getGraphics().drawImage(im, 0, 0, null);
		frame.setTitle("Image");
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(400, 400));
		frame.add(new JLabel(new ImageIcon(image1)));
		frame.pack();
		frame.setVisible(true);
	}

	public void setVisible(boolean val) {
		frame.setVisible(val);
	}
}