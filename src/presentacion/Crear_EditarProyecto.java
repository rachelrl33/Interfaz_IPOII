package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.DefaultComboBoxModel;

public class Crear_EditarProyecto extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblId;
	private JTextField txtNombre;
	private JTextField txtID;
	private JLabel lblUsuarioEncargado;
	private JTextField textField;
	private JLabel lblFechaInicio;
	private JFormattedTextField ftFechaInicio;
	private JLabel lblFechaLimite;
	private JFormattedTextField ftFechaLimite;
	private JLabel lblPrioridad;
	private JComboBox cbPrioridad;
	private JLabel lblEstado;
	private JComboBox cbEstado;
	private JButton btnAnadirRecursos;
	private JTextField textField_1;
	private JScrollPane scrollPane;
	private JTextArea txtDescripcion;
	private JButton btnCancelar;
	private JButton btnAceptar;

	private DateFormat formatoFecha = new SimpleDateFormat("dd--MMMM--yyyy");
	private JLabel lblCal;
	private JLabel lblCal2;
	//private static final DateFormat df = new SimpleDateFormat("dd/mm/aaaa");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crear_EditarProyecto frame = new Crear_EditarProyecto();
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Crear_EditarProyecto.class.getResource("/presentacion/folder.png")));
		setBounds(100, 100, 796, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{42, 0, 39, 50, 47, 64, 86, 69, 51, 79, 69, 48, 0};
		gbl_contentPane.rowHeights = new int[]{38, 0, 0, 0, 0, 0, 23, 0, 0, 29, 90, 26, 29, 9, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 2;
		contentPane.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		txtID = new JTextField();
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.gridwidth = 2;
		gbc_txtID.insets = new Insets(0, 0, 5, 5);
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.gridx = 3;
		gbc_txtID.gridy = 2;
		contentPane.add(txtID, gbc_txtID);
		txtID.setColumns(10);
		
		ftFechaInicio = new JFormattedTextField();
		GridBagConstraints gbc_ftFechaInicio = new GridBagConstraints();
		gbc_ftFechaInicio.insets = new Insets(0, 0, 5, 5);
		gbc_ftFechaInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftFechaInicio.gridx = 6;
		gbc_ftFechaInicio.gridy = 2;
		
		MaskFormatter formatoFecha;
		try {
		formatoFecha = new MaskFormatter("##/##/####'");
		formatoFecha.setPlaceholderCharacter('X');
		ftFechaInicio = new JFormattedTextField(formatoFecha);
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		contentPane.add(ftFechaInicio, gbc_ftFechaInicio);
		
		ftFechaLimite = new JFormattedTextField();
		GridBagConstraints gbc_ftFechaLimite = new GridBagConstraints();
		gbc_ftFechaLimite.insets = new Insets(0, 0, 5, 5);
		gbc_ftFechaLimite.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftFechaLimite.gridx = 9;
		gbc_ftFechaLimite.gridy = 2;
		
		//MaskFormatter formatoFecha;
		try {
		formatoFecha = new MaskFormatter("##/##/####'");
		formatoFecha.setPlaceholderCharacter('X');
		ftFechaLimite = new JFormattedTextField(formatoFecha);
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
		
		contentPane.add(ftFechaLimite, gbc_ftFechaLimite);
		
		lblCal2 = new JLabel("");
		lblCal2.setIcon(new ImageIcon(Crear_EditarProyecto.class.getResource("/presentacion/calen.png")));
		GridBagConstraints gbc_lblCal2 = new GridBagConstraints();
		gbc_lblCal2.anchor = GridBagConstraints.WEST;
		gbc_lblCal2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCal2.gridx = 10;
		gbc_lblCal2.gridy = 2;
		contentPane.add(lblCal2, gbc_lblCal2);
		
		lblUsuarioEncargado = new JLabel("Usuario Encargado");
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
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 5;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
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
		gbc_cbEstado.gridwidth = 2;
		gbc_cbEstado.insets = new Insets(0, 0, 5, 5);
		gbc_cbEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbEstado.gridx = 9;
		gbc_cbEstado.gridy = 5;
		contentPane.add(cbEstado, gbc_cbEstado);
		
		btnAnadirRecursos = new JButton("Anadir Recursos");
		GridBagConstraints gbc_btnAnadirRecursos = new GridBagConstraints();
		gbc_btnAnadirRecursos.anchor = GridBagConstraints.WEST;
		gbc_btnAnadirRecursos.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirRecursos.gridx = 1;
		gbc_btnAnadirRecursos.gridy = 7;
		contentPane.add(btnAnadirRecursos, gbc_btnAnadirRecursos);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 8;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 10;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 10;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setBorder(new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(txtDescripcion);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 9;
		gbc_btnCancelar.gridy = 12;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 10;
		gbc_btnAceptar.gridy = 12;
		contentPane.add(btnAceptar, gbc_btnAceptar);
	}

}
