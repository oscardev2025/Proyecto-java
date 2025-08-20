package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

public class listarCamaras extends JDialog {

	private static final long serialVersionUID = 1L;
	private Tienda tienda;

	/**
	 * Create the dialog.
	 */
	public listarCamaras(Tienda tienda) {
		setTitle("Listar camaras");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Oscar Dev\\Downloads\\LogoVG.png"));
		this.tienda = tienda;
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 436, 322);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnNewButton.setBounds(117, 332, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("LISTADO DE CAMARAS\n\n");
				
				textArea.append("Modelo:" + tienda.modelo1 + "\n");
				textArea.append("Precio:" + tienda.precio1 + "\n");
				textArea.append("Ancho:" + tienda.ancho1 + "\n");
				textArea.append("Alto:" + tienda.alto1 + "\n");
				textArea.append("Fondo:" + tienda.fondo1 + "\n\n");
				
				textArea.append("Modelo:" + tienda.modelo2 + "\n");
				textArea.append("Precio:" + tienda.precio2 + "\n");
				textArea.append("Ancho:" + tienda.ancho2 + "\n");
				textArea.append("Alto:" + tienda.alto2 + "\n");
				textArea.append("Fondo:" + tienda.fondo2 + "\n\n");
				
				textArea.append("Modelo:" + tienda.modelo3 + "\n");
				textArea.append("Precio:" + tienda.precio3 + "\n");
				textArea.append("Ancho:" + tienda.ancho3 + "\n");
				textArea.append("Alto:" + tienda.alto3 + "\n");
				textArea.append("Fondo:" + tienda.fondo3 + "\n\n");
				
				textArea.append("Modelo:" + tienda.modelo4 + "\n");
				textArea.append("Precio:" + tienda.precio4 + "\n");
				textArea.append("Ancho:" + tienda.ancho4 + "\n");
				textArea.append("Alto:" + tienda.alto4 + "\n");
				textArea.append("Fondo:" + tienda.fondo4 + "\n\n");
				
				textArea.append("Modelo:" + tienda.modelo5 + "\n");
				textArea.append("Precio:" + tienda.precio5 + "\n");
				textArea.append("Ancho:" + tienda.ancho5 + "\n");
				textArea.append("Alto:" + tienda.alto5 + "\n");
				textArea.append("Fondo:" + tienda.fondo5 + "\n\n");

			}
		});
		btnListar.setBounds(212, 332, 85, 21);
		getContentPane().add(btnListar);
		


	}
}
