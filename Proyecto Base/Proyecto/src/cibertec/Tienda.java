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

public class Tienda extends JFrame implements ActionListener {

    // Datos primera cámara
    public String modelo1 = "DS-2CE19H0T-AIT3ZF";
    public double precio1 = 28.10;
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
    public double porcentaje1 = 7.5;
    public double porcentaje2 = 10.0;
    public double porcentaje3 = 12.5;
    public double porcentaje4 = 15.0;

    // Cantidad óptima de cámaras vendidas
    public int cantidadOptima = 10;

    // Cantidad mínima para obsequio
    public int cantidadMinimaObsequiable = 3;

    // Obsequio por cantidad mínima
    public String obsequio = "USB";

    // Número de cliente con premio sorpresa
    public int numeroClienteSorpresa = 5;

    // Premio sorpresa
    public String premioSorpresa = "Un polo";

    /**
     * Launch the application.
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
        setTitle("Tienda VisionGuard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 662, 465);

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

        });
        mnMantenimiento.add(mntmModificarCamara);

        JMenu mnVentas = new JMenu("Ventas");
        menuBar.add(mnVentas);

        mnVentas.add(new JMenuItem("Vender"));
        mnVentas.add(new JMenuItem("Generar reportes"));

        JMenu mnConfiguracion = new JMenu("Configuracion");
        menuBar.add(mnConfiguracion);

        mnConfiguracion.add(new JMenuItem("Configurar descuentos"));
        mnConfiguracion.add(new JMenuItem("Configurar Obsequios"));
        mnConfiguracion.add(new JMenuItem("Configurar cantidad optima"));
        mnConfiguracion.add(new JMenuItem("Configurar cuota diaria"));

        JMenu mnAyuda = new JMenu("Ayuda");
        menuBar.add(mnAyuda);

        mnAyuda.add(new JMenuItem("Acerca de nuestra Tienda"));
    }

    public void actionPerformed(ActionEvent e) {

    }
}
