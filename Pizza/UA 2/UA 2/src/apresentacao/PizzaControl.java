package apresentacao;

import javax.swing.SwingUtilities;

import negocio.Pizza;

public class PizzaControl {
	private Pizza pizza;
	public PizzaControl() {
	        // Inicialize a instância de Pizza aqui
	        pizza = new Pizza();

	        // Crie e configure a interface gráfica (painel1, painel2, etc.) aqui
	        Panel1 panel1 = new Panel1(pizza);
	        Panel2 panel2 = new Panel2(pizza);

	        // Defina a visibilidade de painéis conforme necessário
	        panel1.setVisible(true);
	        panel2.setVisible(false);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new PizzaControl();
	        });
	    }
	}

