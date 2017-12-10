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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;

public class Crear_EditarUsuario {

	private JFrame frame;
	private JLabel lblFotoAvatar;
	private JPanel panel;
	private JMenu mnSeleccionarAvatar;
	private JMenuItem menuItem;
	private JMenuItem menuItem_1;
	private JMenuItem menuItem_2;
	private JLabel lblNombre;
	private JTextField txtF_nombre;
	private JLabel lblTelefono;
	private JTextField txtF_telefono;
	private JLabel lblEmail;
	private JTextField txtF_email;
	private JLabel lblContrasea;
	private JPasswordField pssF_contraseña;
	private JLabel lblRepetirContrasea;
	private JPasswordField pssF_contraseñaRep;
	private JTextArea txtA_conocimientos;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lbl_WarningCo;
	private JLabel lbl_WarningCoR;
	private JLabel lbl_WarningEm;
	private JLabel lbl_WarningTel;
	private JLabel lbl_WarningNom;

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
		gridBagLayout.rowHeights = new int[]{24, 33, 27, 27, 19, 20, 0, 0, 41, 0, 0, 20, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblFotoAvatar = new JLabel("");
		lblFotoAvatar.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/ag1.png")));
		GridBagConstraints gbc_lblFotoAvatar = new GridBagConstraints();
		gbc_lblFotoAvatar.gridwidth = 2;
		gbc_lblFotoAvatar.gridheight = 2;
		gbc_lblFotoAvatar.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoAvatar.gridx = 1;
		gbc_lblFotoAvatar.gridy = 1;
		frame.getContentPane().add(lblFotoAvatar, gbc_lblFotoAvatar);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 6;
		gbc_lblNombre.gridy = 1;
		frame.getContentPane().add(lblNombre, gbc_lblNombre);
		
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
		
		txtF_nombre = new JTextField();
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
		lbl_WarningNom.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warining.png")));
		GridBagConstraints gbc_lbl_WarningNom = new GridBagConstraints();
		gbc_lbl_WarningNom.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbl_WarningNom.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningNom.gridx = 8;
		gbc_lbl_WarningNom.gridy = 2;
		frame.getContentPane().add(lbl_WarningNom, gbc_lbl_WarningNom);
		
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
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 6;
		gbc_lblTelefono.gridy = 3;
		frame.getContentPane().add(lblTelefono, gbc_lblTelefono);
		
		txtF_telefono = new JTextField();
		GridBagConstraints gbc_txtF_telefono = new GridBagConstraints();
		gbc_txtF_telefono.gridwidth = 2;
		gbc_txtF_telefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_telefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_telefono.gridx = 6;
		gbc_txtF_telefono.gridy = 4;
		frame.getContentPane().add(txtF_telefono, gbc_txtF_telefono);
		txtF_telefono.setColumns(10);
		
		lbl_WarningTel = new JLabel("");
		lbl_WarningTel.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warining.png")));
		GridBagConstraints gbc_lbl_WarningTel = new GridBagConstraints();
		gbc_lbl_WarningTel.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningTel.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningTel.gridx = 8;
		gbc_lbl_WarningTel.gridy = 4;
		frame.getContentPane().add(lbl_WarningTel, gbc_lbl_WarningTel);
		
		lblEmail = new JLabel("email");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 6;
		frame.getContentPane().add(lblEmail, gbc_lblEmail);
		
		txtF_email = new JTextField();
		GridBagConstraints gbc_txtF_email = new GridBagConstraints();
		gbc_txtF_email.gridwidth = 7;
		gbc_txtF_email.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_email.gridx = 1;
		gbc_txtF_email.gridy = 7;
		frame.getContentPane().add(txtF_email, gbc_txtF_email);
		txtF_email.setColumns(10);
		
		lbl_WarningEm = new JLabel("");
		lbl_WarningEm.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warining.png")));
		GridBagConstraints gbc_lbl_WarningEm = new GridBagConstraints();
		gbc_lbl_WarningEm.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lbl_WarningEm.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningEm.gridx = 8;
		gbc_lbl_WarningEm.gridy = 7;
		frame.getContentPane().add(lbl_WarningEm, gbc_lbl_WarningEm);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.WEST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 9;
		frame.getContentPane().add(lblContrasea, gbc_lblContrasea);
		
		lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a");
		lblRepetirContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblRepetirContrasea = new GridBagConstraints();
		gbc_lblRepetirContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepetirContrasea.gridx = 6;
		gbc_lblRepetirContrasea.gridy = 9;
		frame.getContentPane().add(lblRepetirContrasea, gbc_lblRepetirContrasea);
		
		pssF_contraseña = new JPasswordField();
		GridBagConstraints gbc_pssF_contraseña = new GridBagConstraints();
		gbc_pssF_contraseña.gridwidth = 2;
		gbc_pssF_contraseña.insets = new Insets(0, 0, 5, 5);
		gbc_pssF_contraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_pssF_contraseña.gridx = 1;
		gbc_pssF_contraseña.gridy = 10;
		frame.getContentPane().add(pssF_contraseña, gbc_pssF_contraseña);
		
		lbl_WarningCo = new JLabel("");
		lbl_WarningCo.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warining.png")));
		GridBagConstraints gbc_lbl_WarningCo = new GridBagConstraints();
		gbc_lbl_WarningCo.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningCo.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningCo.gridx = 3;
		gbc_lbl_WarningCo.gridy = 10;
		frame.getContentPane().add(lbl_WarningCo, gbc_lbl_WarningCo);
		
		pssF_contraseñaRep = new JPasswordField();
		GridBagConstraints gbc_pssF_contraseñaRep = new GridBagConstraints();
		gbc_pssF_contraseñaRep.gridwidth = 2;
		gbc_pssF_contraseñaRep.insets = new Insets(0, 0, 5, 5);
		gbc_pssF_contraseñaRep.fill = GridBagConstraints.HORIZONTAL;
		gbc_pssF_contraseñaRep.gridx = 6;
		gbc_pssF_contraseñaRep.gridy = 10;
		frame.getContentPane().add(pssF_contraseñaRep, gbc_pssF_contraseñaRep);
		
		lbl_WarningCoR = new JLabel("");
		lbl_WarningCoR.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warining.png")));
		GridBagConstraints gbc_lbl_WarningCoR = new GridBagConstraints();
		gbc_lbl_WarningCoR.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningCoR.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningCoR.gridx = 8;
		gbc_lbl_WarningCoR.gridy = 10;
		frame.getContentPane().add(lbl_WarningCoR, gbc_lbl_WarningCoR);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.EAST;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 10;
		gbc_btnCancelar.gridy = 12;
		frame.getContentPane().add(btnCancelar, gbc_btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
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
}
