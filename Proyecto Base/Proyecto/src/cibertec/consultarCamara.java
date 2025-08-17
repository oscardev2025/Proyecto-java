package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class consultarCamara extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			consultarCamara dialog = new consultarCamara();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public consultarCamara() {
		setTitle("Consultar camara");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(33, 28, 45, 13);
		contentPanel.add(lblNewLabel);
		
		JLabel lblPrecio = new JLabel("Precio (s/)");
		lblPrecio.setBounds(33, 51, 57, 13);
		contentPanel.add(lblPrecio);
		
		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(33, 74, 57, 13);
		contentPanel.add(lblAncho);
		
		JLabel lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(33, 97, 57, 13);
		contentPanel.add(lblAlto);
		
		JLabel lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setBounds(33, 120, 57, 13);
		contentPanel.add(lblFondocm);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(100, 24, 130, 21);
		contentPanel.add(comboBox);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(100, 48, 130, 19);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(100, 71, 130, 19);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(30, 195, 130, 19);
		contentPanel.add(textField_2);
	}
}
