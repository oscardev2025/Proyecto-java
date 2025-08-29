package cibertec;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class modificarCamara extends JDialog {
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private Tienda tienda;

	 public static void main(String[] args) {
		    try {
		        Tienda miTienda = new Tienda();
		        modificarCamara dialog = new modificarCamara(miTienda);
		        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		        dialog.setVisible(true);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
	/**
	 * Create the dialog.
	 */
	public modificarCamara(Tienda tienda) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Oscar Dev\\Downloads\\LogoVG.png"));
		this.tienda = tienda;
		setTitle("Modificar camara");
		setBounds(100, 100, 400, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(21, 28, 69, 13);
		contentPanel.add(lblNewLabel);

		JLabel lblPrecio = new JLabel("Precio (s/)");
		lblPrecio.setBounds(21, 51, 69, 13);
		contentPanel.add(lblPrecio);

		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(21, 74, 69, 13);
		contentPanel.add(lblAncho);

		JLabel lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(21, 97, 69, 13);
		contentPanel.add(lblAlto);

		JLabel lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setBounds(21, 120, 69, 13);
		contentPanel.add(lblFondocm);
		// el 
		JComboBox<String> listaCamaras = new JComboBox<>();
		listaCamaras.setModel(new DefaultComboBoxModel<>(new String[] {
			"Elija una camara", //indice 0 
			tienda.modelo1, //indice 1
			tienda.modelo2, //indice 2
			tienda.modelo3, //indice 3 
			tienda.modelo4, //indice 4
			tienda.modelo5  //indice 5
		}));
		listaCamaras.setBounds(100, 24, 130, 21);
		contentPanel.add(listaCamaras);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(100, 48, 130, 19);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);

		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(100, 71, 130, 19);
		contentPanel.add(txtAncho);

		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(100, 94, 130, 19);
		contentPanel.add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(100, 117, 130, 19);
		contentPanel.add(txtFondo);

		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(288, 24, 85, 21);
		contentPanel.add(btnNewButton);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = listaCamaras.getSelectedIndex();
				double nuevoPrecio = Double.parseDouble(txtPrecio.getText());
				double nuevoAncho = Double.parseDouble(txtAncho.getText());
				double nuevoAlto = Double.parseDouble(txtAlto.getText());
				double nuevoFondo = Double.parseDouble(txtFondo.getText());

				if (index == 1) {
					tienda.precio1 = nuevoPrecio;
					tienda.ancho1 = nuevoAncho;
					tienda.alto1 = nuevoAlto;
					tienda.fondo1 = nuevoFondo;
				} else if (index == 2) {
					tienda.precio2 = nuevoPrecio;
					tienda.ancho2 = nuevoAncho;
					tienda.alto2 = nuevoAlto;
					tienda.fondo2 = nuevoFondo;
				} else if (index == 3) {
					tienda.precio3 = nuevoPrecio;
					tienda.ancho3 = nuevoAncho;
					tienda.alto3 = nuevoAlto;
					tienda.fondo3 = nuevoFondo;
				} else if (index == 4) {
					tienda.precio4 = nuevoPrecio;
					tienda.ancho4 = nuevoAncho;
					tienda.alto4 = nuevoAlto;
					tienda.fondo4 = nuevoFondo;
				} else if (index == 5) {
					tienda.precio5 = nuevoPrecio;
					tienda.ancho5 = nuevoAncho;
					tienda.alto5 = nuevoAlto;
					tienda.fondo5 = nuevoFondo;
				}
			}
		});
		btnGuardar.setBounds(288, 47, 85, 21);
		contentPanel.add(btnGuardar);

		listaCamaras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = listaCamaras.getSelectedIndex();

				if (index == 1) {
					txtPrecio.setText(String.valueOf(tienda.precio1));
					txtAncho.setText(String.valueOf(tienda.ancho1));
					txtAlto.setText(String.valueOf(tienda.alto1));
					txtFondo.setText(String.valueOf(tienda.fondo1));
				} else if (index == 2) {
					txtPrecio.setText(String.valueOf(tienda.precio2));
					txtAncho.setText(String.valueOf(tienda.ancho2));
					txtAlto.setText(String.valueOf(tienda.alto2));
					txtFondo.setText(String.valueOf(tienda.fondo2));
				} else if (index == 3) {
					txtPrecio.setText(String.valueOf(tienda.precio3));
					txtAncho.setText(String.valueOf(tienda.ancho3));
					txtAlto.setText(String.valueOf(tienda.alto3));
					txtFondo.setText(String.valueOf(tienda.fondo3));
				} else if (index == 4) {
					txtPrecio.setText(String.valueOf(tienda.precio4));
					txtAncho.setText(String.valueOf(tienda.ancho4));
					txtAlto.setText(String.valueOf(tienda.alto4));
					txtFondo.setText(String.valueOf(tienda.fondo4));
				} else if (index == 5) {
					txtPrecio.setText(String.valueOf(tienda.precio5));
					txtAncho.setText(String.valueOf(tienda.ancho5));
					txtAlto.setText(String.valueOf(tienda.alto5));
					txtFondo.setText(String.valueOf(tienda.fondo5));
				}
			}
		});
	}
}

