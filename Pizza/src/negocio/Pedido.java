package negocio;

import javax.swing.JOptionPane;

public class Pedido {
	public Pizza[] pizzas = new Pizza[10];
	public double precoTotal = 0;
	private int proximoIndice = 0;
	public int senha = 0;

	public Pedido() {
		super();
		pizzas = new Pizza[10];
	}

	public Pedido(Pizza[] pizzas, double precoTotal) {
		super();
		this.pizzas = pizzas;
		this.precoTotal = precoTotal;
	}

	public Pizza[] getPizzas() {
		return pizzas;
	}

	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Pizza[] pizzas) {
		double total = 0;
		for(int i = 0; i <= pizzas.length - 1; i++) {
			if (pizzas[i] != null) {
				total += pizzas[i].preco;	
			}			
		}
		this.precoTotal = total;
	}
	
	public void addPizza(Pizza pizza) {
        if (proximoIndice < pizzas.length) {
            pizzas[proximoIndice] = pizza; // Adicionar a pizza no próximo índice disponível
            proximoIndice++; // Incrementar o índice para a próxima pizza
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível adicionar mais pizzas ao pedido");
        }
    }
	
	public String printPedido() {
	    String primeira = "";
	    String segunda = "";
	    for (int i = 0; i < pizzas.length; i++) {
	        if (pizzas[i] != null) {
	            primeira += ("Sabor <==========> ") + (pizzas[i].sabor) + ("<br>")
	                     + ("Tamanho <==========> ") + (pizzas[i].tamanho) + ("<br>");	                     
	            if (pizzas[i].ingredientesRemovidos.size() == 0) {
	            	primeira += "Ingredientes removidos <==========> " + "Nenhum" + ("<br>");
	            } else {
	            	for (int x = 0; x < pizzas[i].ingredientesRemovidos.size(); x++) {
		                primeira += "Ingredientes removidos <==========> " + pizzas[i].ingredientesRemovidos.get(x) + ("<br>");
		            }
	            }
	            primeira += ("<br>");
	        }
	    }
	    segunda += "Preço total <==========> " + getPrecoTotal();
	    return primeira.toString() + segunda.toString();
	}


}
