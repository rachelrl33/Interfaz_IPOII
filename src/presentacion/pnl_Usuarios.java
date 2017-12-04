package presentacion;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.UIManager;

public class pnl_Usuarios extends JPanel {
	private JPanel pnl_ListaUsuarios;
	private JPanel pnl_InfoUsuarios;
	private JLabel lblBuscar;
	private JTextField textField;
	private JButton btnAnadirUsuario;
	private JScrollPane scrollPane;
	private JList lst_Usuarios;
	private JLabel lblNombreDeUsuario;
	private JLabel lblAvatar;
	private JLabel lblEmail;
	private JLabel lblTelefono;
	private JTextArea textArea;
	private JButton btnEliminarUsuario;
	private JButton btnEditarUsuario;
	private JButton btnEnviarMensaje;
	private JLabel lblJefeDe;
	private JScrollPane scrollPane_jefe;
	private JTable tbl_Jefe;
	private JLabel lblTrabajandoEn;
	private JScrollPane scrollPane_Trabajando;
	private JTable tbl_Trabajando;

	/**
	 * Create the panel.
	 */
	public pnl_Usuarios() {
		setForeground(SystemColor.menu);
		setBounds(new Rectangle(0, 0, 1210, 546));
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{380, 910, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		pnl_ListaUsuarios = new JPanel();
		pnl_ListaUsuarios.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnl_ListaUsuarios = new GridBagConstraints();
		gbc_pnl_ListaUsuarios.insets = new Insets(0, 0, 0, 5);
		gbc_pnl_ListaUsuarios.fill = GridBagConstraints.BOTH;
		gbc_pnl_ListaUsuarios.gridx = 0;
		gbc_pnl_ListaUsuarios.gridy = 0;
		add(pnl_ListaUsuarios, gbc_pnl_ListaUsuarios);
		GridBagLayout gbl_pnl_ListaUsuarios = new GridBagLayout();
		gbl_pnl_ListaUsuarios.columnWidths = new int[]{29, 50, 64, 0, 36, 27, 37, 0};
		gbl_pnl_ListaUsuarios.rowHeights = new int[]{35, 0, 0, 438, 0};
		gbl_pnl_ListaUsuarios.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_ListaUsuarios.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_ListaUsuarios.setLayout(gbl_pnl_ListaUsuarios);
		
		lblBuscar = new JLabel("Buscar");
		lblBuscar.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/search.png")));
		GridBagConstraints gbc_lblBuscar = new GridBagConstraints();
		gbc_lblBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscar.anchor = GridBagConstraints.WEST;
		gbc_lblBuscar.gridx = 1;
		gbc_lblBuscar.gridy = 1;
		pnl_ListaUsuarios.add(lblBuscar, gbc_lblBuscar);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		pnl_ListaUsuarios.add(textField, gbc_textField);
		textField.setColumns(10);
		
		btnAnadirUsuario = new JButton("");
		btnAnadirUsuario.addActionListener(new BtnAnadirUsuarioActionListener());
		btnAnadirUsuario.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/add.png")));
		GridBagConstraints gbc_btnAnadirUsuario = new GridBagConstraints();
		gbc_btnAnadirUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirUsuario.gridx = 5;
		gbc_btnAnadirUsuario.gridy = 2;
		pnl_ListaUsuarios.add(btnAnadirUsuario, gbc_btnAnadirUsuario);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		pnl_ListaUsuarios.add(scrollPane, gbc_scrollPane);
		
		
		lst_Usuarios = new JList();
		lst_Usuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lst_Usuarios.addListSelectionListener(new Lst_UsuariosListSelectionListener());
		lst_Usuarios.setCellRenderer(new MiListCellRenderer());
		scrollPane.setViewportView(lst_Usuarios);
		
		DefaultListModel modeloLista = new DefaultListModel();
		lst_Usuarios.setModel(modeloLista);

		modeloLista.addElement("Raquel Ramos");
		modeloLista.addElement("Jesús Ramos");
		modeloLista.addElement("Juan López");
		modeloLista.addElement("Marta Casas");
		
		
		
		
		pnl_InfoUsuarios = new JPanel();
		GridBagConstraints gbc_pnl_InfoUsuarios = new GridBagConstraints();
		gbc_pnl_InfoUsuarios.fill = GridBagConstraints.BOTH;
		gbc_pnl_InfoUsuarios.gridx = 1;
		gbc_pnl_InfoUsuarios.gridy = 0;
		add(pnl_InfoUsuarios, gbc_pnl_InfoUsuarios);
		GridBagLayout gbl_pnl_InfoUsuarios = new GridBagLayout();
		gbl_pnl_InfoUsuarios.columnWidths = new int[]{53, 56, 41, 0, 125, 99, 97, 32, 46, 41, 0, 0, 0};
		gbl_pnl_InfoUsuarios.rowHeights = new int[]{24, 0, 0, 0, 30, 0, 52, 59, 40, 0, 183, 35, 0};
		gbl_pnl_InfoUsuarios.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_InfoUsuarios.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnl_InfoUsuarios.setLayout(gbl_pnl_InfoUsuarios);
		
		lblAvatar = new JLabel("");
		lblAvatar.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/ag1.png")));
		GridBagConstraints gbc_lblAvatar = new GridBagConstraints();
		gbc_lblAvatar.gridwidth = 2;
		gbc_lblAvatar.gridheight = 3;
		gbc_lblAvatar.insets = new Insets(0, 0, 5, 5);
		gbc_lblAvatar.gridx = 1;
		gbc_lblAvatar.gridy = 1;
		pnl_InfoUsuarios.add(lblAvatar, gbc_lblAvatar);
		
		lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNombreDeUsuario = new GridBagConstraints();
		gbc_lblNombreDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDeUsuario.gridx = 3;
		gbc_lblNombreDeUsuario.gridy = 1;
		pnl_InfoUsuarios.add(lblNombreDeUsuario, gbc_lblNombreDeUsuario);
		
		btnEnviarMensaje = new JButton("");
		btnEnviarMensaje.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/email.png")));
		GridBagConstraints gbc_btnEnviarMensaje = new GridBagConstraints();
		gbc_btnEnviarMensaje.anchor = GridBagConstraints.SOUTH;
		gbc_btnEnviarMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviarMensaje.gridx = 8;
		gbc_btnEnviarMensaje.gridy = 1;
		pnl_InfoUsuarios.add(btnEnviarMensaje, gbc_btnEnviarMensaje);
		
		btnEditarUsuario = new JButton("");
		btnEditarUsuario.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/edit2.png")));
		GridBagConstraints gbc_btnEditarUsuario = new GridBagConstraints();
		gbc_btnEditarUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarUsuario.gridx = 9;
		gbc_btnEditarUsuario.gridy = 1;
		pnl_InfoUsuarios.add(btnEditarUsuario, gbc_btnEditarUsuario);
		
		btnEliminarUsuario = new JButton("");
		btnEliminarUsuario.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/rubbish-bin2.png")));
		GridBagConstraints gbc_btnEliminarUsuario = new GridBagConstraints();
		gbc_btnEliminarUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarUsuario.gridx = 10;
		gbc_btnEliminarUsuario.gridy = 1;
		pnl_InfoUsuarios.add(btnEliminarUsuario, gbc_btnEliminarUsuario);
		
		lblEmail = new JLabel("email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 3;
		gbc_lblEmail.gridy = 2;
		pnl_InfoUsuarios.add(lblEmail, gbc_lblEmail);
		
		lblTelefono = new JLabel("telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 3;
		gbc_lblTelefono.gridy = 3;
		pnl_InfoUsuarios.add(lblTelefono, gbc_lblTelefono);
		
		textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Conocimientos y habilidades", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 3;
		gbc_textArea.gridwidth = 10;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 5;
		pnl_InfoUsuarios.add(textArea, gbc_textArea);
		
		lblJefeDe = new JLabel("Jefe de:");
		GridBagConstraints gbc_lblJefeDe = new GridBagConstraints();
		gbc_lblJefeDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblJefeDe.gridx = 1;
		gbc_lblJefeDe.gridy = 9;
		pnl_InfoUsuarios.add(lblJefeDe, gbc_lblJefeDe);
		
		lblTrabajandoEn = new JLabel("Trabajando en:");
		GridBagConstraints gbc_lblTrabajandoEn = new GridBagConstraints();
		gbc_lblTrabajandoEn.insets = new Insets(0, 0, 5, 5);
		gbc_lblTrabajandoEn.gridx = 5;
		gbc_lblTrabajandoEn.gridy = 9;
		pnl_InfoUsuarios.add(lblTrabajandoEn, gbc_lblTrabajandoEn);
		
		scrollPane_jefe = new JScrollPane();
		scrollPane_jefe.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_jefe = new GridBagConstraints();
		gbc_scrollPane_jefe.gridwidth = 3;
		gbc_scrollPane_jefe.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_jefe.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_jefe.gridx = 1;
		gbc_scrollPane_jefe.gridy = 10;
		pnl_InfoUsuarios.add(scrollPane_jefe, gbc_scrollPane_jefe);
		
		tbl_Jefe = new JTable();
		tbl_Jefe.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Projecto"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbl_Jefe.getColumnModel().getColumn(0).setMinWidth(39);
		scrollPane_jefe.setViewportView(tbl_Jefe);
		
		scrollPane_Trabajando = new JScrollPane();
		scrollPane_Trabajando.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_Trabajando = new GridBagConstraints();
		gbc_scrollPane_Trabajando.gridwidth = 6;
		gbc_scrollPane_Trabajando.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_Trabajando.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_Trabajando.gridx = 5;
		gbc_scrollPane_Trabajando.gridy = 10;
		pnl_InfoUsuarios.add(scrollPane_Trabajando, gbc_scrollPane_Trabajando);
		
		tbl_Trabajando = new JTable();
		tbl_Trabajando.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Projecto", "Tarea", "Estado"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbl_Trabajando.getColumnModel().getColumn(0).setPreferredWidth(98);
		tbl_Trabajando.getColumnModel().getColumn(1).setPreferredWidth(103);
		scrollPane_Trabajando.setViewportView(tbl_Trabajando);
	
		


	}
	private class BtnAnadirUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			DefaultListModel modeloLista= (DefaultListModel) lst_Usuarios.getModel();
			int indice = modeloLista.getSize();
			modeloLista.addElement("Idioma " + (indice+1));
			lst_Usuarios.setSelectedIndex(indice);
			lst_Usuarios.ensureIndexIsVisible(indice);

		}
	}
	private class Lst_UsuariosListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			
			
			
			
		}
	}
}
