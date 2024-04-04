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

import negocio.Pedido;
import negocio.Pizza;


public class Panel2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Panel3 ingredientesPanel;
	
    public Panel2(Pizza pizza, Pedido pedido) {
    	JFrame frame = Main.getMainFrame();
    	setSize(1700, 900);

         // Crie um rótulo para "Escolha a sua pizza" e defina a fonte e alinhamento
         JLabel rotuloTitulo = new JLabel("Escolha a sua pizza");
         rotuloTitulo.setFont(new Font("Arial", Font.BOLD, 20));
         rotuloTitulo.setHorizontalAlignment(JLabel.CENTER);

         JPanel painelSabores = new JPanel(new GridLayout(2, 3)); // 2 linhas e 3 colunas para acomodar 6 sabores

         // Cria os botões dos sabores
         JButton sabor1 = new JButton("4 Queijos");
         sabor1.setFont(new Font("Arial", Font.BOLD, 20));
         JButton sabor2 = new JButton("Chocolate");
         sabor2.setFont(new Font("Arial", Font.BOLD, 20));
         JButton sabor3 = new JButton("Banana com canela");
         sabor3.setFont(new Font("Arial", Font.BOLD, 20));
         JButton sabor4 = new JButton("Frango C/ Catupiry");
         sabor4.setFont(new Font("Arial", Font.BOLD, 20));
         JButton sabor5 = new JButton("Calabresa");
         sabor5.setFont(new Font("Arial", Font.BOLD, 20));
         JButton sabor6 = new JButton("Marguerita");
         sabor6.setFont(new Font("Arial", Font.BOLD, 20));
         JButton sabor7 = new JButton("Catubresa");
         sabor7.setFont(new Font("Arial", Font.BOLD, 20));
         JButton sabor8 = new JButton("Mussarela");
         sabor8.setFont(new Font("Arial", Font.BOLD, 20));

         
         
         //Controladores dos botões
         sabor1.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				pizza.setSabor("4 Queijos");
 				pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
 				pizza.setIngredientes(pizza.getSabor());
 				System.out.println(pizza.preco);
 				pedido.addPizza(pizza);
 				if (ingredientesPanel == null) { 
 					ingredientesPanel = new Panel3(pizza, pedido, pizza.getSabor());
 					add(ingredientesPanel);			
                     remove(painelSabores);
                     remove(rotuloTitulo);
                     frame.revalidate();
                     frame.repaint();
                    
         
                 } else {
                 	ingredientesPanel.setVisible(true);
                 }
 			}
 		});
         sabor2.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				pizza.setSabor("Chocolate");
 				pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
 				pizza.setIngredientes(pizza.getSabor());
 				pedido.addPizza(pizza);
 				if (ingredientesPanel == null) { 
 					ingredientesPanel = new Panel3(pizza, pedido, pizza.getSabor());
                     add(ingredientesPanel);			
                     remove(painelSabores);
                     remove(rotuloTitulo);
                     frame.revalidate();
                     frame.repaint();
                    
         
                 } else {
                 	ingredientesPanel.setVisible(true);
                 }
 			}
 		});
         sabor4.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				pizza.setSabor("Frango C/ Catupiry");
 				pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
 				pizza.setIngredientes(pizza.getSabor());
 				pedido.addPizza(pizza);
 				if (ingredientesPanel == null) { 
 					ingredientesPanel = new Panel3(pizza, pedido, pizza.getSabor());
                     add(ingredientesPanel);			
                     remove(painelSabores);
                     remove(rotuloTitulo);
                     frame.revalidate();
                     frame.repaint();
                    
         
                 } else {
                 	ingredientesPanel.setVisible(true);
                 }
 			}
 		});
         sabor3.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				pizza.setSabor("Banana com canela");
 				pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
 				pizza.setIngredientes(pizza.getSabor());
 				pedido.addPizza(pizza);
 				if (ingredientesPanel == null) { 
 					ingredientesPanel = new Panel3(pizza, pedido, pizza.getSabor());
                     add(ingredientesPanel);			
                     remove(painelSabores);
                     remove(rotuloTitulo);
                     frame.revalidate();
                     frame.repaint();
                    
         
                 } else {
                 	ingredientesPanel.setVisible(true);
                 }
 			}
 		});
         sabor5.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				pizza.setSabor("Calabresa");
 				pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
 				pizza.setIngredientes(pizza.getSabor());
 				pedido.addPizza(pizza);
 				if (ingredientesPanel == null) { 
 					ingredientesPanel = new Panel3(pizza, pedido, pizza.getSabor());
                     add(ingredientesPanel);			
                     remove(painelSabores);
                     remove(rotuloTitulo);
                     frame.revalidate();
                     frame.repaint();
                    
         
                 } else {
                 	ingredientesPanel.setVisible(true);
                 }
 			}
 		});
         sabor6.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				pizza.setSabor("Marguerita");
 				pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
 				pizza.setIngredientes(pizza.getSabor());
 				pedido.addPizza(pizza);
 				if (ingredientesPanel == null) { 
 					ingredientesPanel = new Panel3(pizza, pedido, pizza.getSabor());
                     add(ingredientesPanel);			
                     remove(painelSabores);
                     remove(rotuloTitulo);
                     frame.revalidate();
                     frame.repaint();
                    
         
                 } else {
                 	ingredientesPanel.setVisible(true);
                 }
 			}
 		});
         sabor7.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				pizza.setSabor("Catubresa");
 				pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
 				pizza.setIngredientes(pizza.getSabor());
 				pedido.addPizza(pizza);
 				if (ingredientesPanel == null) { 
 					ingredientesPanel = new Panel3(pizza, pedido, pizza.getSabor());
                     add(ingredientesPanel);			
                     remove(painelSabores);
                     remove(rotuloTitulo);
                     frame.revalidate();
                     frame.repaint();
                    
         
                 } else {
                 	ingredientesPanel.setVisible(true);
                 }
 			}
 		});
         sabor8.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				pizza.setSabor("Mussarela");
 				pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
 				pizza.setIngredientes(pizza.getSabor());
 				pedido.addPizza(pizza); 				
 				if (ingredientesPanel == null) { 
 					ingredientesPanel = new Panel3(pizza, pedido, pizza.getSabor());
                     add(ingredientesPanel);			
                     remove(painelSabores);
                     remove(rotuloTitulo);
                     frame.revalidate();
                     frame.repaint();
                    
         
                 } else {
                 	ingredientesPanel.setVisible(true);
                 }
 			}
 		});
      // Adicione os componentes ao painel com GridLayout
         painelSabores.add(sabor1);
         painelSabores.add(sabor2);
         painelSabores.add(sabor3);
         painelSabores.add(sabor4);
         painelSabores.add(sabor5);
         painelSabores.add(sabor6);
         painelSabores.add(sabor7);
         painelSabores.add(sabor8);
         
         
         
         painelSabores.setBounds(0, 0, 1700, 900);
         // Adicione o rótulo no topo e o painel de sabores ao painel principal
         add(rotuloTitulo, BorderLayout.NORTH);
         add(painelSabores, BorderLayout.CENTER);
         
         setLayout(null);
         
     }


    }