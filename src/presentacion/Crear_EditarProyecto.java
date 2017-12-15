package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Crear_EditarProyecto extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblId;
	private JTextField txtNombre;
	private static boolean b_nombre;
	private JTextField txtID;
	private static boolean b_id;
	private JLabel lblUsuarioEncargado;
	private JTextField txtUsuarioEncargado;
	private static boolean b_encargado;
	private JLabel lblFechaInicio;
	//private JFormattedTextField ftFechaInicio;
	private JFormattedTextField ftFechaInicio_1;
	private static boolean b_finicio;
	private JLabel lblFechaLimite;
	//private JFormattedTextField ftFechaLimite;
	private JFormattedTextField ftFechaLimite_1;
	private static boolean b_ffin;
	private JLabel lblPrioridad;
	private JComboBox cbPrioridad;
	private JLabel lblEstado;
	private JComboBox cbEstado;
	private JButton btnAnadirRecursos;
	private JTextField txtF_Adjunto;
	private JScrollPane scrollPane;
	private JTextArea txtDescripcion;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private Border defaultB;
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);

	private DateFormat formatoFecha = new SimpleDateFormat("dd--MMMM--yyyy");
	private JLabel lblCal;
	private JLabel lblCal2;
	private JLabel lblWarningNom;
	private JLabel lblWarningID;
	private JLabel lblWarningFI;
	private JLabel lblWarningFF;
	private JLabel lblWarningEncarg;
	
	private static Crear_EditarProyecto frame = new Crear_EditarProyecto();
	//private static final DateFormat df = new SimpleDateFormat("dd/mm/aaaa");
	//private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Crear_EditarProyecto frame = new Crear_EditarProyecto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Crear_EditarProyecto() {
		setTitle("Proyecto ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Crear_EditarProyecto.class.getResource("/presentacion/folder.png")));
		setBounds(100, 100, 796, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{42, 0, 39, 50, 47, 64, 86, 32, 51, 79, 0, 44, 48, 0};
		gbl_contentPane.rowHeights = new int[]{38, 0, 0, 0, 0, 0, 23, 0, 0, 29, 90, 26, 29, 9, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 1;
		contentPane.add(lblId, gbc_lblId);
		
		lblFechaInicio = new JLabel("Fecha Inicio");
		GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
		gbc_lblFechaInicio.anchor = GridBagConstraints.WEST;
		gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaInicio.gridx = 6;
		gbc_lblFechaInicio.gridy = 1;
		contentPane.add(lblFechaInicio, gbc_lblFechaInicio);
		
		lblFechaLimite = new JLabel("Fecha Limite");
		GridBagConstraints gbc_lblFechaLimite = new GridBagConstraints();
		gbc_lblFechaLimite.anchor = GridBagConstraints.WEST;
		gbc_lblFechaLimite.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaLimite.gridx = 9;
		gbc_lblFechaLimite.gridy = 1;
		contentPane.add(lblFechaLimite, gbc_lblFechaLimite);
		
		txtNombre = new JTextField();
		defaultB=txtNombre.getBorder();
		txtNombre.addKeyListener(new TxtNombreKeyListener());
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 2;
		contentPane.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblWarningNom = new JLabel("");
		GridBagConstraints gbc_lblWarningNom = new GridBagConstraints();
		gbc_lblWarningNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningNom.anchor = GridBagConstraints.WEST;
		gbc_lblWarningNom.gridx = 2;
		gbc_lblWarningNom.gridy = 2;
		contentPane.add(lblWarningNom, gbc_lblWarningNom);
		
		txtID = new JTextField();
		txtID.addKeyListener(new TxtIDKeyListener());
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.gridwidth = 2;
		gbc_txtID.insets = new Insets(0, 0, 5, 5);
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.gridx = 3;
		gbc_txtID.gridy = 2;
		contentPane.add(txtID, gbc_txtID);
		txtID.setColumns(10);
		
		//ftFechaInicio = new JFormattedTextField();
		GridBagConstraints gbc_ftFechaInicio = new GridBagConstraints();
		gbc_ftFechaInicio.insets = new Insets(0, 0, 5, 5);
		gbc_ftFechaInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftFechaInicio.gridx = 6;
		gbc_ftFechaInicio.gridy = 2;
		
		MaskFormatter formatoFecha;
		try {
		formatoFecha = new MaskFormatter("##/##/####'");
		formatoFecha.setPlaceholderCharacter('X');
		ftFechaInicio_1 = new JFormattedTextField(formatoFecha);
		ftFechaInicio_1.addKeyListener(new FtFechaInicioKeyListener());
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		lblWarningID = new JLabel("");
		GridBagConstraints gbc_lblWarningID = new GridBagConstraints();
		gbc_lblWarningID.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningID.anchor = GridBagConstraints.WEST;
		gbc_lblWarningID.gridx = 5;
		gbc_lblWarningID.gridy = 2;
		contentPane.add(lblWarningID, gbc_lblWarningID);
		
		contentPane.add(ftFechaInicio_1, gbc_ftFechaInicio);
		
		//ftFechaLimite = new JFormattedTextField();
		GridBagConstraints gbc_ftFechaLimite = new GridBagConstraints();
		gbc_ftFechaLimite.insets = new Insets(0, 0, 5, 5);
		gbc_ftFechaLimite.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftFechaLimite.gridx = 9;
		gbc_ftFechaLimite.gridy = 2;
		
		//MaskFormatter formatoFecha;
		try {
		formatoFecha = new MaskFormatter("##/##/####'");
		formatoFecha.setPlaceholderCharacter('X');
		ftFechaLimite_1 = new JFormattedTextField(formatoFecha);
		ftFechaLimite_1.addKeyListener(new FtFechaLimiteKeyListener());
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		lblCal = new JLabel("");
		lblCal.setIcon(new ImageIcon(Crear_EditarProyecto.class.getResource("/presentacion/calen.png")));
		GridBagConstraints gbc_lblCal = new GridBagConstraints();
		gbc_lblCal.anchor = GridBagConstraints.WEST;
		gbc_lblCal.insets = new Insets(0, 0, 5, 5);
		gbc_lblCal.gridx = 7;
		gbc_lblCal.gridy = 2;
		contentPane.add(lblCal, gbc_lblCal);
		
		lblWarningFI = new JLabel("");
		GridBagConstraints gbc_lblWarningFI = new GridBagConstraints();
		gbc_lblWarningFI.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningFI.anchor = GridBagConstraints.WEST;
		gbc_lblWarningFI.gridx = 8;
		gbc_lblWarningFI.gridy = 2;
		contentPane.add(lblWarningFI, gbc_lblWarningFI);
		
		contentPane.add(ftFechaLimite_1, gbc_ftFechaLimite);
		
		lblCal2 = new JLabel("");
		lblCal2.setIcon(new ImageIcon(Crear_EditarProyecto.class.getResource("/presentacion/calen.png")));
		GridBagConstraints gbc_lblCal2 = new GridBagConstraints();
		gbc_lblCal2.anchor = GridBagConstraints.WEST;
		gbc_lblCal2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCal2.gridx = 10;
		gbc_lblCal2.gridy = 2;
		contentPane.add(lblCal2, gbc_lblCal2);
		
		lblWarningFF = new JLabel("");
		GridBagConstraints gbc_lblWarningFF = new GridBagConstraints();
		gbc_lblWarningFF.anchor = GridBagConstraints.WEST;
		gbc_lblWarningFF.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningFF.gridx = 11;
		gbc_lblWarningFF.gridy = 2;
		contentPane.add(lblWarningFF, gbc_lblWarningFF);
		
		lblUsuarioEncargado = new JLabel("Jefe de proyecto");
		GridBagConstraints gbc_lblUsuarioEncargado = new GridBagConstraints();
		gbc_lblUsuarioEncargado.anchor = GridBagConstraints.WEST;
		gbc_lblUsuarioEncargado.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuarioEncargado.gridx = 1;
		gbc_lblUsuarioEncargado.gridy = 4;
		contentPane.add(lblUsuarioEncargado, gbc_lblUsuarioEncargado);
		
		lblPrioridad = new JLabel("Prioridad");
		GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
		gbc_lblPrioridad.anchor = GridBagConstraints.WEST;
		gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrioridad.gridx = 6;
		gbc_lblPrioridad.gridy = 4;
		contentPane.add(lblPrioridad, gbc_lblPrioridad);
		
		lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.WEST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 9;
		gbc_lblEstado.gridy = 4;
		contentPane.add(lblEstado, gbc_lblEstado);
		
		txtUsuarioEncargado = new JTextField();
		txtUsuarioEncargado.addKeyListener(new TextFieldKeyListener());
		GridBagConstraints gbc_txtUsuarioEncargado = new GridBagConstraints();
		gbc_txtUsuarioEncargado.gridwidth = 4;
		gbc_txtUsuarioEncargado.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuarioEncargado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuarioEncargado.gridx = 1;
		gbc_txtUsuarioEncargado.gridy = 5;
		contentPane.add(txtUsuarioEncargado, gbc_txtUsuarioEncargado);
		txtUsuarioEncargado.setColumns(10);
		
		lblWarningEncarg = new JLabel("");
		GridBagConstraints gbc_lblWarningEncarg = new GridBagConstraints();
		gbc_lblWarningEncarg.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningEncarg.anchor = GridBagConstraints.WEST;
		gbc_lblWarningEncarg.gridx = 5;
		gbc_lblWarningEncarg.gridy = 5;
		contentPane.add(lblWarningEncarg, gbc_lblWarningEncarg);
		
		cbPrioridad = new JComboBox();
		cbPrioridad.setModel(new DefaultComboBoxModel(new String[] {"Baja", "Media", "Alta"}));
		GridBagConstraints gbc_cbPrioridad = new GridBagConstraints();
		gbc_cbPrioridad.gridwidth = 2;
		gbc_cbPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_cbPrioridad.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbPrioridad.gridx = 6;
		gbc_cbPrioridad.gridy = 5;
		contentPane.add(cbPrioridad, gbc_cbPrioridad);
		
		cbEstado = new JComboBox();
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"En proceso", "En espera", "Terminada"}));
		GridBagConstraints gbc_cbEstado = new GridBagConstraints();
		gbc_cbEstado.gridwidth = 3;
		gbc_cbEstado.insets = new Insets(0, 0, 5, 5);
		gbc_cbEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbEstado.gridx = 9;
		gbc_cbEstado.gridy = 5;
		contentPane.add(cbEstado, gbc_cbEstado);
		
		btnAnadirRecursos = new JButton("Anadir Recursos");
		btnAnadirRecursos.addActionListener(new BtnAnadirRecursosActionListener());
		GridBagConstraints gbc_btnAnadirRecursos = new GridBagConstraints();
		gbc_btnAnadirRecursos.anchor = GridBagConstraints.WEST;
		gbc_btnAnadirRecursos.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirRecursos.gridx = 1;
		gbc_btnAnadirRecursos.gridy = 7;
		contentPane.add(btnAnadirRecursos, gbc_btnAnadirRecursos);
		
		txtF_Adjunto = new JTextField();
		GridBagConstraints gbc_txtF_Adjunto = new GridBagConstraints();
		gbc_txtF_Adjunto.gridwidth = 4;
		gbc_txtF_Adjunto.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_Adjunto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_Adjunto.gridx = 1;
		gbc_txtF_Adjunto.gridy = 8;
		contentPane.add(txtF_Adjunto, gbc_txtF_Adjunto);
		txtF_Adjunto.setColumns(10);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 11;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 10;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setBorder(new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(txtDescripcion);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 9;
		gbc_btnCancelar.gridy = 12;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.gridwidth = 2;
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 10;
		gbc_btnAceptar.gridy = 12;
		contentPane.add(btnAceptar, gbc_btnAceptar);
	}

	
	
	

	//---------------------------------------------------
	//CONTROL DE FORMATOS Y VALIDEZ DE DATOS INTRODUCIDOS 
	//---------------------------------------------------
	

	private class TxtNombreKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent arg0) {
			if(txtNombre.getText().length() > 0) {
				b_nombre=true;
				lblWarningNom.setIcon(null);
				txtNombre.setBorder(defaultB);
			}else {
				b_nombre=false;
				txtNombre.setBorder(bordeRojo); 
				lblWarningNom.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}
		}
	}
	
	
	private class TxtIDKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			if(txtID.getText().length()>0) {
				b_id=true;
				lblWarningID.setIcon(null);
				txtID.setBorder(defaultB);
			}else {
				b_id=false;
				txtID.setBorder(bordeRojo); 
				lblWarningID.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}
		}
	}
	
	private class FtFechaInicioKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			if(ftFechaInicio_1.getText().length()==10){ //10 por el formato que es predefinido
				b_finicio=true;
				lblWarningFI.setIcon(null);
				ftFechaInicio_1.setBorder(defaultB);
			}else {
				b_finicio=true;
				ftFechaInicio_1.setBorder(bordeRojo); 
				lblWarningFI.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}
		}
	}
	
	private class FtFechaLimiteKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			if(ftFechaLimite_1.getText().length()==10) {
				b_ffin=true;
				lblWarningFF.setIcon(null);
				ftFechaLimite_1.setBorder(defaultB);
			}else {
				b_ffin=false;
				ftFechaLimite_1.setBorder(bordeRojo); 
				lblWarningFF.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}
		}
	}
	
	private class TextFieldKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			if(txtUsuarioEncargado.getText().length()>0) {
				b_encargado=true;
				lblWarningEncarg.setIcon(null);
				txtUsuarioEncargado.setBorder(defaultB);
			}else {
				b_encargado=false;
				txtUsuarioEncargado.setBorder(bordeRojo); 
				lblWarningEncarg.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));
			}
		}
	}
	
	
		
	
	
	//--------------------------------------------
	//                 OYENTES 
	//--------------------------------------------
	
	
	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
		}
	}
	
	
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				//System.exit(1);
			frame.setVisible(false);
		}
	}
	private class BtnAnadirRecursosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frame);

			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File fichero = fcAbrir.getSelectedFile();
				txtF_Adjunto.setText(fichero.getAbsolutePath());
			}
		}
	}
}
