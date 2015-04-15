package vista;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class PanelPrincipal extends JPanel{

	private JLabel lbli, lbln, lblRol, lblUsuario, lblContrasena, image;
	private JTextField txtUsuario;
	private JPasswordField pssContrasena;
	private Choice Rol;
	private JButton btnAceptar, btnCancelar;
	private ImageIcon imagen;
		
	public PanelPrincipal(){
		
		lblRol = new JLabel("Rol: ");
		Rol = new Choice();
		lblUsuario = new JLabel("Usuario: ");
		txtUsuario = new JTextField(13);
		lblContrasena = new JLabel("Contraseña: ");
		pssContrasena = new JPasswordField(20);
		imagen = new ImageIcon(getClass().getResource("../imagenes/logo.png"));
		image = new JLabel(imagen);

		//System.out.println(txtUsuario.getBackground());

		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblRol, gbc);


		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(Rol, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(lblUsuario, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(txtUsuario, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(lblContrasena, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
//		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(pssContrasena, gbc);

		panelDatos.setBackground(null);	

		JPanel panelimagen = new JPanel();
		panelimagen.setLayout(new GridBagLayout());
		
		GridBagConstraints img = new GridBagConstraints();
		img.gridx = 0;
		img.gridy = 0;
		img.gridwidth = 1;
		img.gridheight = 1;
		img.weightx = 0.0;
		img.weighty = 1.0;
		img.insets = new Insets(7, 3, 3, 3);
		img.fill = GridBagConstraints.NONE;
		img.anchor = GridBagConstraints.CENTER;
		panelimagen.add(image, img);
		panelimagen.setBackground(null);	

		//TIPOS DE LETRAS REUTILIZABLES
		Font osb = new Font( "Open Sans",Font.BOLD,15); 
		Font os = new Font( "Open Sans",Font.PLAIN,14);
		
		lblRol.setForeground(new Color(127, 52, 45));
		lblRol.setFont(os);
		Rol.setFont(os);
		Rol.add("Seleccione");
		Rol.add("----------");
		Rol.add("Usuario");
		Rol.add("Asesor Comercial");
		Rol.add("Administrador");
		Rol.add("Director General");
		lblUsuario.setFont(os);	
		lblUsuario.setForeground(new Color(127, 52, 45));
		txtUsuario.setFont(os);
		lblContrasena.setForeground(new Color(127, 52, 45));
		lblContrasena.setFont(os);
		pssContrasena.setFont(os);

//		btnAceptar.setFont(osb);
//		btnAceptar.setToolTipText("Confirma la informacion");
//		btnAceptar.setBackground(new Color(127, 52, 45));
//		btnAceptar.setForeground(new Color(255, 194, 92));

//		JPanel btnPanel = new JPanel();
//		btnPanel.setLayout(new GridBagLayout());
//		btnPanel.setBackground(null);
//		
//		GridBagConstraints btn = new GridBagConstraints();
//		btn.gridx = 0;
//		btn.gridy = 0;
//		btn.gridwidth = 1;
//		btn.gridheight = 1;
//		btn.weightx = 0.0;
//		btn.weighty = 1.0;
//		btn.insets = new Insets(20, 3, 3, 3);
//		btn.fill = GridBagConstraints.BOTH;
//		btn.anchor = GridBagConstraints.CENTER;
//		btnPanel.add(btnAceptar, btn);
//
//		btnCancelar.setFont(osb);
//		btnCancelar.setBackground(new Color(127, 52, 45));
//		btnCancelar.setForeground(new Color(255, 194, 92));
//		GridBagConstraints btn1 = new GridBagConstraints();
//		btn1.gridx = 1;
//		btn1.gridy = 0;
//		btn1.gridwidth = 1;
//		btn1.gridheight = 1;
//		btn1.weightx = 0.0;
//		btn1.weighty = 1.0;
//		btn1.insets = new Insets(20, 3, 3, 3);
//		btn1.fill = GridBagConstraints.BOTH;
//		btn1.anchor = GridBagConstraints.CENTER;
//		btnPanel.add(btnCancelar, btn1);

		GridBagConstraints pn = new GridBagConstraints();
		pn.gridx = 0;
		pn.gridy = 0;
		pn.gridwidth = 1;
		pn.gridheight = 1;
		pn.weightx = 0.0;
		pn.weighty = 1.0;
		pn.insets = new Insets(7, 3, 3, 3);
		pn.fill = GridBagConstraints.BOTH;
		pn.anchor = GridBagConstraints.CENTER;
		this.add(panelimagen, pn);

		GridBagConstraints pn1 = new GridBagConstraints();
		pn1.gridx = 1;
		pn1.gridy = 0;
		pn1.gridwidth = 1;
		pn1.gridheight = 1;
		pn1.weightx = 0.0;
		pn1.weighty = 1.0;
		pn1.insets = new Insets(7, 3, 3, 3);
		pn1.fill = GridBagConstraints.BOTH;
		pn1.anchor = GridBagConstraints.CENTER;
		this.add(panelDatos, pn1);

//		GridBagConstraints pn2 = new GridBagConstraints();
//		pn2.gridx = 3;
//		pn2.gridy = 0;
//		pn2.gridwidth = 1;
//		pn2.gridheight = 1;
//		pn2.weightx = 0.0;
//		pn2.weighty = 1.0;
//		pn2.insets = new Insets(7, 3, 3, 3);
//		pn2.fill = GridBagConstraints.BOTH;
//		pn2.anchor = GridBagConstraints.CENTER;
//		this.add(btnPanel, pn2);
//		this.setBackground(new Color(255, 194, 92));						//Color del panel


	}



	public String getTxtUsuario() {
		return txtUsuario.getText();
	}

	public void setTxtUsuario(String txtUsuario) {
		this.txtUsuario.setText(txtUsuario);
	}

	public String getTxtContrasena() {
		return pssContrasena.getText();
	}

	public void setTxtContrasena(String txtContrasena) {
		String c = new String(txtContrasena);
		this.pssContrasena.setText(c);
	}

	public String getRol() {
		return Rol.getSelectedItem();
	}
	
	public void setRol(Choice rol) {
		Rol = rol;
	}
	

	
	//ACTION PERFORMED
//	public void actionPerformed(ActionEvent evento){
	
	
//						Empresa e = Empresa.getInstance();
	
	
//		if  (evento.getSource() == btnAceptar && e.login(getRol(), getTxtUsuario(), getTxtContrase�a()) == true){
//			VentanaAsesorComercial v1 = new VentanaAsesorComercial();
//			
//		}else if(evento.getSource() == btnAceptar && e.login(getRol(), getTxtUsuario(), getTxtContrase�a()) == true){
//			
//			
//		} else if(evento.getSource() == btnAceptar && e.login(getRol(), getTxtUsuario(), getTxtContrase�a()) == false){
//			JOptionPane.showMessageDialog(this, "Usuario y/o Contrase�a invalida");
//		}
//		else if (evento.getSource() == btnCancelar)
//			JOptionPane.showMessageDialog(this, "Oprimio el boton cancelar");
//
//	}

}