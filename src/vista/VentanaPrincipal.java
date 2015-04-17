package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logica.Empresa;
import logica.UsuariosSistema;


public class VentanaPrincipal extends JFrame implements ActionListener {

//hiiiiii
	private PanelPrincipal panel;
	private JButton btnIngresar;
	private JButton btnSalir;
	private JPanel panelBotones;



	public VentanaPrincipal (){

		Empresa empresa = Empresa.getInstance();


		setTitle("Iniciar Sesión");
		setSize(700, 210);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		setLocationRelativeTo(null);

		panel = new PanelPrincipal ();
		panel.setBackground(null);
		panelBotones = new JPanel() ;
		panelBotones.setBackground(null);

		Font osb = new Font("Open Sans", Font.BOLD, 15);

		btnIngresar =  new JButton("Aceptar");
		btnIngresar.addActionListener(this);
		btnIngresar.setFont(osb);
		btnIngresar.setBackground(new Color(127, 52, 45));
		btnIngresar.setForeground(new Color(255, 194, 92));

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(osb);
		btnSalir.setBackground(new Color(127, 52, 45));
		btnSalir.setForeground(new Color(255, 194, 92));

		panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.insets = new Insets(20, 3, 3, 3);
		panelBotones.add(btnIngresar, gbc);
		panelBotones.add(btnSalir, gbc);

		JPanel panelcompleto = new JPanel();
		panelcompleto.setBackground(new Color(255, 194, 92));
		panelcompleto.add(panel);
		panelcompleto.add(panelBotones);

		add(panelcompleto);

	}

	//ACTION PERFORMED
	public void actionPerformed(ActionEvent evento){


		Empresa e = Empresa.getInstance();


		if  (evento.getSource() == btnIngresar && e.login(panel.getRol(), panel.getTxtUsuario(), panel.getTxtContrasena()) == true){
			VentanaAsesorComercial v1 = new VentanaAsesorComercial();

			this.setVisible(false);
		}

		else if(evento.getSource() == btnIngresar && e.login(panel.getRol(), panel.getTxtUsuario(), panel.getTxtContrasena()) == false){
//			Date fechaActual = Calendar.getInstance().getTime();
//	    	DateFormat df =  DateFormat.getDateInstance();
//	    	String fecha = df.format(fechaActual);
//			System.out.println(fecha);
			JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña invalida");
		}

		else if (evento.getSource() == btnSalir) {
			System.exit(0);
		}


	}


	//AGREGAR CLIENTES
	public void agregarCliente(String nombre, String apellido,String id, String edad, String genero, String cargo, String nombreUsuario, String password){
		Empresa empresa1 =  Empresa.getInstance();
		empresa1.agregarCliente(nombre, apellido, id, edad, genero, cargo, nombreUsuario, password, password, defaultCloseOperation, password, password, password, getDefaultCloseOperation());
	}

	//HACER LOGIN
	public boolean hacerLogin(String cargo, String usuario, String contrasena){
		Empresa empresa2 =  Empresa.getInstance();
		return empresa2.login(cargo, usuario, contrasena);
	}


	//MAIN
	public static void main(String[] args) {
		UsuariosSistema s = new UsuariosSistema();
		//System.out.println("Los asesores actuales son: "+s.getListaAsesores());
		VentanaPrincipal ventPpal = new VentanaPrincipal();
		ventPpal.setVisible(true);
	}
}
