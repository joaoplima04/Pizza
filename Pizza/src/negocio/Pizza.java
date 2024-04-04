package negocio;

import java.util.ArrayList;

public class Pizza {
	public String tamanho = "";
	public String sabor = "";
	public ArrayList<String> ingredientesRemovidos;
	public ArrayList<String> ingredientes;
	public double preco = 0;

	public Pizza() {
		super();
		this.ingredientes = new ArrayList<String>();
		this.ingredientesRemovidos = new ArrayList<String>();
	}

	public Pizza(String tamanho, String sabor, ArrayList<String> ingredientesRemovidos, double preco) {
		super();
		this.tamanho = tamanho;
		this.sabor = sabor;
		this.ingredientesRemovidos = ingredientesRemovidos;
		this.preco = preco;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public ArrayList<String> getIngredientesRemovidos() {
		return ingredientesRemovidos;
	}

	public void addIngredientesRemovidos(String Ingrediente) {
		ingredientesRemovidos.add(Ingrediente);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(String tamanho, String sabor) {
		double preco = 0;
		switch (sabor) {
		case "4 Queijos": {
			preco = 31.90;
			break;
		}
		case "Chocolate": {
			preco = 30.50;
			break;
		}
		case "Banana com canela": {
			preco = 33.90;
			break;
		}
		case "Frango C/ Catupiry": {
			preco = 35;
			break;
		}
		case "Calabresa": {
			preco = 34.40;
			break;
		}
		case "Marguerita": {
			preco = 28.90;
			break;
		}
		case "Catubresa": {
			preco = 35.90;
			break;
		}
		case "Mussarela": {
			preco = 25.90;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + sabor);
		}
		if (tamanho == "Metade") {
			preco /= 2;
		}
		this.preco = preco;
	}

	public void setIngredientes(String sabor) {
		switch (sabor) {
		case "4 Queijos": {

			ingredientes.add("Gorgonzola");
			ingredientes.add("Parmesão");
			ingredientes.add("Provolone");
			ingredientes.add("Mussarela");
			ingredientes.add("Molho de tomate");
			break;
		}
		case "Chocolate": {
			ingredientes.add("queijo");
			break;
		}
		case "Banana com canela": {
			ingredientes.add("Canela");
			ingredientes.add("Açúcar");
			ingredientes.add("queijo");
			ingredientes.add("Molho de tomate");

			break;
		}
		case "Frango C/ Catupiry": {
			ingredientes.add("Catupiry");
			ingredientes.add("Frango");
			ingredientes.add("Queijo");
			ingredientes.add("Molho de tomate");
			break;
		}
		case "Calabresa": {
			ingredientes.add("Cebola");
			ingredientes.add("Queijo");
			ingredientes.add("Calabresa");
			ingredientes.add("Molho de tomate");
			break;
		}
		case "Marguerita": {
			ingredientes.add("Manjericão");
			ingredientes.add("Tomate");
			ingredientes.add("Queijo");
			ingredientes.add("Molho de tomate");
			break;
		}
		case "Catubresa": {
			ingredientes.add("Calabresa");
			ingredientes.add("Catupiry");
			ingredientes.add("Queijo");
			ingredientes.add("Molho de tomate");
			break;
		}
		case "Mussarela": {
			ingredientes.add("Mussarela");
			ingredientes.add("Molho de tomate");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + sabor);
		}
	}
}