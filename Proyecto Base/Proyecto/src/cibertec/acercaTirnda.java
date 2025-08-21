package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;

public class acercaTirnda extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			acercaTirnda dialog = new acercaTirnda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public acercaTirnda() {
		setTitle("Los pollitos dicen");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 436, 263);
		getContentPane().add(panel);
		panel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tienda VisionGuard 1.0");
			lblNewLabel.setBounds(113, 26, 208, 25);
			panel.add(lblNewLabel);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		
		JTextPane txtpnIntegrantesOscarPerez = new JTextPane();
		txtpnIntegrantesOscarPerez.setBounds(166, 95, 119, 74);
		panel.add(txtpnIntegrantesOscarPerez);
		txtpnIntegrantesOscarPerez.setEditable(false);
		txtpnIntegrantesOscarPerez.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnIntegrantesOscarPerez.setText("Oscar Perez\r\nOliver Palermo\r\nSayut Ventura\r\nArturo Tineo");
		
		JLabel lblNewLabel_1 = new JLabel("Integrantes:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(166, 70, 92, 25);
		panel.add(lblNewLabel_1);
	}
}
