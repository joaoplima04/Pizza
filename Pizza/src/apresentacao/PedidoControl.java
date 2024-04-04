package apresentacao;

import negocio.Pedido;

public class PedidoControl {
	public static Pedido pedidoInstance = new Pedido();
	
	public static Pedido getPedido() {
		return pedidoInstance;
	}
	
}
