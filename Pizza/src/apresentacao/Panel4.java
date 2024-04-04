package apresentacao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import negocio.Pedido;
import negocio.Pizza;

public class Panel4 extends JPanel {


	private static final long serialVersionUID = 1L;

	Pedido pedido = PedidoControl.getPedido();

	Panel4(Pedido pedido) {
		JFrame frame = Main.getMainFrame();
		JLabel lbltitulo = new JLabel("Deseja adicionar mais uma pizza ou finalizar o pedido?");
		lbltitulo.setBounds(550, 20, 800, 50);
		lbltitulo.setFont(new Font("Arial", Font.BOLD, 25));

		JLabel lblPedido = new JLabel();
		lblPedido.setText("<html>" + pedido.printPedido() + "</html>");
		lblPedido.setBounds(650, 10, 800, 700);
		lblPedido.setFont(new Font("Arial", 0, 20));

		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(1000, 650, 150, 50);

		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setBounds(750, 650, 150, 50);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(500, 650, 150, 50);
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pizza pizza2 = new Pizza();
				Panel1 panel1 = new Panel1(pizza2, pedido);
				add(panel1);
				remove(btnAdd);
				remove(btnFinalizar);
				remove(btnCancelar);
				remove(lblPedido);
				remove(lbltitulo);
				frame.revalidate();
				frame.repaint();

			}
		});

		add(btnCancelar);
		add(btnAdd);
		add(btnFinalizar);
		add(lbltitulo);
		add(lblPedido);
		setLayout(null);
		setBounds(0, 0, 1700, 900);
	}
}
