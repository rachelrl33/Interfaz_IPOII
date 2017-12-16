package presentacion;

import java.awt.Rectangle;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class pnl_Proyectos extends JPanel {
	private JPanel pnl_Contenedor;
	private JPanel pnl_InfoTareas;
	private JPanel pnl_InfoProyecto;
	private JLabel lblNombreDelProyecto;
	private JLabel lblIdDelProyecto;
	private JLabel lblDescripcion;
	private JButton btnEliminarPyoyecto;
	private JButton btnAnadirProyecto;
	private JButton btnAnadirTarea;
	private JLabel lblTareas;
	private JLabel lblBuscarPor;
	private JLabel lblEstado;
	private JComboBox comboBox;
	private JLabel lblCategoria;
	private JComboBox comboBox_1;
	private JScrollPane scrollPane;
	private JButton btnEditarRecursos;
	private JScrollPane scrollPane_1;
	private JTextArea txtDescripcion;
	private JLabel lblJefeDeProyecto;
	private JTextField txtJefeProyecto;
	private JLabel lblFechaInicio;
	private JFormattedTextField formattedTextField;
	private JLabel lblFechaLimite;
	private JTextField textField;
	private JLabel lblPrioridad;
	private JTextField txtPrioridad;
	private JLabel lblEstado_1;
	private JTextField txtEstado;
	private JLabel lblUsuariosAsociados;
	private JScrollPane scrollPane_2;
	private JList listUsuariosAsociados;
	private JLabel lbl_Cal;
	private JLabel lbl_Cal2;
	private JPanel pnlTareas;

	/**
	 * Create the panel.
	 */
	public pnl_Proyectos() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(0, 0, 1210, 546));
		setLayout(new BorderLayout(0, 0));
		
		pnl_Contenedor = new JPanel();
		pnl_Contenedor.setBackground(new Color(211, 211, 211));
		add(pnl_Contenedor, BorderLayout.CENTER);
		GridBagLayout gbl_pnl_Contenedor = new GridBagLayout();
		gbl_pnl_Contenedor.columnWidths = new int[]{496, 672, 0};
		gbl_pnl_Contenedor.rowHeights = new int[]{546, 0};
		gbl_pnl_Contenedor.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pnl_Contenedor.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnl_Contenedor.setLayout(gbl_pnl_Contenedor);
		 
		pnl_InfoProyecto = new JPanel();
		pnl_InfoProyecto.setBackground(new Color(211, 211, 211));
		GridBagConstraints gbc_pnl_InfoProyecto = new GridBagConstraints();
		gbc_pnl_InfoProyecto.insets = new Insets(0, 0, 0, 5);
		gbc_pnl_InfoProyecto.fill = GridBagConstraints.BOTH;
		gbc_pnl_InfoProyecto.gridx = 0;
		gbc_pnl_InfoProyecto.gridy = 0;
		pnl_Contenedor.add(pnl_InfoProyecto, gbc_pnl_InfoProyecto);
		GridBagLayout gbl_pnl_InfoProyecto = new GridBagLayout();
		gbl_pnl_InfoProyecto.columnWidths = new int[]{23, 0, 74, 46, 45, 60, 65, 38, 17, 0};
		gbl_pnl_InfoProyecto.rowHeights = new int[]{24, 0, 0, 32, 0, 45, 44, 42, 17, 24, 0, 0, 0, 0, 64, 17, 0};
		gbl_pnl_InfoProyecto.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_InfoProyecto.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_InfoProyecto.setLayout(gbl_pnl_InfoProyecto);
		
		lblNombreDelProyecto = new JLabel("Nombre del proyecto");
		lblNombreDelProyecto.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNombreDelProyecto = new GridBagConstraints();
		gbc_lblNombreDelProyecto.anchor = GridBagConstraints.WEST;
		gbc_lblNombreDelProyecto.gridwidth = 2;
		gbc_lblNombreDelProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDelProyecto.gridx = 1;
		gbc_lblNombreDelProyecto.gridy = 1;
		pnl_InfoProyecto.add(lblNombreDelProyecto, gbc_lblNombreDelProyecto);
		
		btnAnadirProyecto = new JButton("");
		btnAnadirProyecto.addActionListener(new BtnAnadirProyectoActionListener());
		btnAnadirProyecto.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/add.png")));
		GridBagConstraints gbc_btnAnadirProyecto = new GridBagConstraints();
		gbc_btnAnadirProyecto.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnAnadirProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirProyecto.gridx = 5;
		gbc_btnAnadirProyecto.gridy = 1;
		pnl_InfoProyecto.add(btnAnadirProyecto, gbc_btnAnadirProyecto);
		
		JButton btnEditProyecto = new JButton("");
		btnEditProyecto.addActionListener(new BtnEditProyectoActionListener());
		btnEditProyecto.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/edit.png")));
		GridBagConstraints gbc_btnEditProyecto = new GridBagConstraints();
		gbc_btnEditProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditProyecto.gridx = 6;
		gbc_btnEditProyecto.gridy = 1;
		pnl_InfoProyecto.add(btnEditProyecto, gbc_btnEditProyecto);
		
		btnEliminarPyoyecto = new JButton("");
		btnEliminarPyoyecto.addActionListener(new BtnEliminarProyectoActionListener());
		btnEliminarPyoyecto.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/rubbish-bin.png")));
		GridBagConstraints gbc_btnEliminarPyoyecto = new GridBagConstraints();
		gbc_btnEliminarPyoyecto.anchor = GridBagConstraints.WEST;
		gbc_btnEliminarPyoyecto.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarPyoyecto.gridx = 7;
		gbc_btnEliminarPyoyecto.gridy = 1;
		pnl_InfoProyecto.add(btnEliminarPyoyecto, gbc_btnEliminarPyoyecto);
		
		lblIdDelProyecto = new JLabel("id del proyecto");
		lblIdDelProyecto.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblIdDelProyecto = new GridBagConstraints();
		gbc_lblIdDelProyecto.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblIdDelProyecto.gridwidth = 2;
		gbc_lblIdDelProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdDelProyecto.gridx = 1;
		gbc_lblIdDelProyecto.gridy = 2;
		pnl_InfoProyecto.add(lblIdDelProyecto, gbc_lblIdDelProyecto);
		
		btnEditarRecursos = new JButton("Consultar recursos");
		btnEditarRecursos.addActionListener(new BtnEditarRecursosActionListener());
		GridBagConstraints gbc_btnEditarRecursos = new GridBagConstraints();
		gbc_btnEditarRecursos.anchor = GridBagConstraints.EAST;
		gbc_btnEditarRecursos.gridwidth = 3;
		gbc_btnEditarRecursos.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarRecursos.gridx = 5;
		gbc_btnEditarRecursos.gridy = 2;
		pnl_InfoProyecto.add(btnEditarRecursos, gbc_btnEditarRecursos);
		
		lblDescripcion = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 3;
		pnl_InfoProyecto.add(lblDescripcion, gbc_lblDescripcion);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.gridwidth = 7;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 4;
		pnl_InfoProyecto.add(scrollPane_1, gbc_scrollPane_1);
		
		txtDescripcion = new JTextArea();
		scrollPane_1.setViewportView(txtDescripcion);
		
		lblJefeDeProyecto = new JLabel("Jefe de Proyecto:");
		GridBagConstraints gbc_lblJefeDeProyecto = new GridBagConstraints();
		gbc_lblJefeDeProyecto.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblJefeDeProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_lblJefeDeProyecto.gridx = 1;
		gbc_lblJefeDeProyecto.gridy = 6;
		pnl_InfoProyecto.add(lblJefeDeProyecto, gbc_lblJefeDeProyecto);
		
		txtJefeProyecto = new JTextField();
		GridBagConstraints gbc_txtJefeProyecto = new GridBagConstraints();
		gbc_txtJefeProyecto.anchor = GridBagConstraints.SOUTH;
		gbc_txtJefeProyecto.gridwidth = 2;
		gbc_txtJefeProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_txtJefeProyecto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtJefeProyecto.gridx = 2;
		gbc_txtJefeProyecto.gridy = 6;
		pnl_InfoProyecto.add(txtJefeProyecto, gbc_txtJefeProyecto);
		txtJefeProyecto.setColumns(10);
		
		lblFechaInicio = new JLabel("Fecha Inicio:");
		GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
		gbc_lblFechaInicio.anchor = GridBagConstraints.EAST;
		gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaInicio.gridx = 1;
		gbc_lblFechaInicio.gridy = 7;
		pnl_InfoProyecto.add(lblFechaInicio, gbc_lblFechaInicio);
		
		formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 2;
		gbc_formattedTextField.gridy = 7;
		pnl_InfoProyecto.add(formattedTextField, gbc_formattedTextField);
		
		lbl_Cal = new JLabel("");
		lbl_Cal.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/calen.png")));
		GridBagConstraints gbc_lbl_Cal = new GridBagConstraints();
		gbc_lbl_Cal.anchor = GridBagConstraints.WEST;
		gbc_lbl_Cal.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Cal.gridx = 3;
		gbc_lbl_Cal.gridy = 7;
		pnl_InfoProyecto.add(lbl_Cal, gbc_lbl_Cal);
		
		lblFechaLimite = new JLabel("Fecha Limite:");
		GridBagConstraints gbc_lblFechaLimite = new GridBagConstraints();
		gbc_lblFechaLimite.anchor = GridBagConstraints.EAST;
		gbc_lblFechaLimite.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaLimite.gridx = 5;
		gbc_lblFechaLimite.gridy = 7;
		pnl_InfoProyecto.add(lblFechaLimite, gbc_lblFechaLimite);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 6;
		gbc_textField.gridy = 7;
		pnl_InfoProyecto.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lbl_Cal2 = new JLabel("");
		lbl_Cal2.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/calen.png")));
		GridBagConstraints gbc_lbl_Cal2 = new GridBagConstraints();
		gbc_lbl_Cal2.anchor = GridBagConstraints.WEST;
		gbc_lbl_Cal2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Cal2.gridx = 7;
		gbc_lbl_Cal2.gridy = 7;
		pnl_InfoProyecto.add(lbl_Cal2, gbc_lbl_Cal2);
		
		lblPrioridad = new JLabel("Prioridad:");
		lblPrioridad.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
		gbc_lblPrioridad.anchor = GridBagConstraints.EAST;
		gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrioridad.gridx = 1;
		gbc_lblPrioridad.gridy = 8;
		pnl_InfoProyecto.add(lblPrioridad, gbc_lblPrioridad);
		
		txtPrioridad = new JTextField();
		GridBagConstraints gbc_txtPrioridad = new GridBagConstraints();
		gbc_txtPrioridad.gridwidth = 2;
		gbc_txtPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrioridad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrioridad.gridx = 2;
		gbc_txtPrioridad.gridy = 8;
		pnl_InfoProyecto.add(txtPrioridad, gbc_txtPrioridad);
		txtPrioridad.setColumns(10);
		
		lblEstado_1 = new JLabel("Estado:");
		GridBagConstraints gbc_lblEstado_1 = new GridBagConstraints();
		gbc_lblEstado_1.anchor = GridBagConstraints.EAST;
		gbc_lblEstado_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado_1.gridx = 5;
		gbc_lblEstado_1.gridy = 8;
		pnl_InfoProyecto.add(lblEstado_1, gbc_lblEstado_1);
		
		txtEstado = new JTextField();
		GridBagConstraints gbc_txtEstado = new GridBagConstraints();
		gbc_txtEstado.gridwidth = 2;
		gbc_txtEstado.insets = new Insets(0, 0, 5, 5);
		gbc_txtEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEstado.gridx = 6;
		gbc_txtEstado.gridy = 8;
		pnl_InfoProyecto.add(txtEstado, gbc_txtEstado);
		txtEstado.setColumns(10);
		
		lblUsuariosAsociados = new JLabel("Usuarios Asociados:");
		lblUsuariosAsociados.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		GridBagConstraints gbc_lblUsuariosAsociados = new GridBagConstraints();
		gbc_lblUsuariosAsociados.anchor = GridBagConstraints.WEST;
		gbc_lblUsuariosAsociados.gridwidth = 3;
		gbc_lblUsuariosAsociados.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuariosAsociados.gridx = 2;
		gbc_lblUsuariosAsociados.gridy = 10;
		pnl_InfoProyecto.add(lblUsuariosAsociados, gbc_lblUsuariosAsociados);
		
		scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.gridheight = 4;
		gbc_scrollPane_2.gridwidth = 4;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 2;
		gbc_scrollPane_2.gridy = 11;
		pnl_InfoProyecto.add(scrollPane_2, gbc_scrollPane_2);
		
		listUsuariosAsociados = new JList();
		listUsuariosAsociados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_2.setViewportView(listUsuariosAsociados);
		
		listUsuariosAsociados.setCellRenderer(new MiListCellRenderer());
		DefaultListModel modeloLista = new DefaultListModel();
		listUsuariosAsociados.setModel(modeloLista);

		modeloLista.addElement("Raquel Ramos");
		modeloLista.addElement("Jesus Ramos");
		modeloLista.addElement("Juan Lopez");
		modeloLista.addElement("Marta Casas");
		modeloLista.addElement("Miguel Rodriguez");
		
		
		pnl_InfoTareas = new JPanel();
		GridBagConstraints gbc_pnl_InfoTareas = new GridBagConstraints();
		gbc_pnl_InfoTareas.fill = GridBagConstraints.BOTH;
		gbc_pnl_InfoTareas.gridx = 1;
		gbc_pnl_InfoTareas.gridy = 0;
		pnl_Contenedor.add(pnl_InfoTareas, gbc_pnl_InfoTareas);
		GridBagLayout gbl_pnl_InfoTareas = new GridBagLayout();
		gbl_pnl_InfoTareas.columnWidths = new int[]{33, 0, 0, 0, 45, 33, 24, 26, 39, 47, 39, 39, 52, 49, 50, 19, 0, 0};
		gbl_pnl_InfoTareas.rowHeights = new int[]{20, 0, 0, 0, 37, 393, 0};
		gbl_pnl_InfoTareas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_InfoTareas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnl_InfoTareas.setLayout(gbl_pnl_InfoTareas);
		
		lblTareas = new JLabel("TAREAS");
		lblTareas.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblTareas = new GridBagConstraints();
		gbc_lblTareas.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTareas.gridwidth = 3;
		gbc_lblTareas.insets = new Insets(0, 0, 5, 5);
		gbc_lblTareas.gridx = 2;
		gbc_lblTareas.gridy = 1;
		pnl_InfoTareas.add(lblTareas, gbc_lblTareas);
		
		btnAnadirTarea = new JButton("");
		btnAnadirTarea.addActionListener(new BtnAnadirTareaActionListener());
		btnAnadirTarea.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/add.png")));
		GridBagConstraints gbc_btnAnadirTarea = new GridBagConstraints();
		gbc_btnAnadirTarea.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirTarea.gridx = 14;
		gbc_btnAnadirTarea.gridy = 1;
		pnl_InfoTareas.add(btnAnadirTarea, gbc_btnAnadirTarea);
		
		lblBuscarPor = new JLabel("Buscar por:");
		lblBuscarPor.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/search.png")));
		GridBagConstraints gbc_lblBuscarPor = new GridBagConstraints();
		gbc_lblBuscarPor.gridwidth = 2;
		gbc_lblBuscarPor.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarPor.gridx = 2;
		gbc_lblBuscarPor.gridy = 2;
		pnl_InfoTareas.add(lblBuscarPor, gbc_lblBuscarPor);
		
		lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.WEST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 2;
		gbc_lblEstado.gridy = 3;
		pnl_InfoTareas.add(lblEstado, gbc_lblEstado);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"En espera", "En proceso", "Terminada"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 3;
		pnl_InfoTareas.add(comboBox, gbc_comboBox);
		
		lblCategoria = new JLabel("Categoria");
		GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
		gbc_lblCategoria.anchor = GridBagConstraints.EAST;
		gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria.gridx = 7;
		gbc_lblCategoria.gridy = 3;
		pnl_InfoTareas.add(lblCategoria, gbc_lblCategoria);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Analisis", "Diseño", "Implementacion"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 8;
		gbc_comboBox_1.gridy = 3;
		pnl_InfoTareas.add(comboBox_1, gbc_comboBox_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "Listado de tareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridwidth = 15;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		pnl_InfoTareas.add(scrollPane, gbc_scrollPane);
		
		pnlTareas = new JPanel();
		pnlTareas.setForeground(Color.BLACK);
		pnlTareas.setBorder(null);
		scrollPane.setViewportView(pnlTareas);
		pnlTareas.setLayout(new GridLayout(0, 1, 0, 0));
		for(int i=0; i<3; i++)
			pnlTareas.add(new pnlReutilizableTarea());
		
		//prueba
		/*pnlTareas.add(new pnlReutilizableTarea());
		pnlTareas.repaint();
		pnlTareas.revalidate();*/
	}
	
	/*Listeners
	 * 
	 * 
	 * */

	
	//btnAnadir
	private class BtnAnadirProyectoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Crear_EditarProyecto frame = new Crear_EditarProyecto();
			frame.setVisible(true);
			//window = new Crear_EditarProyecto();
			//JFrame frame = new JFrame();
			//window.frame.setVisible(true);
		}
	}
	private class BtnEditProyectoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Crear_EditarProyecto frame = new Crear_EditarProyecto();
			frame.setVisible(true);
		}
	}
	
	
	
	private class BtnEliminarProyectoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			//Dialogo de confirmacion
			int opcion = JOptionPane.showConfirmDialog(pnl_InfoProyecto, "¿Seguro que quieres eliminar este proyecto?", "Eliminar", JOptionPane.OK_CANCEL_OPTION);
			if (opcion == 0) { 
				//Hay que dejar el panel en blanco y eliminar el nodo del arbol
				pnl_InfoProyecto.setVisible(false);
				pnl_InfoTareas.setVisible(false);
			}
		}
	}
	
	
	private class BtnAnadirTareaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Crear_EditarProyecto frame1 = new Crear_EditarProyecto();
			frame1.setVisible(true);
		}
	}
	
	
	private class BtnEditarRecursosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JRecursos frame2 = new JRecursos();
			frame2.setVisible(true);
		}
	}
}
