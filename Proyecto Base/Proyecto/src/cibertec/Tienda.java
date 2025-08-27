package cibertec;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Tienda extends JFrame implements ActionListener {

    // Datos primera cámara
    public String modelo1 = "DS-2CE19H0T-AIT3ZF";
    public double precio1 = 281.0;
    public double ancho1 = 22.0;
    public double alto1 = 35.34;
    public double fondo1 = 22.0;

    // Datos segunda cámara
    public String modelo2 = "DS-2CE79H0T-VFIT3F";
    public double precio2 = 644.0;
    public double ancho2 = 8.5;
    public double alto2 = 92.0;
    public double fondo2 = 25.5;

    // Datos tercera cámara
    public String modelo3 = "DS-2CD2T45G0P-I";
    public double precio3 = 2041.0;
    public double ancho3 = 10.5;
    public double alto3 = 16.0;
    public double fondo3 = 10.5;

    // Datos cuarta cámara
    public String modelo4 = "NHC-IF20T";
    public double precio4 = 172.69;
    public double ancho4 = 10.9;
    public double alto4 = 10.9;
    public double fondo4 = 9.4;

    // Datos quinta cámara
    public String modelo5 = "DS-2CD2683G2";
    public double precio5 = 2059.0;
    public double ancho5 = 10.5;
    public double alto5 = 27.0;
    public double fondo5 = 10.5;

    // Porcentajes de descuento
    public double porcentaje1 = 0.075;
    public double porcentaje2 = 0.10;
    public double porcentaje3 = 0.125;
    public double porcentaje4 = 0.150;

    // Cantidad óptima de cámaras vendidas
    public int cantidadOptima = 10;

    // Obsequios
    public String obsequio1 = "Calendario";
    public String obsequio2 = "Funda para camara";
    public String obsequio3 = "Memoria Micro-SD";
    // contador de ventas
    public int contadorVentas = 0;

    /**
     * Launch the application. CRUD
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(() -> {
            try {
                Tienda frame = new Tienda();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public Tienda() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Oscar Dev\\Downloads\\LogoVG.png"));
        setTitle("Tienda VisionGuard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 662, 501);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnArchivo = new JMenu("Archivo");
        menuBar.add(mnArchivo);

        JMenuItem mntmSalir = new JMenuItem("Salir");
        mntmSalir.addActionListener(e -> dispose());
        mnArchivo.add(mntmSalir);

        JMenu mnMantenimiento = new JMenu("Mantenimiento");
        menuBar.add(mnMantenimiento);

        JMenuItem mntmConsultarCamara = new JMenuItem("Consultar camara");
        mntmConsultarCamara.addActionListener(e -> {
            consultarCamara dialogo = new consultarCamara(this);
            dialogo.setModal(true);
            dialogo.setVisible(true);
        });
        mnMantenimiento.add(mntmConsultarCamara);

        JMenuItem mntmModificarCamara = new JMenuItem("Modificar Camara");
        mntmModificarCamara.addActionListener(e -> {
            modificarCamara dialogo = new modificarCamara(this);
            dialogo.setModal(true);
            dialogo.setVisible(true);

        });
        mnMantenimiento.add(mntmModificarCamara);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Listar camaras");
        mntmNewMenuItem.addActionListener(e -> {
            listarCamaras dialogo = new listarCamaras(this);
            dialogo.setModal(true);
            dialogo.setVisible(true);
        });
        mnMantenimiento.add(mntmNewMenuItem);
        

        JMenu mnVentas = new JMenu("Ventas");
        menuBar.add(mnVentas);

        JMenuItem menuItem = new JMenuItem("Vender");
        menuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                vender dialogo = new vender(Tienda.this);
                dialogo.setModal(true);
                dialogo.setVisible(true);
        	}
        });
        mnVentas.add(menuItem);
        
        mnVentas.add(new JMenuItem("Generar reportes"));

        JMenu mnConfiguracion = new JMenu("Configuracion");
        menuBar.add(mnConfiguracion);

        mnConfiguracion.add(new JMenuItem("Configurar descuentos"));
        mnConfiguracion.add(new JMenuItem("Configurar Obsequios"));

        JMenu mnAyuda = new JMenu("Ayuda");
        menuBar.add(mnAyuda);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Acerca de VisionGuard");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                acercaTirnda dialogo = new acercaTirnda();
                dialogo.setModal(true);
                dialogo.setVisible(true);
        	}
        });
        mnAyuda.add(mntmNewMenuItem_1);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setEnabled(false);
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Oscar Dev\\Downloads\\VisionGuard-FONDO.png"));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
        lblNewLabel_1.setBounds(106, 10, 423, 412);
        getContentPane().add(lblNewLabel_1);
    }


    public void actionPerformed(ActionEvent e) {

    }
}
