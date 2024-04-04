package apresentacao;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import negocio.Pedido;
import negocio.Pizza;

public class Main extends JFrame{
	
	public static JFrame frame = new JFrame();
	
	public static JFrame getMainFrame() {
        return frame;
    }
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		public static void main(String[] args) {
				JFrame frame = getMainFrame();
				Pizza pizza = new Pizza();
				Pedido pedido = new Pedido();
				Panel1 panel1 = new Panel1(pizza, pedido);
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
