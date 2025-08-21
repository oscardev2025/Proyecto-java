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

public class vender extends JDialog {
	private Tienda tienda;
	private JTextField txtPrecio;
	private JTextField textCantidad;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public vender(Tienda tienda) {
		setTitle("Vender");
		this.tienda = tienda;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Modelo:");
			lblNewLabel.setBounds(46, 24, 45, 13);
			getContentPane().add(lblNewLabel);
		}
		
		JLabel lblNewLabel = new JLabel("Precio:");
		lblNewLabel.setBounds(46, 47, 45, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(46, 70, 45, 13);
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
		comboBox.setBounds(101, 24, 120, 15);
		getContentPane().add(comboBox);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(101, 44, 120, 15);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(101, 67, 120, 15);
		getContentPane().add(textCantidad);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 88, 416, 165);
		getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Vender");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double precio =  Double.parseDouble(txtPrecio.getText());
				int cantidad = Integer.parseInt(textCantidad.getText());
				
				double total = precio * cantidad;
				textArea.setText("Precio unitario: " + precio 
                        + "\nCantidad: " + cantidad 
                        + "\nTotal: " + total);
			}
		});
		btnNewButton.setBounds(287, 20, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(287, 47, 85, 21);
		getContentPane().add(btnCerrar);
	}
}
