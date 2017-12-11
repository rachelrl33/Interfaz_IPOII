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
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class pnl_Proyectos extends JPanel {
	private JDesktopPane desktopPane;
	private JPanel pnl_InfoTareas;
	private JPanel pnl_InfoProyecto;
	private JLabel lblNombreDelProyecto;
	private JLabel lblIdDelProyecto;
	private JLabel lblDescripcion;
	private JButton btnEliminarPyoyecto;
	private JButton btnAnadirProyecto;
	private JButton btnEliminarTarea;
	private JButton btnEditTarea;
	private JButton btnAnadirTarea;
	private JLabel lblTareas;
	private JLabel lblBuscarPor;
	private JLabel lblEstado;
	private JComboBox comboBox;
	private JLabel lblCategoria;
	private JComboBox comboBox_1;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public pnl_Proyectos() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(0, 0, 1210, 546));
		setLayout(new BorderLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		add(desktopPane, BorderLayout.CENTER);
		GridBagLayout gbl_desktopPane = new GridBagLayout();
		gbl_desktopPane.columnWidths = new int[]{582, 0, 0};
		gbl_desktopPane.rowHeights = new int[]{545, 0};
		gbl_desktopPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_desktopPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		desktopPane.setLayout(gbl_desktopPane);
		 
		pnl_InfoProyecto = new JPanel();
		pnl_InfoProyecto.setBackground(new Color(211, 211, 211));
		GridBagConstraints gbc_pnl_InfoProyecto = new GridBagConstraints();
		gbc_pnl_InfoProyecto.insets = new Insets(0, 0, 0, 5);
		gbc_pnl_InfoProyecto.fill = GridBagConstraints.BOTH;
		gbc_pnl_InfoProyecto.gridx = 0;
		gbc_pnl_InfoProyecto.gridy = 0;
		desktopPane.add(pnl_InfoProyecto, gbc_pnl_InfoProyecto);
		GridBagLayout gbl_pnl_InfoProyecto = new GridBagLayout();
		gbl_pnl_InfoProyecto.columnWidths = new int[]{21, 0, 0, 0, 0, 82, 63, 0, 73, 0, 0};
		gbl_pnl_InfoProyecto.rowHeights = new int[]{19, 0, 0, 0, 0, 0};
		gbl_pnl_InfoProyecto.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_InfoProyecto.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_InfoProyecto.setLayout(gbl_pnl_InfoProyecto);
		
		lblNombreDelProyecto = new JLabel("Nombre del proyecto");
		lblNombreDelProyecto.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNombreDelProyecto = new GridBagConstraints();
		gbc_lblNombreDelProyecto.gridwidth = 2;
		gbc_lblNombreDelProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDelProyecto.gridx = 1;
		gbc_lblNombreDelProyecto.gridy = 1;
		pnl_InfoProyecto.add(lblNombreDelProyecto, gbc_lblNombreDelProyecto);
		
		btnAnadirProyecto = new JButton("");
		btnAnadirProyecto.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/add2.png")));
		GridBagConstraints gbc_btnAnadirProyecto = new GridBagConstraints();
		gbc_btnAnadirProyecto.anchor = GridBagConstraints.SOUTH;
		gbc_btnAnadirProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirProyecto.gridx = 6;
		gbc_btnAnadirProyecto.gridy = 1;
		pnl_InfoProyecto.add(btnAnadirProyecto, gbc_btnAnadirProyecto);
		
		JButton btnEditProyecto = new JButton("");
		btnEditProyecto.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/edit2.png")));
		GridBagConstraints gbc_btnEditProyecto = new GridBagConstraints();
		gbc_btnEditProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditProyecto.gridx = 7;
		gbc_btnEditProyecto.gridy = 1;
		pnl_InfoProyecto.add(btnEditProyecto, gbc_btnEditProyecto);
		
		btnEliminarPyoyecto = new JButton("");
		btnEliminarPyoyecto.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/rubbish-bin2.png")));
		GridBagConstraints gbc_btnEliminarPyoyecto = new GridBagConstraints();
		gbc_btnEliminarPyoyecto.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarPyoyecto.gridx = 8;
		gbc_btnEliminarPyoyecto.gridy = 1;
		pnl_InfoProyecto.add(btnEliminarPyoyecto, gbc_btnEliminarPyoyecto);
		
		lblIdDelProyecto = new JLabel("id del proyecto");
		lblIdDelProyecto.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblIdDelProyecto = new GridBagConstraints();
		gbc_lblIdDelProyecto.anchor = GridBagConstraints.WEST;
		gbc_lblIdDelProyecto.gridwidth = 2;
		gbc_lblIdDelProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdDelProyecto.gridx = 1;
		gbc_lblIdDelProyecto.gridy = 2;
		pnl_InfoProyecto.add(lblIdDelProyecto, gbc_lblIdDelProyecto);
		
		lblDescripcion = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.insets = new Insets(0, 0, 0, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 4;
		pnl_InfoProyecto.add(lblDescripcion, gbc_lblDescripcion);
		
		pnl_InfoTareas = new JPanel();
		GridBagConstraints gbc_pnl_InfoTareas = new GridBagConstraints();
		gbc_pnl_InfoTareas.fill = GridBagConstraints.BOTH;
		gbc_pnl_InfoTareas.gridx = 1;
		gbc_pnl_InfoTareas.gridy = 0;
		desktopPane.add(pnl_InfoTareas, gbc_pnl_InfoTareas);
		GridBagLayout gbl_pnl_InfoTareas = new GridBagLayout();
		gbl_pnl_InfoTareas.columnWidths = new int[]{18, 0, 0, 0, 0, 0, 42, 0, 0, 17, 38, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnl_InfoTareas.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0};
		gbl_pnl_InfoTareas.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_InfoTareas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnl_InfoTareas.setLayout(gbl_pnl_InfoTareas);
		
		lblTareas = new JLabel("TAREAS");
		lblTareas.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblTareas = new GridBagConstraints();
		gbc_lblTareas.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTareas.gridwidth = 3;
		gbc_lblTareas.insets = new Insets(0, 0, 5, 5);
		gbc_lblTareas.gridx = 1;
		gbc_lblTareas.gridy = 1;
		pnl_InfoTareas.add(lblTareas, gbc_lblTareas);
		
		btnAnadirTarea = new JButton("");
		btnAnadirTarea.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/add2.png")));
		GridBagConstraints gbc_btnAnadirTarea = new GridBagConstraints();
		gbc_btnAnadirTarea.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirTarea.gridx = 13;
		gbc_btnAnadirTarea.gridy = 1;
		pnl_InfoTareas.add(btnAnadirTarea, gbc_btnAnadirTarea);
		
		btnEditTarea = new JButton("");
		btnEditTarea.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/edit2.png")));
		GridBagConstraints gbc_btnEditTarea = new GridBagConstraints();
		gbc_btnEditTarea.anchor = GridBagConstraints.SOUTH;
		gbc_btnEditTarea.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditTarea.gridx = 14;
		gbc_btnEditTarea.gridy = 1;
		pnl_InfoTareas.add(btnEditTarea, gbc_btnEditTarea);
		
		btnEliminarTarea = new JButton("");
		btnEliminarTarea.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/rubbish-bin2.png")));
		GridBagConstraints gbc_btnEliminarTarea = new GridBagConstraints();
		gbc_btnEliminarTarea.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarTarea.gridx = 15;
		gbc_btnEliminarTarea.gridy = 1;
		pnl_InfoTareas.add(btnEliminarTarea, gbc_btnEliminarTarea);
		
		lblBuscarPor = new JLabel("Buscar por:");
		lblBuscarPor.setIcon(new ImageIcon(pnl_Proyectos.class.getResource("/presentacion/search.png")));
		GridBagConstraints gbc_lblBuscarPor = new GridBagConstraints();
		gbc_lblBuscarPor.gridwidth = 2;
		gbc_lblBuscarPor.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarPor.gridx = 1;
		gbc_lblBuscarPor.gridy = 2;
		pnl_InfoTareas.add(lblBuscarPor, gbc_lblBuscarPor);
		
		lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.WEST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 1;
		gbc_lblEstado.gridy = 3;
		pnl_InfoTareas.add(lblEstado, gbc_lblEstado);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
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
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 4;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 8;
		gbc_comboBox_1.gridy = 3;
		pnl_InfoTareas.add(comboBox_1, gbc_comboBox_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 17;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 5;
		pnl_InfoTareas.add(scrollPane, gbc_scrollPane);
	}

}
