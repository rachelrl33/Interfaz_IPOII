package presentacion;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JLogin {

	private JFrame frame;
	static JPanel pnlLogin;
	private JPanel pnlUser;
	private JPanel pnlPass;
	private JLabel lblUsuario;
	private JButton btnAceptar;
	private JLabel lblContrasea;
	private JButton btnAtras;
	
	private Color resaltado = new Color(229,243,255);
	private JTextField txtUser;
	private JLabel lblLogo;
	private JPasswordField pfPass;
	private JButton btnLogin;
	private JLabel lblUsrLogeando;
	private JLabel lblErrorUser;
	private JLabel label;

    private JLabel loginStatus;
    private JButton btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws SQLException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin window = new JLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					Logger.getLogger(JLogin.class.getName()).log(Level.SEVERE, null, e);
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JLogin.class.getResource("/presentacion/logo2.png")));
		frame.setResizable(false);
		frame.setMinimumSize(new Dimension(436, 501));
		frame.setMaximumSize(new Dimension(436, 501));
		frame.setPreferredSize(new Dimension(436, 501));
		frame.setBounds(100, 100, 436, 461);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
//PANEL CONTENEDOR DE TODO EL LOG IN
		pnlLogin = new JPanel();
		frame.getContentPane().add(pnlLogin, BorderLayout.CENTER);
		pnlLogin.setLayout(new CardLayout(0, 0));
		
	//PANEL QUE CONTIENE EL INICIO DE SESIÓN
		pnlUser = new JPanel();
		pnlUser.setBackground(Color.WHITE);
		pnlLogin.add(pnlUser, "pnlUser");
		pnlUser.setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setBounds(95, 208, 71, 21);
		pnlUser.add(lblUsuario);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.setForeground(SystemColor.desktop);
		btnAceptar.setBackground(new Color(153, 180, 209));//2b78e4
		btnAceptar.setBounds(224, 334, 106, 43);
		btnAceptar.addActionListener(new BtnSiguienteActionListener());
		pnlUser.add(btnAceptar);
		
		txtUser = new JTextField();
		txtUser.addActionListener(new TxtUserActionListener());
		txtUser.addFocusListener(new FieldFocusListener());
		txtUser.setBounds(95, 239, 235, 27);
		pnlUser.add(txtUser);
		txtUser.setColumns(10);
		
		lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon(JLogin.class.getResource("/presentacion/logo2.png")));
		lblLogo.setBounds(119, 62, 179, 111);
		pnlUser.add(lblLogo);
		
		lblErrorUser = new JLabel("");
		lblErrorUser.setBounds(99, 281, 231, 14);
		pnlUser.add(lblErrorUser);
		
		btnSalir = new JButton("Salir");
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(95, 334, 106, 43);
		pnlUser.add(btnSalir);
		
		
	//PANEL QUE CONTIENE INTRO. CONTRASEÑA
		pnlPass = new JPanel();
		pnlPass.setBackground(Color.WHITE);
		pnlLogin.add(pnlPass, "pnlPass");
		pnlPass.setLayout(null);
		
		lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(109, 237, 93, 21);
		pnlPass.add(lblContrasea);
		
		btnAtras = new JButton("Atras");
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(73, 369, 129, 41);
		btnAtras.addActionListener(new BtnAtrasActionListener());
		pnlPass.add(btnAtras);
		
		pfPass = new JPasswordField();
		pfPass.addFocusListener(new FieldFocusListener());
		pfPass.setBounds(103, 269, 245, 27);
		pnlPass.add(pfPass);
		
		btnLogin = new JButton("Iniciar sesión");
		btnLogin.addActionListener(new BtnLoginActionListener());
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBackground(SystemColor.activeCaption);
		btnLogin.setForeground(SystemColor.desktop);
		btnLogin.setBounds(232, 369, 129, 41);
		pnlPass.add(btnLogin);
		
		lblUsrLogeando = new JLabel("Nombre de usuario");
		lblUsrLogeando.setIcon(null);
		lblUsrLogeando.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsrLogeando.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblUsrLogeando.setBounds(92, 136, 254, 69);
		pnlPass.add(lblUsrLogeando);
		
		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setIcon(new ImageIcon(JLogin.class.getResource("/presentacion/ag1.png")));
		label.setBounds(188, 48, 81, 101);
		pnlPass.add(label);
		
		loginStatus = new JLabel("");
		loginStatus.setForeground(Color.RED);
		loginStatus.setBounds(73, 318, 288, 14);
		pnlPass.add(loginStatus);
		
		
	//CLASE DEL PANEL QUE CONTIENE REGISTRO DE NUEVO USUARIO

	}

	private class BtnSiguienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

					lblUsrLogeando.setText(txtUser.getText());
					((CardLayout)pnlLogin.getLayout()).show(pnlLogin,"pnlPass");
					lblErrorUser.setText("");
		
		}
	}
	
	
	
	//OYENTES DE LOS BOTONES
	private class BtnAtrasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout)pnlLogin.getLayout()).show(pnlLogin,"pnlUser");
		}
	}
	private class FieldFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent arg0) {
			arg0.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(Color.WHITE);
		}
	}
	private class TxtUserActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnAceptar.doClick();
		}
	}
	private class BtnLoginActionListener implements ActionListener { //Action listener para login
		public void actionPerformed(ActionEvent e) {
			String nombreUsuario = txtUser.getText();
			char[] contrasenaUsuario = pfPass.getPassword();
			
			loginStatus.setText("");
			//pfPass.setText(""); prueb
			//txtUser.setText("");
			lblErrorUser.setText("");

			//Muestra la pantalla principal
			JPrincipal window = new JPrincipal();
			JFrame frame = new JFrame();
			window.frame.setVisible(true);
			
			//Quita la pantalla de contraseña


			
		}
	}
}
