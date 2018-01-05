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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;

import dominio.Usuario;


import java.awt.SystemColor;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JLogin {

	JFrame frame;
	static JPanel pnlLogin;
	private JPanel pnlUser;
	private JPanel pnlPass;
	private JLabel lbl_Usuario;
	private JButton btnAceptar;
	private JLabel lbl_Contrasea;
	private JButton btnAtras;

	private Color resaltado = new Color(229,243,255);
	private JTextField txtUser;
	private JLabel lbl_Logo;
	private JPasswordField pfPass;
	private JButton btnLogin;
	private JLabel lblUsrLogeando;
	private JLabel lbl_ErrorUser;
	private JLabel lbl_avatar;

	private JLabel lbl_loginStatus;
	private JButton btnSalir;
	private JLabel lbl_WarningC;
	private JLabel lbl_WarningUs;
	private JComboBox comboBox;
	private JLabel lbl_world;
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

		//PANEL QUE CONTIENE EL INICIO DE SESI�N
		pnlUser = new JPanel();
		pnlUser.setBackground(Color.WHITE);
		pnlLogin.add(pnlUser, "pnlUser");
		pnlUser.setLayout(null);

		lbl_Usuario = new JLabel(MessagesJLoginInter.getString("JLogin.lbl_Usuario.text")); //$NON-NLS-1$
		lbl_Usuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_Usuario.setBounds(87, 228, 71, 21);
		pnlUser.add(lbl_Usuario);

		btnAceptar = new JButton(MessagesJLoginInter.getString("JLogin.btnAceptar.text")); //$NON-NLS-1$
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.setForeground(SystemColor.desktop);
		btnAceptar.setBackground(new Color(153, 180, 209));//2b78e4
		btnAceptar.setBounds(216, 354, 106, 43);
		btnAceptar.addActionListener(new BtnSiguienteActionListener());
		btnAceptar.setEnabled(false);
		pnlUser.add(btnAceptar);

		txtUser = new JTextField();
		txtUser.addKeyListener(new TxtF_userActionListener());
		txtUser.addActionListener(new TxtUserActionListener());
		txtUser.addFocusListener(new FieldFocusListener());
		txtUser.setBounds(87, 259, 235, 27);
		pnlUser.add(txtUser);
		txtUser.setColumns(10);

		lbl_Logo = new JLabel("");
		lbl_Logo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Logo.setIcon(new ImageIcon(JLogin.class.getResource("/presentacion/logo2.png")));
		lbl_Logo.setBounds(115, 92, 179, 111);
		pnlUser.add(lbl_Logo);

		lbl_ErrorUser = new JLabel("");
		lbl_ErrorUser.setBounds(91, 301, 231, 14);
		pnlUser.add(lbl_ErrorUser);

		btnSalir = new JButton(MessagesJLoginInter.getString("JLogin.btnSalir.text")); //$NON-NLS-1$
		btnSalir.addActionListener(new BtnSalirActionListener());
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(87, 354, 106, 43);
		pnlUser.add(btnSalir);

		lbl_WarningUs = new JLabel("");
		lbl_WarningUs.setIcon(null);
		lbl_WarningUs.setBounds(326, 265, 46, 14);
		pnlUser.add(lbl_WarningUs);

		comboBox = new JComboBox();
		comboBox.addItemListener(new ComboBoxItemListener());
		comboBox.addItem("Espanol");
		comboBox.addItem("Ingles");

		comboBox.setRenderer(new RenderComboIdiomas());
		comboBox.setBounds(304, 21, 106, 20);
		pnlUser.add(comboBox);


		lbl_world = new JLabel("");
		lbl_world.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_world.setIcon(new ImageIcon(JLogin.class.getResource("/presentacion/earth.png")));
		lbl_world.setBounds(265, 21, 29, 21);
		pnlUser.add(lbl_world);


		//PANEL QUE CONTIENE INTRO. CONTRASEnA
		pnlPass = new JPanel();
		pnlPass.setBackground(Color.WHITE);
		pnlLogin.add(pnlPass, "pnlPass");
		pnlPass.setLayout(null);

		lbl_Contrasea = new JLabel(MessagesJLoginInter.getString("JLogin.lbl_Contrasea.text")); //$NON-NLS-1$
		lbl_Contrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_Contrasea.setBounds(92, 237, 93, 21);
		pnlPass.add(lbl_Contrasea);

		btnAtras = new JButton(MessagesJLoginInter.getString("JLogin.btnAtras.text")); //$NON-NLS-1$
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(73, 369, 129, 41);
		btnAtras.addActionListener(new BtnAtrasActionListener());
		pnlPass.add(btnAtras);

		pfPass = new JPasswordField();
		pfPass.addKeyListener(new TxtF_userActionListener());
		pfPass.addFocusListener(new FieldFocusListener());
		pfPass.setBounds(82, 269, 245, 27);
		pnlPass.add(pfPass);

		btnLogin = new JButton(MessagesJLoginInter.getString("JLogin.btnLogin.text")); //$NON-NLS-1$
		btnLogin.addActionListener(new BtnLoginActionListener());
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBackground(SystemColor.activeCaption);
		btnLogin.setForeground(SystemColor.desktop);
		btnLogin.setBounds(232, 369, 129, 41);
		pnlPass.add(btnLogin);
		btnLogin.setEnabled(false);


		lblUsrLogeando = new JLabel("Nombre de usuario");
		lblUsrLogeando.setIcon(null);
		lblUsrLogeando.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsrLogeando.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblUsrLogeando.setBounds(92, 136, 254, 69);
		pnlPass.add(lblUsrLogeando);

		lbl_avatar = new JLabel("");
		lbl_avatar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_avatar.setIcon(new ImageIcon(JLogin.class.getResource("/presentacion/user4.png")));
		lbl_avatar.setBounds(188, 48, 81, 101);
		pnlPass.add(lbl_avatar);

		lbl_loginStatus = new JLabel("");
		lbl_loginStatus.setForeground(Color.RED);
		lbl_loginStatus.setBounds(73, 318, 288, 14);
		pnlPass.add(lbl_loginStatus);

		lbl_WarningC = new JLabel("");
		lbl_WarningC.setBounds(331, 275, 46, 14);
		pnlPass.add(lbl_WarningC);



	}


	//--------------------------------------------
	//                 OYENTES 
	//--------------------------------------------

	private class TxtF_userActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if(txtUser.getText().length()!=0) {
				btnAceptar.setEnabled(true);
			}
			if(!pfPass.equals(null)) {
				btnLogin.setEnabled(true);
			}
		}
	}



	private class BtnSiguienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			lblUsrLogeando.setText(txtUser.getText());
			((CardLayout)pnlLogin.getLayout()).show(pnlLogin,"pnlPass");
			lbl_ErrorUser.setText("");

		}
	}


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

			lbl_loginStatus.setText("");
			//pfPass.setText(""); prueb
			//txtUser.setText("");
			lbl_ErrorUser.setText("");

			Usuario user = new Usuario (null,nombreUsuario,null,null,null, null, null);

			//Muestra la pantalla principal
			JPrincipal window = new JPrincipal(user);
			frame.setVisible(false);






		}
	}
	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
		}
	}
	private class ComboBoxItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			if(comboBox.getSelectedItem()!=null) {
				System.out.println(comboBox.getSelectedItem());
				if(comboBox.getSelectedItem().equals("Ingles")) {
					System.out.println("Mostrare ingles");
					MessagesJLoginInter.setIdioma("Ingles");
					//JLogin ventana = new JLogin();
					//ventana.getFrame().setVisible(true);
					//frame.dispose();
					frame.repaint();
				}else {
					System.out.println("Mostrare espanol");
					MessagesJLoginInter.setIdioma("Espanol");
					frame.repaint();
				}
				
				//JLogin ventana = new JLogin();
			}
		}
	}
}

