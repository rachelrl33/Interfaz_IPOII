package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class pnlReutilizableTarea extends JPanel {
	private JLabel lblNombreTarea;
	private JLabel lblCategora;
	private JScrollPane scrollPane;
	private JTextArea txtDescripcion;
	private JButton btnEditarRecursos;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JButton btn_Adjuntar;
	private JButton button;

	/**
	 * Create the panel.
	 * @param string10 
	 * @param string9 
	 * @param string8 
	 * @param string7 
	 * @param string6 
	 * @param string5 
	 * @param string4 
	 * @param string3 
	 * @param string2 
	 * @param string 
	 */
	
	//String nombre, String id, String usuarioEncargado, String adjunto, String fechaInicio,
	//String fechaLimite, String estado, String prioridad, String categoria, String comentario)
	
	public pnlReutilizableTarea(String nombre, String id, String usuarioEncargado, String adjunto, String fechaInicio, String fechaLimite, String estado,String prioridad, String categoria, String comentario) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 202, 0, 45, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 47, 18, 60, 0, 0, 41, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNombreTarea = new JLabel("Nombre tarea");
		lblNombreTarea.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		GridBagConstraints gbc_lblNombreTarea = new GridBagConstraints();
		gbc_lblNombreTarea.anchor = GridBagConstraints.WEST;
		gbc_lblNombreTarea.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreTarea.gridx = 1;
		gbc_lblNombreTarea.gridy = 1;
		add(lblNombreTarea, gbc_lblNombreTarea);
		
		btn_Adjuntar = new JButton("");
		btn_Adjuntar.addActionListener(new Btn_AdjuntarActionListener());
		btn_Adjuntar.setIcon(new ImageIcon(pnlReutilizableTarea.class.getResource("/presentacion/clip.png")));
		GridBagConstraints gbc_btn_Adjuntar = new GridBagConstraints();
		gbc_btn_Adjuntar.anchor = GridBagConstraints.SOUTH;
		gbc_btn_Adjuntar.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Adjuntar.gridx = 3;
		gbc_btn_Adjuntar.gridy = 1;
		add(btn_Adjuntar, gbc_btn_Adjuntar);
		
		button = new JButton("");
		button.addActionListener(new ButtonActionListener());
		button.setIcon(new ImageIcon(pnlReutilizableTarea.class.getResource("/presentacion/rubbish-bin.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 4;
		gbc_button.gridy = 1;
		add(button, gbc_button);
		
		lblCategora = new JLabel("Categoria");
		GridBagConstraints gbc_lblCategora = new GridBagConstraints();
		gbc_lblCategora.anchor = GridBagConstraints.WEST;
		gbc_lblCategora.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategora.gridx = 1;
		gbc_lblCategora.gridy = 2;
		add(lblCategora, gbc_lblCategora);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setMinimumSize(new Dimension(2, 2));
		scrollPane_1.setMaximumSize(new Dimension(2, 2));
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 4;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 3;
		add(scrollPane_1, gbc_scrollPane_1);
		
		table = new JTable();
		table.setPreferredScrollableViewportSize(new Dimension(23, 2));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{id, usuarioEncargado, fechaInicio, fechaLimite, estado, prioridad},
			},
			new String[] {
				"ID_Tarea", "Usuario encargado", "Fecha Inicio", "Fecha Fin", "Estado", "Prioridad"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		scrollPane_1.setViewportView(table);
		
		TableColumn columnaEstado = table.getColumnModel().getColumn(4);
		JComboBox comboBox = new JComboBox();
		columnaEstado.setCellEditor(new DefaultCellEditor(comboBox));
		comboBox.addItem("En espera");
		comboBox.addItem("En progreso");
		comboBox.addItem("Terminada");

		
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setBorder(new TitledBorder(null, "Descripcion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(txtDescripcion);
		
		btnEditarRecursos = new JButton("Editar Recursos");
		btnEditarRecursos.addActionListener(new BtnEditarRecursosActionListener());
		GridBagConstraints gbc_btnEditarRecursos = new GridBagConstraints();
		gbc_btnEditarRecursos.anchor = GridBagConstraints.WEST;
		gbc_btnEditarRecursos.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarRecursos.gridx = 1;
		gbc_btnEditarRecursos.gridy = 7;
		add(btnEditarRecursos, gbc_btnEditarRecursos);

		
		lblNombreTarea.setText(nombre);
		lblCategora.setText(categoria);
		txtDescripcion.setText(comentario);
	}

	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Dialogo de confirmacion
			int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar esta tarea?", "Eliminar", JOptionPane.OK_CANCEL_OPTION);
			if (opcion == 0) { 
				removeAll();
				//pnlReutilizableTarea.dispose();
				
			}
		}
	}
	private class Btn_AdjuntarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
					JFileChooser fcAbrir = new JFileChooser();
					int valorDevuelto = fcAbrir.showOpenDialog(null);

					//Recoger el nombre del fichero seleccionado por el usuario
					if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
						File fichero = fcAbrir.getSelectedFile();
					}
				}
			}
	private class BtnEditarRecursosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFrame editor = new EditorGrafico();
			editor.setVisible(true);
		}
	}


}
