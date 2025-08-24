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
import javax.swing.SwingConstants;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Oscar Dev\\Downloads\\LogoVG.png"));
		setTitle("Acerca de VisionGuard");
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
		
		JLabel lblIntegrantes = new JLabel("Integrantes:");
		lblIntegrantes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntegrantes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIntegrantes.setBounds(113, 72, 208, 25);
		panel.add(lblIntegrantes);
		
		JLabel lblIntegrantes_1 = new JLabel("Sayut Ventura Cruz");
		lblIntegrantes_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntegrantes_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntegrantes_1.setBounds(113, 107, 208, 25);
		panel.add(lblIntegrantes_1);
		
		JLabel lblIntegrantes_2 = new JLabel("");
		lblIntegrantes_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntegrantes_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntegrantes_2.setBounds(113, 107, 208, 25);
		panel.add(lblIntegrantes_2);
		
		JLabel lblIntegrantes_1_1 = new JLabel("Oscar Perez Alvarez");
		lblIntegrantes_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntegrantes_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntegrantes_1_1.setBounds(113, 133, 208, 25);
		panel.add(lblIntegrantes_1_1);
		
		JLabel lblIntegrantes_1_1_1 = new JLabel("Oliver Palermo Trujillo");
		lblIntegrantes_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntegrantes_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntegrantes_1_1_1.setBounds(113, 159, 208, 25);
		panel.add(lblIntegrantes_1_1_1);
		
		JLabel lblIntegrantes_1_1_1_1 = new JLabel("Arturo Camposano Tineo");
		lblIntegrantes_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntegrantes_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntegrantes_1_1_1_1.setBounds(113, 185, 208, 25);
		panel.add(lblIntegrantes_1_1_1_1);
	}
}
