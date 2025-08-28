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

public class modificarObsequio extends JDialog {
	private Tienda tienda;

	private static final long serialVersionUID = 1L;
	private JTextField textobsequio3;
	private JTextField textobsequio2;
	private JTextField textobsequio1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Tienda tienda = new Tienda();
			modificarObsequio dialog = new modificarObsequio(tienda);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public modificarObsequio(Tienda tienda) {
		this.tienda = tienda;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Oscar Dev\\Downloads\\LogoVG.png"));
		setTitle("Modificar obsequios");
		setBounds(100, 100, 450, 149);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("1 unidad");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setBounds(44, 35, 100, 13);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblA = new JLabel("2 a 5 unidades");
			lblA.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblA.setBounds(44, 58, 100, 13);
			getContentPane().add(lblA);
		}
		{
			JLabel lblAMas = new JLabel("6 a mas unidades");
			lblAMas.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAMas.setBounds(44, 81, 100, 13);
			getContentPane().add(lblAMas);
		}
		{
			textobsequio3 = new JTextField();
			textobsequio3.setText(String.valueOf(tienda.obsequio3));
			textobsequio3.setBounds(154, 79, 150, 19);
			getContentPane().add(textobsequio3);
			textobsequio3.setColumns(10);
		}
		{
			textobsequio2 = new JTextField();
			textobsequio2.setText(String.valueOf(tienda.obsequio2));
			textobsequio2.setColumns(10);
			textobsequio2.setBounds(154, 56, 150, 19);
			getContentPane().add(textobsequio2);
		}
		{
			textobsequio1 = new JTextField();
			textobsequio1.setText(String.valueOf(tienda.obsequio1));
			textobsequio1.setColumns(10);
			textobsequio1.setBounds(154, 33, 150, 19);
			getContentPane().add(textobsequio1);
		}
		{
			JButton btnNewButton = new JButton("Aceptar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nuevoObsequio1 = textobsequio1.getText();
					String nuevoObsequio2 = textobsequio2.getText();
					String nuevoObsequio3 = textobsequio3.getText();
					
					tienda.obsequio1 = nuevoObsequio1;
					tienda.obsequio2 = nuevoObsequio2;
					tienda.obsequio3 = nuevoObsequio3;
				}
			});
			btnNewButton.setBounds(341, 32, 85, 21);
			getContentPane().add(btnNewButton);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCancelar.setBounds(341, 58, 85, 21);
			getContentPane().add(btnCancelar);
		}
	}

}
