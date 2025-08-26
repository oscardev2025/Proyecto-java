package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configurarDescuento extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurarDescuento dialog = new configurarDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurarDescuento() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 183);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(37, 23, 96, 13);
		contentPanel.add(lblNewLabel);
		
		JLabel lblA = new JLabel("6 a 10 unidades");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblA.setBounds(37, 46, 96, 13);
		contentPanel.add(lblA);
		
		JLabel lblA_2 = new JLabel("11 a 15 unidades");
		lblA_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblA_2.setBounds(37, 69, 96, 13);
		contentPanel.add(lblA_2);
		
		JLabel lblA_2_1 = new JLabel("Mas 15 unidades");
		lblA_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblA_2_1.setBounds(37, 92, 96, 13);
		contentPanel.add(lblA_2_1);
		
		textField = new JTextField();
		textField.setBounds(143, 21, 104, 19);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 44, 104, 19);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 67, 104, 19);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 90, 104, 19);
		contentPanel.add(textField_3);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(313, 23, 85, 21);
		contentPanel.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		btnCancelar.setBounds(313, 45, 85, 21);
		contentPanel.add(btnCancelar);
	}
}
