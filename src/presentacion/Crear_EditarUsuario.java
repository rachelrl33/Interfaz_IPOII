package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.BorderFactory;
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
import java.text.ParseException;

public class Crear_EditarUsuario {

	JFrame frame;
	private JLabel lblFotoAvatar;
	private JPanel panel;
	private JMenu mnSeleccionarAvatar;
	private JMenuItem menuItem;
	private JMenuItem menuItem_1;
	private JMenuItem menuItem_2;
	
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
	
	private JButton btnCancelar;
	private static JLabel lbl_WarningCo;
	private static JLabel lbl_WarningCoR;
	private static JLabel lbl_WarningEm;
	private static JLabel lbl_WarningTel;
	private static JLabel lbl_WarningNom;
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	
	private String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	

	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crear_EditarUsuario window = new Crear_EditarUsuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Crear_EditarUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Crear_EditarUsuario.class.getResource("/presentacion/users.png")));
		frame.setBounds(100, 100, 796, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{39, 88, 41, 16, 48, 0, 74, 0, 43, 98, 116, 72, 40, 0};
		gridBagLayout.rowHeights = new int[]{24, 33, 27, 27, 19, 20, 0, 27, 41, 0, 0, 20, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.gridwidth = 4;
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		frame.getContentPane().add(panel, gbc_panel);
		
		
		lblFotoAvatar = new JLabel("");
		lblFotoAvatar.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/ag1.png")));
		GridBagConstraints gbc_lblFotoAvatar = new GridBagConstraints();
		gbc_lblFotoAvatar.gridwidth = 2;
		gbc_lblFotoAvatar.gridheight = 2;
		gbc_lblFotoAvatar.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoAvatar.gridx = 1;
		gbc_lblFotoAvatar.gridy = 1;
		frame.getContentPane().add(lblFotoAvatar, gbc_lblFotoAvatar);
		

		
		txtA_conocimientos = new JTextArea();
		txtA_conocimientos.setFont(new Font("Verdana", Font.BOLD, 13));
		txtA_conocimientos.setBorder(new TitledBorder(null, "Conocimientos y habilidades", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_txtA_conocimientos = new GridBagConstraints();
		gbc_txtA_conocimientos.gridwidth = 3;
		gbc_txtA_conocimientos.insets = new Insets(0, 0, 5, 5);
		gbc_txtA_conocimientos.gridheight = 10;
		gbc_txtA_conocimientos.fill = GridBagConstraints.BOTH;
		gbc_txtA_conocimientos.gridx = 9;
		gbc_txtA_conocimientos.gridy = 1;
		frame.getContentPane().add(txtA_conocimientos, gbc_txtA_conocimientos);
		
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 6;
		gbc_lblNombre.gridy = 1;
		frame.getContentPane().add(lblNombre, gbc_lblNombre);
		
		txtF_nombre = new JTextField();
		txtF_nombre.addKeyListener(new TxtF_nombreActionListener());
		GridBagConstraints gbc_txtF_nombre = new GridBagConstraints();
		gbc_txtF_nombre.anchor = GridBagConstraints.NORTH;
		gbc_txtF_nombre.gridwidth = 2;
		gbc_txtF_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_nombre.gridx = 6;
		gbc_txtF_nombre.gridy = 2;
		frame.getContentPane().add(txtF_nombre, gbc_txtF_nombre);
		txtF_nombre.setColumns(10);
		
		lbl_WarningNom = new JLabel("");
		GridBagConstraints gbc_lbl_WarningNom = new GridBagConstraints();
		gbc_lbl_WarningNom.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningNom.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningNom.gridx = 8;
		gbc_lbl_WarningNom.gridy = 2;
		frame.getContentPane().add(lbl_WarningNom, gbc_lbl_WarningNom);
		
		
		
		mnSeleccionarAvatar = new JMenu("Seleccionar Avatar");
		mnSeleccionarAvatar.setHorizontalAlignment(SwingConstants.CENTER);
		mnSeleccionarAvatar.setBackground(Color.WHITE);
		panel.add(mnSeleccionarAvatar);
		
		menuItem_2 = new JMenuItem("");
		menuItem_2.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/ag4.png")));
		mnSeleccionarAvatar.add(menuItem_2);
		
		menuItem = new JMenuItem("");
		menuItem.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/ag1.png")));
		mnSeleccionarAvatar.add(menuItem);
		
		menuItem_1 = new JMenuItem("");
		menuItem_1.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/ag2.png")));
		mnSeleccionarAvatar.add(menuItem_1);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 6;
		gbc_lblTelefono.gridy = 3;
		frame.getContentPane().add(lblTelefono, gbc_lblTelefono);
		
		ftxtF_telefono = new JFormattedTextField();
		ftxtF_telefono.addKeyListener(new TxtF_telfActionListener());
		GridBagConstraints gbc_ftxtF_telefono = new GridBagConstraints();
		gbc_ftxtF_telefono.gridwidth = 2;
		gbc_ftxtF_telefono.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtF_telefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtF_telefono.gridx = 6;
		gbc_ftxtF_telefono.gridy = 4;
		frame.getContentPane().add(ftxtF_telefono, gbc_ftxtF_telefono);
		
		
		lbl_WarningTel = new JLabel("");
		GridBagConstraints gbc_lbl_WarningTel = new GridBagConstraints();
		gbc_lbl_WarningTel.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningTel.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningTel.gridx = 8;
		gbc_lbl_WarningTel.gridy = 4;
		frame.getContentPane().add(lbl_WarningTel, gbc_lbl_WarningTel);

		
		lbl_Email = new JLabel("Email");
		lbl_Email.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lbl_Email = new GridBagConstraints();
		gbc_lbl_Email.anchor = GridBagConstraints.WEST;
		gbc_lbl_Email.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Email.gridx = 1;
		gbc_lbl_Email.gridy = 6;
		frame.getContentPane().add(lbl_Email, gbc_lbl_Email);
		
		
		ftxtF_email = new JFormattedTextField();
		ftxtF_email.addKeyListener(new TxtF_emailActionListener());
		GridBagConstraints gbc_ftxtF_email = new GridBagConstraints();
		gbc_ftxtF_email.gridwidth = 7;
		gbc_ftxtF_email.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtF_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtF_email.gridx = 1;
		gbc_ftxtF_email.gridy = 7;
		frame.getContentPane().add(ftxtF_email, gbc_ftxtF_email);
		
		lbl_WarningEm = new JLabel("");
		GridBagConstraints gbc_lbl_WarningEm = new GridBagConstraints();
		gbc_lbl_WarningEm.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lbl_WarningEm.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningEm.gridx = 8;
		gbc_lbl_WarningEm.gridy = 7;
		frame.getContentPane().add(lbl_WarningEm, gbc_lbl_WarningEm);
		
		lblContrasena = new JLabel("Contrasena");
		lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.anchor = GridBagConstraints.WEST;
		gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasena.gridx = 1;
		gbc_lblContrasena.gridy = 9;
		frame.getContentPane().add(lblContrasena, gbc_lblContrasena);
		
		lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a");
		lblRepetirContrasea.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblRepetirContrasea = new GridBagConstraints();
		gbc_lblRepetirContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepetirContrasea.gridx = 6;
		gbc_lblRepetirContrasea.gridy = 9;
		frame.getContentPane().add(lblRepetirContrasea, gbc_lblRepetirContrasea);
		
		pssF_contrasena = new JPasswordField();
		pssF_contrasena.addKeyListener(new TxtF_passActionListener());
		GridBagConstraints gbc_pssF_contrasena = new GridBagConstraints();
		gbc_pssF_contrasena.gridwidth = 2;
		gbc_pssF_contrasena.insets = new Insets(0, 0, 5, 5);
		gbc_pssF_contrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_pssF_contrasena.gridx = 1;
		gbc_pssF_contrasena.gridy = 10;
		frame.getContentPane().add(pssF_contrasena, gbc_pssF_contrasena);
		
		lbl_WarningCo = new JLabel("");
		GridBagConstraints gbc_lbl_WarningCo = new GridBagConstraints();
		gbc_lbl_WarningCo.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningCo.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningCo.gridx = 3;
		gbc_lbl_WarningCo.gridy = 10;
		frame.getContentPane().add(lbl_WarningCo, gbc_lbl_WarningCo);
		
		pssF_contrasenaRep = new JPasswordField();
		pssF_contrasenaRep.addKeyListener(new TxtF_passRActionListener());
		GridBagConstraints gbc_pssF_contrasenaRep = new GridBagConstraints();
		gbc_pssF_contrasenaRep.gridwidth = 2;
		gbc_pssF_contrasenaRep.insets = new Insets(0, 0, 5, 5);
		gbc_pssF_contrasenaRep.fill = GridBagConstraints.HORIZONTAL;
		gbc_pssF_contrasenaRep.gridx = 6;
		gbc_pssF_contrasenaRep.gridy = 10;
		frame.getContentPane().add(pssF_contrasenaRep, gbc_pssF_contrasenaRep);
		
		lbl_WarningCoR = new JLabel("");
		GridBagConstraints gbc_lbl_WarningCoR = new GridBagConstraints();
		gbc_lbl_WarningCoR.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningCoR.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningCoR.gridx = 8;
		gbc_lbl_WarningCoR.gridy = 10;
		frame.getContentPane().add(lbl_WarningCoR, gbc_lbl_WarningCoR);
		
		
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.EAST;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 10;
		gbc_btnCancelar.gridy = 12;
		frame.getContentPane().add(btnCancelar, gbc_btnCancelar);
		

		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setEnabled(false);
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.anchor = GridBagConstraints.EAST;
		gbc_btnAceptar.gridx = 11;
		gbc_btnAceptar.gridy = 12;
		frame.getContentPane().add(btnAceptar, gbc_btnAceptar);
		
		
		
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	
	
	//---------------------------------------------------
	//CONTROL DE FORMATOS Y VALIDEZ DE DATOS INTRODUCIDOS 
	//---------------------------------------------------
	
	//NOMBRE
	private class TxtF_nombreActionListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			char c=e.getKeyChar(); 
			if((txtF_nombre.getText().length() < 0)||(Character.isDigit(c))) { 
				b_nombre = false;
				txtF_nombre.setBorder(bordeRojo); 
				lbl_WarningNom.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}else {
				b_nombre = true;
			}
			
			if(b_nombre && b_telefono && b_pass && b_passR && b_email) {
				btnAceptar.setEnabled(true);
			}
		}
	}
	
	
	//TELEFONO
	private class TxtF_telfActionListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			char c = e.getKeyChar();
			if(!Character.isDigit(c)){
				b_telefono = false;
				ftxtF_telefono.setBorder(bordeRojo); 
				lbl_WarningTel.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}else {
				b_telefono = true;
			}
			if(b_nombre && b_telefono && b_pass && b_passR && b_email) {
				btnAceptar.setEnabled(true);
			}
		}
	}
	
	
	//EMAIL
	private class TxtF_emailActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if(!ftxtF_email.getText().matches(EMAIL_PATTERN)) {
				b_email = false;
				ftxtF_email.setBorder(bordeRojo); 
				lbl_WarningEm.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));	
			}else {
				b_email = true;
			}
			if(b_nombre && b_telefono && b_pass && b_passR && b_email) {
				btnAceptar.setEnabled(true);
			}
		}
	}
	
	
	
	//CONTRASEÑA
	private class TxtF_passActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if(pssF_contrasena.getPassword().length <0) {
				b_pass = false;
				pssF_contrasena.setBorder(bordeRojo); 
				lbl_WarningCo.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}else {
				b_pass = true;
			}
			if(b_nombre && b_telefono && b_pass && b_passR && b_email) {
				btnAceptar.setEnabled(true);
			}
		}
	}
	
	//REPITA CONTRASEÑA
	private class TxtF_passRActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if((Arrays.equals(pssF_contrasena.getPassword(), pssF_contrasenaRep.getPassword()))) {
				b_pass = true;
			}else {
				b_pass = false;
				pssF_contrasenaRep.setBorder(bordeRojo); 
				lbl_WarningCoR.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}
			if(b_nombre && b_telefono && b_pass && b_passR && b_email) {
				btnAceptar.setEnabled(true);
			}
		}
	}
	
	
	
	

	
	
	public static class Auxiliar{
		public static void limpiarCampos() {
			txtF_nombre.setText("");
			pssF_contrasena.setText("");
			pssF_contrasenaRep.setText("");
			txtF_nombre.setText("");
			ftxtF_email.setText("");
			ftxtF_telefono.setText("");

			lbl_WarningNom.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			lbl_WarningCo.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			lbl_WarningCoR.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			lbl_WarningEm.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			lbl_WarningNom.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			lbl_WarningTel.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
		}
	}
	
	
	
	
	
	
	
	
	
	
	//--------------------------------------------
	//                 OYENTES 
	//--------------------------------------------
	
	
	
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
		}
	}
	
	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			frame.setVisible(false);
			JOptionPane.showMessageDialog(frame, "Usuario creado/editado correctamente", "Confirmación", JOptionPane.PLAIN_MESSAGE);
			}
		}
	



}

	
	
	

