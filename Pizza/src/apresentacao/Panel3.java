package apresentacao;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import negocio.Pedido;
import negocio.Pizza;

public class Panel3 extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public Panel3(Pizza pizza, Pedido pedido, String saborSelecionado) {
		JFrame frame = Main.getMainFrame();
		JPanel painelPrincipal = new JPanel();
			painelPrincipal.setLayout(null);
	        int x = 750; // Inicialize a posição x
	        int y = 200; // Inicialize a posição y

	        JLabel labelSabor = new JLabel("Sabor selecionado: " + saborSelecionado);
	        labelSabor.setFont(new Font("Arial", Font.BOLD, 40));
	        labelSabor.setBounds(550, JLabel.TOP, 800, 50);
	        painelPrincipal.add(labelSabor);
	        
	        JLabel labelInstrucao = new JLabel("Selecione os ingredientes para remover:");
	        labelInstrucao.setFont(new Font("Arial", 0, 30));
	        labelInstrucao.setBounds(550, 50, 800, 50);
	        painelPrincipal.add(labelInstrucao);

	        for (int i = 0; i < pizza.ingredientes.size(); i++) {
	        	String ingredienteRemovido = pizza.ingredientes.get(i);
	            JCheckBox checkBoxIngrediente = new JCheckBox(ingredienteRemovido);
	            checkBoxIngrediente.setBounds(x, y, 200, 20); 
	            checkBoxIngrediente.setFont(new Font("Arial", Font.BOLD, 15));
	            painelPrincipal.add(checkBoxIngrediente);
	            checkBoxIngrediente.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						pizza.addIngredientesRemovidos(ingredienteRemovido);
					}
				});
	            
	            y += 60; // Atualize a posição y para o próximo checkbox
	            
	        }
	        
	        JButton btnConfirmar = new JButton("Confirmar");
	        btnConfirmar.setBounds(700, 500, 200, 50);
	        painelPrincipal.add(btnConfirmar);
	        btnConfirmar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if (pizza.tamanho == "Metade") {
						Pizza pizzaa = new Pizza();
						pizzaa.setTamanho("");
						Panel2 saborPainel = new Panel2(pizzaa, pedido);
						add(saborPainel);
						remove(painelPrincipal);
						frame.revalidate();
						frame.repaint();
					} else {
						if (pizza.getTamanho() == "") {
							pizza.setTamanho("Metade");
							pizza.setPreco(pizza.getTamanho(), pizza.getSabor());
						}
						pedido.setPrecoTotal(pedido.pizzas);
						Panel4 painelPedido = new Panel4(pedido);
						add(painelPedido);
						remove(painelPrincipal);
						frame.revalidate();
						frame.repaint();
						
					}
				}
			});
	        
	        painelPrincipal.setBounds(0, 0, 1700, 900);
	        add(painelPrincipal, BorderLayout.CENTER);
	        setLayout(null);
	        setBounds(0, 0, 1700, 900);
	        
	}
	        
	
	}