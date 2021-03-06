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
import javax.swing.JTree;
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
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import dominio.Proyecto;
import dominio.Tarea;
import dominio.Usuario;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class Crear_EditarProyecto{

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

	private int opcion;
	private Proyecto proyecto;

	JFrame frmProyectoa;// = new Crear_EditarProyecto();
	private JLabel lblCategoria;
	private JComboBox comboBox;
	//private static final DateFormat df = new SimpleDateFormat("dd/mm/aaaa");
	//private JFrame frame;
	/**
	 * Launch the application.
	 */
	/*	public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 * @param nodoProyectos 
	 * @return 
	 */
	private DefaultMutableTreeNode nodoProyectos;
	private JTree tree;
	private JLabel lblcamposObligatorios;
	
	public Crear_EditarProyecto(int opcion1, DefaultMutableTreeNode nodoProyectos, JTree tree, Proyecto p1) throws ParseException {
		this.nodoProyectos = nodoProyectos;
		this.tree = tree;
		opcion = opcion1;
		proyecto=p1;
		initialize();
	}

	public void initialize() throws ParseException{
		frmProyectoa = new JFrame();
		frmProyectoa.setResizable(false);
		//Crear_EditarProyecto(){
		frmProyectoa.setTitle(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.frmProyectoa.title")); //$NON-NLS-1$

		if(opcion==1) {
			frmProyectoa.setTitle("Nuevo Proyecto");
		}else if(opcion==2) {
			frmProyectoa.setTitle("Editar Proyecto");
		}else {
			frmProyectoa.setTitle("Nueva Tarea");
		}

		frmProyectoa.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmProyectoa.setIconImage(Toolkit.getDefaultToolkit().getImage(Crear_EditarProyecto.class.getResource("/presentacion/folder.png")));
		frmProyectoa.setBounds(100, 100, 741, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmProyectoa.setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{42, 0, 39, 50, 47, 64, 86, 32, 51, 79, 0, 44, 48, 0};
		gbl_contentPane.rowHeights = new int[]{38, 0, 0, 0, 0, 0, 23, 0, 0, 29, 90, 26, 29, 9, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		lblNombre = new JLabel(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.lblNombre.text")); //$NON-NLS-1$
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);

		lblId = new JLabel("ID*");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 1;
		contentPane.add(lblId, gbc_lblId);

		lblFechaInicio = new JLabel(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.lblFechaInicio.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
		gbc_lblFechaInicio.anchor = GridBagConstraints.WEST;
		gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaInicio.gridx = 6;
		gbc_lblFechaInicio.gridy = 1;
		contentPane.add(lblFechaInicio, gbc_lblFechaInicio);

		lblFechaLimite = new JLabel(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.lblFechaLimite.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblFechaLimite = new GridBagConstraints();
		gbc_lblFechaLimite.anchor = GridBagConstraints.WEST;
		gbc_lblFechaLimite.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaLimite.gridx = 9;
		gbc_lblFechaLimite.gridy = 1;
		contentPane.add(lblFechaLimite, gbc_lblFechaLimite);

		txtNombre = new JTextField();
		if(opcion==2) {
			txtNombre.setText(proyecto.getNombre());
		}
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
		if(txtNombre.getText().isEmpty())lblWarningNom.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
		GridBagConstraints gbc_lblWarningNom = new GridBagConstraints();
		gbc_lblWarningNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningNom.anchor = GridBagConstraints.WEST;
		gbc_lblWarningNom.gridx = 2;
		gbc_lblWarningNom.gridy = 2;
		contentPane.add(lblWarningNom, gbc_lblWarningNom);

		txtID = new JTextField();
		if(opcion==2) {
			txtID.setText(proyecto.getId());
		}
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
			if(opcion==2) {
				ftFechaInicio_1.setText(proyecto.getFechaInicio());
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		lblWarningID = new JLabel("");
		if(txtID.getText().isEmpty())lblWarningID.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
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
			if(opcion==2) {
				ftFechaLimite_1.setText(proyecto.getFechaLimite());
			}
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

		lblUsuarioEncargado = new JLabel(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.lblUsuarioEncargado.text")); //$NON-NLS-1$
		lblUsuarioEncargado.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblUsuarioEncargado = new GridBagConstraints();
		gbc_lblUsuarioEncargado.anchor = GridBagConstraints.WEST;
		gbc_lblUsuarioEncargado.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuarioEncargado.gridx = 1;
		gbc_lblUsuarioEncargado.gridy = 4;
		contentPane.add(lblUsuarioEncargado, gbc_lblUsuarioEncargado);

		lblPrioridad = new JLabel(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.lblPrioridad.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
		gbc_lblPrioridad.anchor = GridBagConstraints.WEST;
		gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrioridad.gridx = 6;
		gbc_lblPrioridad.gridy = 4;
		contentPane.add(lblPrioridad, gbc_lblPrioridad);

		lblEstado = new JLabel(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.lblEstado.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.WEST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 9;
		gbc_lblEstado.gridy = 4;
		contentPane.add(lblEstado, gbc_lblEstado);

		txtUsuarioEncargado = new JTextField();
		
		txtUsuarioEncargado.addKeyListener(new TextFieldKeyListener());
		if(opcion==2) {
			txtUsuarioEncargado.setText(proyecto.getJefe());
		}
		GridBagConstraints gbc_txtUsuarioEncargado = new GridBagConstraints();
		gbc_txtUsuarioEncargado.gridwidth = 4;
		gbc_txtUsuarioEncargado.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuarioEncargado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuarioEncargado.gridx = 1;
		gbc_txtUsuarioEncargado.gridy = 5;
		contentPane.add(txtUsuarioEncargado, gbc_txtUsuarioEncargado);
		txtUsuarioEncargado.setColumns(10);

		lblWarningEncarg = new JLabel("");
		if(txtUsuarioEncargado.getText().isEmpty())lblWarningEncarg.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
		GridBagConstraints gbc_lblWarningEncarg = new GridBagConstraints();
		gbc_lblWarningEncarg.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningEncarg.anchor = GridBagConstraints.WEST;
		gbc_lblWarningEncarg.gridx = 5;
		gbc_lblWarningEncarg.gridy = 5;
		contentPane.add(lblWarningEncarg, gbc_lblWarningEncarg);

		cbPrioridad = new JComboBox();
		if(opcion==2) {
			int index =0;
			if(proyecto.getPrioridad().equals("Media")) index=1;
			if(proyecto.getPrioridad().equals("Alta")) index=2;
			cbPrioridad.setSelectedItem(index);
		}
		cbPrioridad.setModel(new DefaultComboBoxModel(new String[] {"Baja", "Media", "Alta"}));
		GridBagConstraints gbc_cbPrioridad = new GridBagConstraints();
		gbc_cbPrioridad.gridwidth = 2;
		gbc_cbPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_cbPrioridad.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbPrioridad.gridx = 6;
		gbc_cbPrioridad.gridy = 5;
		contentPane.add(cbPrioridad, gbc_cbPrioridad);

		cbEstado = new JComboBox();
		if(opcion==2) {
			int index =0;
			if(proyecto.getEstado().equals("En proceso")) index=1;
			if(proyecto.getEstado().equals("Terminado")) index=2;
			cbEstado.setSelectedItem(index);
		}
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"En espera", "En proceso", "Terminado"}));
		GridBagConstraints gbc_cbEstado = new GridBagConstraints();
		gbc_cbEstado.gridwidth = 3;
		gbc_cbEstado.insets = new Insets(0, 0, 5, 5);
		gbc_cbEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbEstado.gridx = 9;
		gbc_cbEstado.gridy = 5;
		contentPane.add(cbEstado, gbc_cbEstado);

		btnAnadirRecursos = new JButton(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.btnAnadirRecursos.text")); //$NON-NLS-1$
		btnAnadirRecursos.addActionListener(new BtnAnadirRecursosActionListener());
		GridBagConstraints gbc_btnAnadirRecursos = new GridBagConstraints();
		gbc_btnAnadirRecursos.anchor = GridBagConstraints.WEST;
		gbc_btnAnadirRecursos.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirRecursos.gridx = 1;
		gbc_btnAnadirRecursos.gridy = 7;
		contentPane.add(btnAnadirRecursos, gbc_btnAnadirRecursos);

		lblCategoria = new JLabel(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.lblCategoria.text")); //$NON-NLS-1$
		if(opcion!=3) {
			lblCategoria.setEnabled(false);
		}
		GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
		gbc_lblCategoria.anchor = GridBagConstraints.WEST;
		gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria.gridx = 6;
		gbc_lblCategoria.gridy = 7;
		contentPane.add(lblCategoria, gbc_lblCategoria);

		txtF_Adjunto = new JTextField();
		GridBagConstraints gbc_txtF_Adjunto = new GridBagConstraints();
		gbc_txtF_Adjunto.gridwidth = 4;
		gbc_txtF_Adjunto.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_Adjunto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_Adjunto.gridx = 1;
		gbc_txtF_Adjunto.gridy = 8;
		contentPane.add(txtF_Adjunto, gbc_txtF_Adjunto);
		txtF_Adjunto.setColumns(10);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Analisis", "Diseño", "Implementacion"}));
		if(opcion!=3) {
			comboBox.setEnabled(false);
		}
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 6;
		gbc_comboBox.gridy = 8;
		contentPane.add(comboBox, gbc_comboBox);

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 11;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 10;
		contentPane.add(scrollPane, gbc_scrollPane);

		txtDescripcion = new JTextArea();
		if(opcion==2) {
			txtDescripcion.setText(proyecto.getDescripcion());
		}
		txtDescripcion.setBorder(new TitledBorder(null, MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.txtDescripcion.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		scrollPane.setViewportView(txtDescripcion);

		btnCancelar = new JButton(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.btnCancelar.text")); //$NON-NLS-1$
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		
		lblcamposObligatorios = new JLabel(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.lblcamposObligatorios.text")); //$NON-NLS-1$
		lblcamposObligatorios.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblcamposObligatorios = new GridBagConstraints();
		gbc_lblcamposObligatorios.insets = new Insets(0, 0, 5, 5);
		gbc_lblcamposObligatorios.gridx = 1;
		gbc_lblcamposObligatorios.gridy = 12;
		contentPane.add(lblcamposObligatorios, gbc_lblcamposObligatorios);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 9;
		gbc_btnCancelar.gridy = 12;
		contentPane.add(btnCancelar, gbc_btnCancelar);

		btnAceptar = new JButton(MessagesCrearEditarProyecto.getString("Crear_EditarProyecto.btnAceptar.text")); //$NON-NLS-1$
		
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
				//txtNombre.setBorder(bordeRojo); 
				lblWarningNom.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
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
				//txtID.setBorder(bordeRojo); 
				lblWarningID.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
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
				lblWarningFI.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
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
				lblWarningFF.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
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
				//txtUsuarioEncargado.setBorder(bordeRojo); 
				lblWarningEncarg.setIcon(new ImageIcon(Crear_EditarUsuario2.class.getResource("/presentacion/warning.png")));
			}
		}
	}





	//--------------------------------------------
	//                 OYENTES 
	//--------------------------------------------


	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(opcion==3) {
				String nombre = txtNombre.getText();
				String id = txtID.getText();
				String usuarioEncargado = txtUsuarioEncargado.getText();
				String adjunto = txtF_Adjunto.getText();
				String fechaInicio = ftFechaInicio_1.getText();
				String fechaLimite = ftFechaLimite_1.getText();
				String estado = cbEstado.getSelectedItem().toString();
				String prioridad = cbPrioridad.getSelectedItem().toString();
				String categoria = comboBox.getSelectedItem().toString();
				String comentario = txtDescripcion.getText();

				if((nombre.length()>0) && id.length()>0 && usuarioEncargado.length()>0) {


					if(adjunto == null)
						adjunto = "";
					if(comentario == null)
						comentario = "";

					Tarea nuevaTarea = new Tarea(nombre, id, usuarioEncargado, adjunto, fechaInicio, fechaLimite, estado, prioridad, categoria, comentario);
					System.out.println("Constructor creado correctamente");
/*
					String nombreArchivo= "src/resources/fichero_escrituraProyecto.txt"; 
					FileWriter fw = null; 
					try { 
						fw = new FileWriter(nombreArchivo); 
						BufferedWriter bw = new BufferedWriter(fw); 
						PrintWriter salArch = new PrintWriter(bw); 

						salArch.print(nombre); 
						salArch.println(); 
						salArch.print(id); 
						salArch.println(); 
						salArch.print(usuarioEncargado);
						salArch.println(); 
						salArch.print(adjunto);
						salArch.println();
						salArch.print(fechaInicio);
						salArch.println();
						salArch.print(fechaLimite);
						salArch.println();
						salArch.print(estado);//prioridad categoria comentario
						salArch.println();
						salArch.print(prioridad);
						salArch.println();
						salArch.print(categoria);
						salArch.println();
						salArch.print(comentario);
						*/
						pnl_Proyectos.pnlTareas.add(new pnlReutilizableTarea(nombre, id, usuarioEncargado, adjunto, fechaInicio,fechaLimite, estado,prioridad, categoria,comentario));
						pnl_Proyectos.pnlTareas.repaint();
						pnl_Proyectos.pnlTareas.revalidate();
						
					//	salArch.close(); 
					/*} 
					catch (IOException ex) { 
					} */
					//frame.setVisible(false);
					//System.out.println("Frame invisible");
					
					frmProyectoa.dispose();
					frmProyectoa.setVisible(false);
					JOptionPane.showMessageDialog(frmProyectoa, "Tarea creada correctamente", "Confirmacion", JOptionPane.PLAIN_MESSAGE);
				}//fin if
			}else if(opcion==2) {
				String nombre = txtNombre.getText();
				String id = txtID.getText();
				String usuarioEncargado = txtUsuarioEncargado.getText();
				if((nombre.length()>0) && id.length()>0 && usuarioEncargado.length()>0) {
					frmProyectoa.dispose();
					frmProyectoa.setVisible(false);
					System.out.println("Editando Proyecto");
				}
				
			}else {
				System.out.println("Creando Proyecto");
				String nombreProyecto = txtNombre.getText();
				String idProyecto = txtID.getText();
				String usuarioEncargadoProyecto = txtUsuarioEncargado.getText();
				if((nombreProyecto.length()>0) && idProyecto.length()>0 && usuarioEncargadoProyecto.length()>0) {
					
				String nombreArchivo= "src/resources/fichero_escrituraProyectos.txt"; 
				FileWriter fw = null; 
				try { 
					fw = new FileWriter(nombreArchivo); 
					BufferedWriter bw = new BufferedWriter(fw); 
					PrintWriter salArch = new PrintWriter(bw); 

					salArch.print(nombreProyecto); 
					salArch.println(); 
					
					salArch.close(); 
					
					nodoProyectos.add(new DefaultMutableTreeNode(nombreProyecto));
					tree.repaint();
					//nodoProyectos.
					
					DefaultTreeModel model = (DefaultTreeModel)tree.getModel();
					model.reload((TreeNode) model.getRoot());
					
					tree.expandPath(new TreePath(nodoProyectos.getPath()));
				} 
				catch (IOException ex) { 
				} 
				
				frmProyectoa.dispose();
				frmProyectoa.setVisible(false);
				JOptionPane.showMessageDialog(frmProyectoa, "Proyecto creado correctamente", "Confirmacion", JOptionPane.PLAIN_MESSAGE);
			}
			}
			//return nuevaTarea;
		}
	}


	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//System.exit(1);
			//frame.setVisible(false);
			//frmProyecto.dispose();
			//frmProyecto.setVisible(false);
			frmProyectoa.dispose();
			frmProyectoa.setVisible(false);
		}
	}
	private class BtnAnadirRecursosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frmProyectoa);

			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File fichero = fcAbrir.getSelectedFile();
				txtF_Adjunto.setText(fichero.getAbsolutePath());
			}
		}
	}

}
