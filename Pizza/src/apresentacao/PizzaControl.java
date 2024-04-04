package apresentacao;

import negocio.Pizza;

public class PizzaControl {
    private static Pizza pizzaInstance = new Pizza();

    public static Pizza getPizza() {
        return pizzaInstance;
    }
    public static Pizza createPizza() {
        return new Pizza();
    }
}

