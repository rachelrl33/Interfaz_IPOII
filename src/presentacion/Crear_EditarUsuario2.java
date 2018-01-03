package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import dominio.Usuario;

import java.text.ParseException;
import javax.swing.JMenuBar;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class Crear_EditarUsuario2 {

	JFrame frmUsuario;
	
	private JLabel lblNombre;
	private static JTextField txtF_nombre;
	private static boolean b_nombre;
	
	private JLabel lblTelefono;
	private static JFormattedTextField ftxtF_telefono;
	private static boolean b_telefono;
	
	private JLabel lbl_Email;
	private static JFormattedTextField ftxtF_email;
	private static boolean b_email;
	
	private JLabel lblContrasena;
	private static JPasswordField pssF_contrasena;
	private static boolean b_pass;
	
	private JLabel lblRepetirContrasea;
	private static JPasswordField pssF_contrasenaRep;
	private static boolean b_passR;
	
	private JTextArea txtA_conocimientos;
	private JButton btnAceptar;
	private static boolean b_conocimientos;
	
	private JButton btnCancelar;
	private static JLabel lbl_WarningCo;
	private static JLabel lbl_WarningCoR;
	private static JLabel lbl_WarningEm;
	private static JLabel lbl_WarningTel;
	private static JLabel lbl_WarningNom;
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border defaultB;
	
	private String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private JPanel pnl_MenuAvatars;
	private JLabel lblSeleccionarAvatar;
	private boolean opcion;
	private static Usuario user;
	private JLabel lbl_WarningCon;
	private JLabel lblcamposObligatorios;
	private JLabel lblConocimientosYHabilidades;
	
	/**
	 * Create the application.
	 * @param user1 
	 * @param b 
	 * @throws ParseException 
	 */
	public Crear_EditarUsuario2(Usuario user1, boolean opcion1) throws ParseException {
		user=user1;
		opcion=opcion1;
		initialize();
		b_conocimientos=false;
		b_email=false;
		b_nombre=false;
		b_telefono=false;
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmUsuario = new JFrame();
		frmUsuario.setTitle("Usuario");
		frmUsuario.setResizable(false);
		frmUsuario.setIconImage(Toolkit.getDefaultToolkit().getImage(Crear_EditarUsuario2.class.getResource("/presentacion/users.png")));
		frmUsuario.setBounds(100, 100, 811, 505);
		frmUsuario.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{39, 0, 61, 41, 16, 48, 0, 74, 0, 43, 98, 116, 72, 0, 40, 0};
		gridBagLayout.rowHeights = new int[]{24, 33, 40, 27, 19, 20, 34, 33, 0, 27, 41, 0, 0, 22, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmUsuario.getContentPane().setLayout(gridBagLayout);
		
		pnl_MenuAvatars = new pnl_MenuAvatars(opcion);
		GridBagConstraints gbc_pnl_MenuAvatars = new GridBagConstraints();
		gbc_pnl_MenuAvatars.gridheight = 5;
		gbc_pnl_MenuAvatars.gridwidth = 5;
		gbc_pnl_MenuAvatars.insets = new Insets(0, 0, 5, 5);
		gbc_pnl_MenuAvatars.fill = GridBagConstraints.BOTH;
		gbc_pnl_MenuAvatars.gridx = 1;
		gbc_pnl_MenuAvatars.gridy = 1;
		frmUsuario.getContentPane().add(pnl_MenuAvatars, gbc_pnl_MenuAvatars);
		
		
		

		//CONOCIMIENTOS
		txtA_conocimientos = new JTextArea();
		txtA_conocimientos.setBorder(new LineBorder(Color.GRAY));
		txtA_conocimientos.setText(user.getConocimientos());
		txtA_conocimientos.setFont(new Font("Verdana", Font.BOLD, 13));
		txtA_conocimientos.addKeyListener(new AT_conocimientosActionListener());
		
		lblConocimientosYHabilidades = new JLabel("Conocimientos y habilidades*");
		GridBagConstraints gbc_lblConocimientosYHabilidades = new GridBagConstraints();
		gbc_lblConocimientosYHabilidades.anchor = GridBagConstraints.WEST;
		gbc_lblConocimientosYHabilidades.gridwidth = 2;
		gbc_lblConocimientosYHabilidades.insets = new Insets(0, 0, 5, 5);
		gbc_lblConocimientosYHabilidades.gridx = 10;
		gbc_lblConocimientosYHabilidades.gridy = 1;
		frmUsuario.getContentPane().add(lblConocimientosYHabilidades, gbc_lblConocimientosYHabilidades);

		GridBagConstraints gbc_txtA_conocimientos = new GridBagConstraints();
		gbc_txtA_conocimientos.gridwidth = 3;
		gbc_txtA_conocimientos.insets = new Insets(0, 0, 5, 5);
		gbc_txtA_conocimientos.gridheight = 11;
		gbc_txtA_conocimientos.fill = GridBagConstraints.BOTH;
		gbc_txtA_conocimientos.gridx = 10;
		gbc_txtA_conocimientos.gridy = 2;
		frmUsuario.getContentPane().add(txtA_conocimientos, gbc_txtA_conocimientos);
		
		
		
		
		//NOMBRE
		lblNombre = new JLabel("Nombre*");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 7;
		gbc_lblNombre.gridy = 1;
		frmUsuario.getContentPane().add(lblNombre, gbc_lblNombre);
		if(!opcion)lblNombre.setEnabled(false);
		
		txtF_nombre = new JTextField();
		txtF_nombre.setText(user.getNombre());
		defaultB=txtF_nombre.getBorder();
		txtF_nombre.addKeyListener(new TxtF_nombreActionListener());
		GridBagConstraints gbc_txtF_nombre = new GridBagConstraints();
		gbc_txtF_nombre.anchor = GridBagConstraints.NORTH;
		gbc_txtF_nombre.gridwidth = 2;
		gbc_txtF_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_nombre.gridx = 7;
		gbc_txtF_nombre.gridy = 2;
		frmUsuario.getContentPane().add(txtF_nombre, gbc_txtF_nombre);
		txtF_nombre.setColumns(10);
		if(!opcion) txtF_nombre.setEnabled(false);
		
		lbl_WarningNom = new JLabel("");
		lbl_WarningNom.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
		if(!opcion) lbl_WarningNom.setIcon(null);
		GridBagConstraints gbc_lbl_WarningNom = new GridBagConstraints();
		gbc_lbl_WarningNom.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbl_WarningNom.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningNom.gridx = 9;
		gbc_lbl_WarningNom.gridy = 2;
		frmUsuario.getContentPane().add(lbl_WarningNom, gbc_lbl_WarningNom);
		
		
		lbl_WarningCon = new JLabel("");
		lbl_WarningCon.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
		if(!opcion) lbl_WarningCon.setIcon(null);
		GridBagConstraints gbc_lbl_WarningCon = new GridBagConstraints();
		gbc_lbl_WarningCon.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningCon.gridx = 13;
		gbc_lbl_WarningCon.gridy = 2;
		frmUsuario.getContentPane().add(lbl_WarningCon, gbc_lbl_WarningCon);
		
		
		//TELEFONO
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 7;
		gbc_lblTelefono.gridy = 3;
		frmUsuario.getContentPane().add(lblTelefono, gbc_lblTelefono);
		
		
		MaskFormatter formatoTelf;
		try {
			formatoTelf = new MaskFormatter("'####'-###'-###");
			formatoTelf.setPlaceholderCharacter('X');
			ftxtF_telefono = new JFormattedTextField(formatoTelf);
			ftxtF_telefono.setText(user.getTelefono());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		GridBagConstraints gbc_ftxtF_telefono = new GridBagConstraints();
		gbc_ftxtF_telefono.gridwidth = 2;
		gbc_ftxtF_telefono.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtF_telefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtF_telefono.gridx = 7;
		gbc_ftxtF_telefono.gridy = 4;
		frmUsuario.getContentPane().add(ftxtF_telefono, gbc_ftxtF_telefono);
		
		
		lbl_WarningTel = new JLabel("");
		if(!opcion)lbl_WarningTel.setIcon(null);
		GridBagConstraints gbc_lbl_WarningTel = new GridBagConstraints();
		gbc_lbl_WarningTel.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningTel.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningTel.gridx = 9;
		gbc_lbl_WarningTel.gridy = 4;
		frmUsuario.getContentPane().add(lbl_WarningTel, gbc_lbl_WarningTel);
		
		lblSeleccionarAvatar = new JLabel("Seleccionar Avatar");
		lblSeleccionarAvatar.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblSeleccionarAvatar = new GridBagConstraints();
		gbc_lblSeleccionarAvatar.gridwidth = 5;
		gbc_lblSeleccionarAvatar.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionarAvatar.gridx = 1;
		gbc_lblSeleccionarAvatar.gridy = 6;
		frmUsuario.getContentPane().add(lblSeleccionarAvatar, gbc_lblSeleccionarAvatar);

		
		//EMAIL
		lbl_Email = new JLabel("Email*");
		lbl_Email.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lbl_Email = new GridBagConstraints();
		gbc_lbl_Email.gridwidth = 2;
		gbc_lbl_Email.anchor = GridBagConstraints.WEST;
		gbc_lbl_Email.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Email.gridx = 1;
		gbc_lbl_Email.gridy = 8;
		frmUsuario.getContentPane().add(lbl_Email, gbc_lbl_Email);
		
		
		ftxtF_email = new JFormattedTextField();
		ftxtF_email.setText(user.getEmail());
		ftxtF_email.addKeyListener(new TxtF_emailActionListener());
		GridBagConstraints gbc_ftxtF_email = new GridBagConstraints();
		gbc_ftxtF_email.gridwidth = 8;
		gbc_ftxtF_email.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtF_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtF_email.gridx = 1;
		gbc_ftxtF_email.gridy = 9;
		frmUsuario.getContentPane().add(ftxtF_email, gbc_ftxtF_email);
		
		lbl_WarningEm = new JLabel("");
		lbl_WarningEm.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
		if(!opcion) lbl_WarningEm.setIcon(null);
		GridBagConstraints gbc_lbl_WarningEm = new GridBagConstraints();
		gbc_lbl_WarningEm.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lbl_WarningEm.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningEm.gridx = 9;
		gbc_lbl_WarningEm.gridy = 9;
		frmUsuario.getContentPane().add(lbl_WarningEm, gbc_lbl_WarningEm);
		
		
		//CONTRASEnA
		lblContrasena = new JLabel("Contrasena");
		lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.gridwidth = 2;
		gbc_lblContrasena.anchor = GridBagConstraints.WEST;
		gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasena.gridx = 1;
		gbc_lblContrasena.gridy = 11;
		frmUsuario.getContentPane().add(lblContrasena, gbc_lblContrasena);
		
		
		//REPETIR CONTRASENA
		lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a");
		lblRepetirContrasea.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblRepetirContrasea = new GridBagConstraints();
		gbc_lblRepetirContrasea.gridwidth = 2;
		gbc_lblRepetirContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepetirContrasea.gridx = 6;
		gbc_lblRepetirContrasea.gridy = 11;
		frmUsuario.getContentPane().add(lblRepetirContrasea, gbc_lblRepetirContrasea);
		
		pssF_contrasena = new JPasswordField();
		pssF_contrasena.setText(user.getContrasena());
		//pssF_contrasena.addKeyListener(new TxtF_passActionListener());
		GridBagConstraints gbc_pssF_contrasena = new GridBagConstraints();
		gbc_pssF_contrasena.gridwidth = 3;
		gbc_pssF_contrasena.insets = new Insets(0, 0, 5, 5);
		gbc_pssF_contrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_pssF_contrasena.gridx = 1;
		gbc_pssF_contrasena.gridy = 12;
		frmUsuario.getContentPane().add(pssF_contrasena, gbc_pssF_contrasena);
		
		lbl_WarningCo = new JLabel("");
		if(!opcion)lbl_WarningCo.setIcon(null);
		GridBagConstraints gbc_lbl_WarningCo = new GridBagConstraints();
		gbc_lbl_WarningCo.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningCo.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningCo.gridx = 4;
		gbc_lbl_WarningCo.gridy = 12;
		frmUsuario.getContentPane().add(lbl_WarningCo, gbc_lbl_WarningCo);
		
		
		pssF_contrasenaRep = new JPasswordField();
		pssF_contrasenaRep.addKeyListener(new TxtF_passRActionListener());
		GridBagConstraints gbc_pssF_contrasenaRep = new GridBagConstraints();
		gbc_pssF_contrasenaRep.gridwidth = 3;
		gbc_pssF_contrasenaRep.insets = new Insets(0, 0, 5, 5);
		gbc_pssF_contrasenaRep.fill = GridBagConstraints.HORIZONTAL;
		gbc_pssF_contrasenaRep.gridx = 6;
		gbc_pssF_contrasenaRep.gridy = 12;
		frmUsuario.getContentPane().add(pssF_contrasenaRep, gbc_pssF_contrasenaRep);
		
		lbl_WarningCoR = new JLabel("");
		GridBagConstraints gbc_lbl_WarningCoR = new GridBagConstraints();
		gbc_lbl_WarningCoR.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningCoR.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningCoR.gridx = 9;
		gbc_lbl_WarningCoR.gridy = 12;
		frmUsuario.getContentPane().add(lbl_WarningCoR, gbc_lbl_WarningCoR);
		

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		
		lblcamposObligatorios = new JLabel("*Campos obligatorios");
		lblcamposObligatorios.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblcamposObligatorios = new GridBagConstraints();
		gbc_lblcamposObligatorios.anchor = GridBagConstraints.WEST;
		gbc_lblcamposObligatorios.gridwidth = 3;
		gbc_lblcamposObligatorios.insets = new Insets(0, 0, 5, 5);
		gbc_lblcamposObligatorios.gridx = 1;
		gbc_lblcamposObligatorios.gridy = 14;
		frmUsuario.getContentPane().add(lblcamposObligatorios, gbc_lblcamposObligatorios);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.EAST;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 11;
		gbc_btnCancelar.gridy = 14;
		frmUsuario.getContentPane().add(btnCancelar, gbc_btnCancelar);
		
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.anchor = GridBagConstraints.EAST;
		gbc_btnAceptar.gridx = 12;
		gbc_btnAceptar.gridy = 14;
		frmUsuario.getContentPane().add(btnAceptar, gbc_btnAceptar);
		

	}

	


	public void guardarDatosArchivo(){
		String nombreArchivo= "src/resources/fichero_escritura.txt"; 
		FileWriter fw = null; 
		try { 
			fw = new FileWriter(nombreArchivo); 
			BufferedWriter bw = new BufferedWriter(fw); 
			PrintWriter salArch = new PrintWriter(bw); 

			salArch.print(txtF_nombre.getText()); 
			salArch.println(); 
			salArch.print(ftxtF_telefono.getText()); 
			salArch.println(); 
			salArch.print(ftxtF_email.getText());
			salArch.println(); 
			salArch.print(txtA_conocimientos.getText());
			salArch.close(); 
		} 
		catch (IOException ex) { 
		} 
		
	}
	
	
	
	//---------------------------------------------------
	//CONTROL DE FORMATOS Y VALIDEZ DE DATOS INTRODUCIDOS 
	//---------------------------------------------------
	
	//NOMBRE
	private class TxtF_nombreActionListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			if(txtF_nombre.getText().length() > 0) {
				lbl_WarningNom.setIcon(null);
				txtF_nombre.setBorder(defaultB);
			}else {
				//txtF_nombre.setBorder(bordeRojo); 
				lbl_WarningNom.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));	
			}

		}
	}
	
	

	
	//EMAIL
	private class TxtF_emailActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if(ftxtF_email.getText().matches(EMAIL_PATTERN)) {
				lbl_WarningEm.setIcon(null);
				ftxtF_email.setBorder(defaultB);
			}else {

				ftxtF_email.setBorder(bordeRojo); 
				lbl_WarningEm.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
			}

		}
	}
	
	

	
	//CONTRASEÑA
	/*private class TxtF_passActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if(pssF_contrasena.getPassword().length >0) {
				lbl_WarningCo.setIcon(null);
				pssF_contrasena.setBorder(defaultB);
			}else {	

				pssF_contrasena.setBorder(bordeRojo); 
				lbl_WarningCo.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));	
			}

		}
	}*/
	
	
	//REPITA CONTRASENA
	private class TxtF_passRActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if((Arrays.equals(pssF_contrasena.getPassword(), pssF_contrasenaRep.getPassword()))) {
				lbl_WarningCoR.setIcon(null);
				pssF_contrasenaRep.setBorder(defaultB);
			}else {

				//pssF_contrasenaRep.setBorder(bordeRojo); 
				lbl_WarningCoR.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
			}
		}
	}
	
	
	
	
	
	//CONOCIMIENTOS
		private class AT_conocimientosActionListener extends KeyAdapter {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtA_conocimientos.getText().length() > 0) {
					lbl_WarningCon.setIcon(null);
					txtA_conocimientos.setBorder(defaultB);
				}else {
					//txtA_conocimientos.setBorder(bordeRojo); 
					lbl_WarningCon.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));	
				}

			}
		}
	
	
	
	

	
	
	
	
	//--------------------------------------------
	//                 OYENTES 
	//--------------------------------------------
	
	
	
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frmUsuario.setVisible(false);
		}
	}
	
	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Crear o modificar el usuario
			//Usuario user = new Usuario (lblFotoAvatar.getIcon(),lblNombre.getText(),lblTelefono.getText(),lbl_Email.getText(),lblContrasena.getText(), txtA_conocimientos.getText(), null);
			if(opcion) {
				if(txtF_nombre.getText().length() > 0 && txtA_conocimientos.getText().length() > 0 && ftxtF_email.getText().matches(EMAIL_PATTERN)) {
					guardarDatosArchivo();
					frmUsuario.dispose();
					frmUsuario.setVisible(false);
					JOptionPane.showMessageDialog(frmUsuario, "Usuario creado/editado correctamente", "Confirmacion", JOptionPane.PLAIN_MESSAGE);
					pnl_Usuarios.crearUsuario();

				}
			} else{
				if(txtF_nombre.getText().length() > 0 && txtA_conocimientos.getText().length() > 0 && ftxtF_email.getText().matches(EMAIL_PATTERN) && ftxtF_telefono.getText().length() > 0) {
					guardarDatosArchivo();
					pnl_Usuarios.editarUsuario();
					frmUsuario.dispose();
					frmUsuario.setVisible(false);
				}
			}
			
	
		}
	}

}

	
	
	

