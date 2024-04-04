package apresentacao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import negocio.Pizza;

public class Panel1 extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Panel1() {
        setLayout(null);
        JLabel título = new JLabel("Escolha entre pizza inteira ou de 2 sabores");
        título.setFont(new Font("Arial", Font.BOLD, 70));
        título.setBounds(100, 50, 2000, 100);
        título.setForeground(Color.RED);

        JLabel inteira = new JLabel();
        ImageIcon imagemInteira = new ImageIcon("inteira.png");
        Image imagemInteiraImage = imagemInteira.getImage();
        inteira.setIcon(imagemInteira);
        inteira.setBounds(800, 100, 500, 500);

        JButton butaoInteira = new JButton("Pizza de sabor único");
        butaoInteira.setBounds(800, 450, 200, 50);
        butaoInteira.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Pizza pizza = new Pizza();
        		pizza.setTamanho("Inteira");
            }
        });

        JLabel metade = new JLabel();
        ImageIcon imagemMetade = new ImageIcon("metade.png");
        Image imagemMetadeImage = imagemMetade.getImage();
        metade.setIcon(imagemMetade);
        metade.setHorizontalAlignment(JLabel.LEFT);
        metade.setBounds(200, 177, 269, 361);

        JButton butaoMetade = new JButton("Pizza de 2 sabores");
        butaoMetade.setBounds(200, 520, 200, 50);
        butaoMetade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Pizza pizza = new Pizza();
        		pizza.setTamanho("Metade");
            }
        });
        add(título);
        add(metade);
        add(butaoMetade);
        add(inteira);
        add(butaoInteira);
    }
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image imagemDeFundo = new ImageIcon("fundo.png").getImage();
        g.drawImage(imagemDeFundo, 0, 0, this);
    }
}
