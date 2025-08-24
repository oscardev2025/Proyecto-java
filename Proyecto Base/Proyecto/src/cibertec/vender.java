package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;


public class vender extends JDialog {
	private Tienda tienda;
	private JTextField txtPrecio;
	private JTextField textCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    try {
	        Tienda miTienda = new Tienda();
	        vender dialog = new vender(miTienda);
	        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	        dialog.setVisible(true);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Create the dialog.
	 */
	public vender(Tienda tienda) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Oscar Dev\\Downloads\\LogoVG.png"));
		setTitle("Vender");
		this.tienda = tienda;
		setBounds(100, 100, 450, 325);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Modelo:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setBounds(46, 24, 45, 13);
			getContentPane().add(lblNewLabel);
		}
		
		JLabel lblNewLabel = new JLabel("Precio:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(46, 47, 45, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidad.setBounds(46, 70, 57, 13);
		getContentPane().add(lblCantidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				
				if (index == 1) {
					txtPrecio.setText(String.valueOf(tienda.precio1));
				} else if (index == 2) {
					txtPrecio.setText(String.valueOf(tienda.precio2));
				} else if (index == 3) {
					txtPrecio.setText(String.valueOf(tienda.precio3));
				} else if (index == 4) {
					txtPrecio.setText(String.valueOf(tienda.precio4));
				} else if (index == 5) {
					txtPrecio.setText(String.valueOf(tienda.precio5));
				}
 			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {
				"Elija una camara",
				tienda.modelo1,
				tienda.modelo2,
				tienda.modelo3,
				tienda.modelo4,
				tienda.modelo5}
		));
		
		comboBox.setToolTipText("");
		comboBox.setBounds(101, 20, 120, 17);
		getContentPane().add(comboBox);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(101, 44, 120, 17);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(101, 67, 120, 17);
		getContentPane().add(textCantidad);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 97, 416, 191);
		getContentPane().add(textArea);
		
		
		JButton btnNewButton = new JButton("Vender");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String modelo = (String) comboBox.getSelectedItem();
				double precio =  Double.parseDouble(txtPrecio.getText());
				int cantidad = Integer.parseInt(textCantidad.getText());
				double importeCompra = precio * cantidad;
				double descuento = importeDescuento(cantidad, precio);
				double total = importeCompra - descuento;
				String obsequio = calcularObsequio(cantidad);
				textArea.setText("BOLETA DE VENTA\n" + 
				"\nModelo: " + modelo +
				"\nPrecio unitario: " + precio +
				"\nCantidad: " + cantidad +
				"\nImporte Compra (S/): " + importeCompra + 
				"\nImporte Descuento (S/): " + String.format("%.2f", descuento) +
				"\nTotal: " + total +
				"\nObsequio: " + obsequio);
			}
		});
		btnNewButton.setBounds(287, 20, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(287, 47, 85, 21);
		getContentPane().add(btnCerrar);
	}
	
	public static double importeDescuento(int cantidad, double precioUnitario) {
	    double porcentaje;
	    if (cantidad < 5) {
	        porcentaje = 0.1;
	    } else if (cantidad <= 11) {
	        porcentaje = 0.2;
	    } else if (cantidad <= 15) {
	        porcentaje = 0.3;
	    } else {
	        porcentaje = 0.4;
	    }
	    return cantidad * precioUnitario * porcentaje;
	}
	
	public static String calcularObsequio(int cantidad) {
		if (cantidad < 2) {
			return "Obsequio1";
		} else if (cantidad <= 6) {
			return "Obsequio2";
		} else {
			return "Obsequio3";
		}
	}
}
