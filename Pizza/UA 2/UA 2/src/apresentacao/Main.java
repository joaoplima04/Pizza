package apresentacao;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends JFrame{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public static void main(String[] args) {
				Panel1 panel1 = new Panel1();
				JFrame frame = new JFrame("Pizza");
				ImageIcon imageIcon = new ImageIcon("pizzaa.png");
				Image image = imageIcon.getImage();
				frame.setIconImage(image);
				frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		        frame.setSize(1700, 900);
		        frame.setBounds(120, 80, 1700, 900);
		        frame.add(panel1);
		        frame.setVisible(true);
		        
			}
	}
