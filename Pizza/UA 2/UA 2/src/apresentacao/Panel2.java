package apresentacao;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import negocio.Pizza;


public class Panel2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Pizza pizza;
	
    public Panel2(Pizza pizza) {
    	this.pizza = pizza;
    	 setTitle("Escolha a sua pizza");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(1700, 900);

         JPanel painelPrincipal = new JPanel(new BorderLayout());

         // Crie um rótulo para "Escolha a sua pizza" e defina a fonte e alinhamento
         JLabel rotuloTitulo = new JLabel("Escolha a sua pizza");
         rotuloTitulo.setFont(new Font("Arial", Font.BOLD, 20));
         rotuloTitulo.setHorizontalAlignment(JLabel.CENTER);

         JPanel painelSabores = new JPanel(new GridLayout(2, 3)); // 2 linhas e 3 colunas para acomodar 6 sabores

         // Crie componentes para representar os 6 sabores de pizza
         JButton sabor1 = new JButton("4 Queijos");
         sabor1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
         JButton sabor2 = new JButton("Chocolate");
         JButton sabor3 = new JButton("Banana com canela");
         JButton sabor4 = new JButton("Frango C/ Catupiry");
         JButton sabor5 = new JButton("Calabresa");
         JButton sabor6 = new JButton("Marguerita");
         JButton sabor7 = new JButton("Catubresa");
         JButton sabor8 = new JButton("Mussarela");

         // Adicione os componentes ao painel com GridLayout
         painelSabores.add(sabor1);
         painelSabores.add(sabor2);
         painelSabores.add(sabor3);
         painelSabores.add(sabor4);
         painelSabores.add(sabor5);
         painelSabores.add(sabor6);
         painelSabores.add(sabor7);
         painelSabores.add(sabor8);

         // Adicione o rótulo no topo e o painel de sabores ao painel principal
         painelPrincipal.add(rotuloTitulo, BorderLayout.NORTH);
         painelPrincipal.add(painelSabores, BorderLayout.CENTER);

         // Adicione o painel principal ao JFrame
         add(painelPrincipal);

         // Resto do código...
     }


    }