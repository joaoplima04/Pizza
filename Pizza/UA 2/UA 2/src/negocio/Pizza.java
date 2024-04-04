package negocio;

import java.util.ArrayList;

public class Pizza {
	public String tamanho = "";
	public String sabor = "";
	public ArrayList<String> ingredientesRemovidos;
	public double preco = 0;

	public Pizza() {
		super();
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

	public void setIngredientesRemovidos(ArrayList<String> ingredientesRemovidos) {
		this.ingredientesRemovidos = ingredientesRemovidos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
