package apresentacao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public static void main(String[] args) {
			JLabel título = new JLabel();
			título.setText("Escolha entre pizza inteira ou de 2 sabores");
			Font fonte = new Font("Arial", Font.BOLD, 70);
			título.setFont(fonte);
			título.setBounds(100, 50, 2000, 100);
			título.setForeground(Color.red);
			
			JLabel inteira = new JLabel();
			ImageIcon imagemm = new ImageIcon("inteira.png");
			Image imag = imagemm.getImage();
			inteira.setIcon(imagemm);
			inteira.setBounds(200, 400, 500, 500);
			
			
			JLabel metade = new JLabel();
			ImageIcon imagem = new ImageIcon("metade.png");
			Image imagee = imagem.getImage();
			metade.setIcon(imagem);
			metade.setHorizontalAlignment(JLabel.LEFT);
			metade.setBounds(200, 200, 500, 500);
			
			JButton butaoMetade = new JButton("Pizza de 2 sabores");
			butaoMetade.setBounds(290, 700, 200, 50);
			
			
			JPanel panel = new JPanel() {
				 /**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				
				@Override
		            protected void paintComponent(Graphics g) {
		                super.paintComponent(g);
		                Image imagemDeFundo = new ImageIcon("fundo.png").getImage();
		                g.drawImage(imagemDeFundo, 0, 0, this);
		            }
				};
				panel.setLayout(null);
				panel.add(título);
				panel.add(metade);
				panel.add(butaoMetade);
				panel.add(inteira);
				
				
				JFrame frame = new JFrame("Pizza");
				ImageIcon imageIcon = new ImageIcon("pizzaa.png");
				Image image = imageIcon.getImage();
				frame.setIconImage(image);
				frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		        frame.setSize(1700, 900);
		        frame.setBounds(120, 80, 1700, 900);
		        frame.add(panel);
		        frame.setVisible(true);
		        
			}
	}
