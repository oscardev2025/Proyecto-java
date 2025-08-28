package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modificarDescuento extends JDialog {
	private Tienda tienda; 

	private static final long serialVersionUID = 1L;
	private JTextField textdescuento4;
	private JTextField textdescuento3;
	private JTextField textdescuento2;
	private JTextField textdescuento1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Tienda tienda = new Tienda();
			modificarDescuento dialog = new modificarDescuento(tienda);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public modificarDescuento(Tienda tienda) {
		this.tienda = tienda;
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Oscar Dev\\Downloads\\LogoVG.png"));
		setTitle("Modificar descuentos");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(47, 38, 100, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblA = new JLabel("6 a 10 unidades");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblA.setBounds(47, 61, 100, 13);
		getContentPane().add(lblA);
		
		JLabel lblA_2 = new JLabel("11 a 15 unidades");
		lblA_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblA_2.setBounds(47, 84, 100, 13);
		getContentPane().add(lblA_2);
		
		JLabel lblA_2_1 = new JLabel("mas de 15 unidades");
		lblA_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblA_2_1.setBounds(47, 107, 115, 13);
		getContentPane().add(lblA_2_1);
		
		textdescuento4 = new JTextField();
		textdescuento4.setText(String.valueOf(tienda.porcentaje4));
		textdescuento4.setBounds(172, 105, 96, 19);
		getContentPane().add(textdescuento4);
		textdescuento4.setColumns(10);
		
		textdescuento3 = new JTextField();
		textdescuento3.setText(String.valueOf(tienda.porcentaje3));
		textdescuento3.setColumns(10);
		textdescuento3.setBounds(172, 82, 96, 19);
		getContentPane().add(textdescuento3);
		
		textdescuento2 = new JTextField();
		textdescuento2.setText(String.valueOf(tienda.porcentaje2));
		textdescuento2.setColumns(10);
		textdescuento2.setBounds(172, 59, 96, 19);
		getContentPane().add(textdescuento2);
		
		textdescuento1 = new JTextField();
		textdescuento1.setText(String.valueOf(tienda.porcentaje1));
		textdescuento1.setColumns(10);
		textdescuento1.setBounds(172, 36, 96, 19);
		getContentPane().add(textdescuento1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double nuevoDescuento1 = Double.parseDouble(textdescuento1.getText());
				double nuevoDescuento2 = Double.parseDouble(textdescuento2.getText());
				double nuevoDescuento3 = Double.parseDouble(textdescuento3.getText());
				double nuevoDescuento4 = Double.parseDouble(textdescuento4.getText());
				tienda.porcentaje1 = nuevoDescuento1;
				tienda.porcentaje2 = nuevoDescuento2;
				tienda.porcentaje3 = nuevoDescuento3;
				tienda.porcentaje4 = nuevoDescuento4;
			}
		});
		btnNewButton.setBounds(325, 35, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton(" Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(325, 61, 85, 21);
		getContentPane().add(btnCancelar);
		
		JLabel lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(278, 39, 23, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("%");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(278, 62, 23, 13);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("%");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(278, 85, 23, 13);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("%");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(278, 108, 23, 13);
		getContentPane().add(lblNewLabel_1_1_1_1);
	}
}
