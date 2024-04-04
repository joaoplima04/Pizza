package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import negocio.Pedido;
import negocio.Pizza;

public class Panel1 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Panel2 saborPanel;
	
	
	
	public Panel1(Pizza pizza, Pedido pedido) {
		
		JPanel painelPrincipal = new JPanel(new BorderLayout());

        JFrame frame = Main.getMainFrame();

        //Título do painél
        JLabel título = new JLabel("Escolha entre pizza inteira ou de 2 sabores");
        título.setFont(new Font("Arial", Font.BOLD, 70));
        título.setBounds(100, 50, 2000, 100);
        título.setForeground(Color.RED);
        
        //Imagem da pizza de sabor único
        JLabel inteira = new JLabel();
        ImageIcon imagemInteira = new ImageIcon("inteira.png");
        Image imagemInteiraImage = imagemInteira.getImage();
        inteira.setIcon(imagemInteira);
        inteira.setBounds(900, 150, 500, 500);

        
        //Imagem da pizza metade
        JLabel metade = new JLabel();
        ImageIcon imagemMetade = new ImageIcon("metade.png");
        Image imagemMetadeImage = imagemMetade.getImage();
        metade.setIcon(imagemMetade);
        metade.setHorizontalAlignment(JLabel.LEFT);
        metade.setBounds(220, 250, 269, 361);
        
        //Butão da pizza metade
        JButton butaoMetade = new JButton("Pizza de 2 sabores");
        butaoMetade.setBounds(200, 620, 300, 100);
        butaoMetade.setFont(new Font("Arial", Font.BOLD, 20));
        
        //Butão da pizza inteira
        JButton butaoInteira = new JButton("Inteira");
        butaoInteira.setBounds(900, 620, 300, 100);
        butaoInteira.setFont(new Font("Arial", Font.BOLD, 20));
        
        //Controladores dos botões
        butaoInteira.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pizza.setTamanho("Inteira");
                if (saborPanel == null) { 
                	saborPanel = new Panel2(pizza, pedido);
                    add(saborPanel);			
                    remove(título);
                    remove(metade);
                    remove(inteira);
                    remove(butaoInteira);
                    remove(butaoMetade);
                    frame.revalidate();
                    frame.repaint();
                    
        
                } else {
                    saborPanel.setVisible(true);
                }
            }
        });
        
        butaoMetade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pizza.setTamanho("Metade");
                if (saborPanel == null) { 
                	saborPanel = new Panel2(pizza, pedido);
                    add(saborPanel);			
                    remove(título);
                    remove(metade);
                    remove(inteira);
                    remove(butaoInteira);
                    remove(butaoMetade);
                    frame.revalidate();
                    frame.repaint();
                    
        
                } else {
                    saborPanel.setVisible(true);
                }
            }
        });
        //Adicione os componentes ao painél
        
        add(título);
        add(metade);
        add(butaoMetade);
        add(inteira);
        add(butaoInteira);
        setLayout(null);
        setBounds(0, 0, 1700, 900);
        
    }

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image imagemDeFundo = new ImageIcon("fundo.png").getImage();
		g.drawImage(imagemDeFundo, 0, 0, this);
	}
}
