package presentacion;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.Icon;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Position;

import dominio.Usuario;

import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.UIManager;

public class pnl_Usuarios extends JPanel {
	private JPanel pnl_ListaUsuarios;
	private JPanel pnl_InfoUsuarios;
	private JLabel lbl_Buscar;
	private JTextField txtF_Buscar;
	private JButton btnAnadirUsuario;
	private JScrollPane scrollPane;
	private static JList lst_Usuarios;
	private static JLabel lbl_NombreDeUsuario;
	private static JLabel lbl_Avatar;
	private static JLabel lbl_Email;
	private static JLabel lbl_Telefono;
	private static JTextArea textArea;
	private JButton btnEliminarUsuario;
	private JButton btnEditarUsuario;
	private JButton btnEnviarMensaje;
	private JLabel lbl_JefeDe;
	private JScrollPane scrollPane_jefe;
	private JTable tbl_Jefe;
	private JLabel lbl_TrabajandoEn;
	private JScrollPane scrollPane_Trabajando;
	private JTable tbl_Trabajando;
	
	ImageIcon iconoDef;
	ImageIcon iconoUser1;
	ImageIcon iconoUser2;
	ImageIcon iconoUser3;
	ImageIcon iconoUser4;
	ImageIcon iconoUser5;
	ImageIcon iconoUser6;
	ImageIcon iconoUser7;
	ImageIcon iconoUser8;
	ImageIcon iconoUser9;
	ImageIcon iconoUser10;
	ImageIcon iconoUser11;
	ImageIcon iconoUser12;
	
	private static CustomListModel modeloLista;
	private Usuario user1;
	private static Usuario createdUser;
	/**
	 * Create the panel.
	 */
	public pnl_Usuarios(Usuario user) {
		user1=user;
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
		
		lbl_Buscar = new JLabel("Buscar");
		lbl_Buscar.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/search.png")));
		GridBagConstraints gbc_lbl_Buscar = new GridBagConstraints();
		gbc_lbl_Buscar.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Buscar.anchor = GridBagConstraints.WEST;
		gbc_lbl_Buscar.gridx = 1;
		gbc_lbl_Buscar.gridy = 1;
		pnl_ListaUsuarios.add(lbl_Buscar, gbc_lbl_Buscar);
		
		txtF_Buscar = new JTextField();
		GridBagConstraints gbc_txtF_Buscar = new GridBagConstraints();
		gbc_txtF_Buscar.gridwidth = 2;
		gbc_txtF_Buscar.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_Buscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_Buscar.gridx = 2;
		gbc_txtF_Buscar.gridy = 1;
		pnl_ListaUsuarios.add(txtF_Buscar, gbc_txtF_Buscar);
		txtF_Buscar.setColumns(10);
		
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
		
		//LISTADO DE USUARIOS
		lst_Usuarios = new JList();
		lst_Usuarios.addListSelectionListener(new Lst_UsuariosListSelectionListener());
		lst_Usuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		scrollPane.setViewportView(lst_Usuarios);

		iconoDef=new ImageIcon(pnl_Usuarios.class.getResource("user4.png"));
		iconoUser1 = new ImageIcon(pnl_Usuarios.class.getResource("ag1.png"));
		iconoUser2 = new ImageIcon(pnl_Usuarios.class.getResource("ag2.png"));
		iconoUser3 = new ImageIcon(pnl_Usuarios.class.getResource("ag3.png"));
		iconoUser4 = new ImageIcon(pnl_Usuarios.class.getResource("ag4.png"));
		iconoUser5 = new ImageIcon(pnl_Usuarios.class.getResource("ag5.png"));
		iconoUser6 = new ImageIcon(pnl_Usuarios.class.getResource("ag6.png"));
		iconoUser7 = new ImageIcon(pnl_Usuarios.class.getResource("ag7.png"));
		iconoUser8 = new ImageIcon(pnl_Usuarios.class.getResource("ag8.png"));
		iconoUser9 = new ImageIcon(pnl_Usuarios.class.getResource("ag9.png"));
		iconoUser10 = new ImageIcon(pnl_Usuarios.class.getResource("ag10.png"));
		iconoUser11 = new ImageIcon(pnl_Usuarios.class.getResource("ag11.png"));
		iconoUser12 = new ImageIcon(pnl_Usuarios.class.getResource("ag12.png"));
		
		modeloLista = new CustomListModel();
		lst_Usuarios.setModel(modeloLista);

		DefaultListCellRenderer renderer = new MiListCellRenderer();
		lst_Usuarios.setCellRenderer(renderer);

		Usuario u1 = new Usuario(iconoUser7, "Raquel Ramos", "648-616-243", "raquel@uclm.es", "estrtgh", "Grado en Ingeniería Informatica", "17/12/2017");
		Usuario u2 = new Usuario(iconoUser1, "Jesus Ramos", "645-481-296", "jesus@uclm.es", "trcfi", "Grado en Ingeniería Informatica", "20/11/2017");
		Usuario u3 = new Usuario(iconoUser9, "Juan Lopez", "698-756-321", "juanl@uclm.es", "rtgh", "Grado en Diseño gráfico", "30/11/2017");
		Usuario u4 = new Usuario(iconoUser6, "Marta Casas", "689-745-123", "marta.casas@uclm.es", "martitaC", "Grado en Gestión y dirección de empresaas", "15/11/2017");
		Usuario u5 = new Usuario(iconoUser3, "Miguel Rodriguez", "648-625-319", "miguel.r@uclm.es", "migRZ", "Grado en Ingeniería Informática", "15/12/2017");
		Usuario u6 = new Usuario(iconoUser11, "Pepe Ramirez", "648-725-919", "pepito@uclm.es", "migRZ", "Grado en Ingeniería de Sistemas", "15/12/2017");
		Usuario u7 = new Usuario(iconoUser12, "Carla Pereira", "648-525-964", "car.Pe@uclm.es", "migiutpZ", "Grado en RRHH", "15/12/2017");
		Usuario u8 = new Usuario(iconoUser5, "Angela Velasco", "647-525-454", "angelaV@uclm.es", "bwtrje", "Grado en Marketing", "15/12/2017");
		Usuario u9 = new Usuario(iconoUser4, "Teodoro Palacios", "647-521-639", "teo@uclm.es", "btyhjje", "Grado en Telecomunicaciones", "15/12/2017");
		
		modeloLista.addPersona(u1);
		modeloLista.addPersona(u2);
		modeloLista.addPersona(u3);
		modeloLista.addPersona(u4);
		modeloLista.addPersona(u5);
		modeloLista.addPersona(u6);
		modeloLista.addPersona(u7);
		modeloLista.addPersona(u8);
		modeloLista.addPersona(u9);
		

		pnl_InfoUsuarios = new JPanel();
		pnl_InfoUsuarios.setVisible(false);
		GridBagConstraints gbc_pnl_InfoUsuarios = new GridBagConstraints();
		gbc_pnl_InfoUsuarios.fill = GridBagConstraints.BOTH;
		gbc_pnl_InfoUsuarios.gridx = 1;
		gbc_pnl_InfoUsuarios.gridy = 0;
		add(pnl_InfoUsuarios, gbc_pnl_InfoUsuarios);
		GridBagLayout gbl_pnl_InfoUsuarios = new GridBagLayout();
		gbl_pnl_InfoUsuarios.columnWidths = new int[]{53, 56, 41, 118, 0, 0, 125, 99, 97, 32, 46, 41, 53, 36, 0};
		gbl_pnl_InfoUsuarios.rowHeights = new int[]{24, 0, 0, 0, 30, 0, 52, 59, 40, 0, 183, 35, 0};
		gbl_pnl_InfoUsuarios.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_InfoUsuarios.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnl_InfoUsuarios.setLayout(gbl_pnl_InfoUsuarios);
		
		lbl_Avatar = new JLabel("");
		lbl_Avatar.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/user4.png")));
		GridBagConstraints gbc_lbl_Avatar = new GridBagConstraints();
		gbc_lbl_Avatar.gridwidth = 2;
		gbc_lbl_Avatar.gridheight = 3;
		gbc_lbl_Avatar.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Avatar.gridx = 1;
		gbc_lbl_Avatar.gridy = 1;
		pnl_InfoUsuarios.add(lbl_Avatar, gbc_lbl_Avatar);
		
		lbl_NombreDeUsuario = new JLabel("Usuario");
		lbl_NombreDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lbl_NombreDeUsuario = new GridBagConstraints();
		gbc_lbl_NombreDeUsuario.anchor = GridBagConstraints.WEST;
		gbc_lbl_NombreDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_NombreDeUsuario.gridx = 3;
		gbc_lbl_NombreDeUsuario.gridy = 1;
		pnl_InfoUsuarios.add(lbl_NombreDeUsuario, gbc_lbl_NombreDeUsuario);
		
		btnEnviarMensaje = new JButton("");
		btnEnviarMensaje.addActionListener(new BtnEnviarMensajeActionListener());
		btnEnviarMensaje.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/email0.png")));
		GridBagConstraints gbc_btnEnviarMensaje = new GridBagConstraints();
		gbc_btnEnviarMensaje.anchor = GridBagConstraints.SOUTH;
		gbc_btnEnviarMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviarMensaje.gridx = 10;
		gbc_btnEnviarMensaje.gridy = 1;
		pnl_InfoUsuarios.add(btnEnviarMensaje, gbc_btnEnviarMensaje);
		
		btnEditarUsuario = new JButton("");
		btnEditarUsuario.addActionListener(new BtnEditarUsuarioActionListener());
		btnEditarUsuario.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/edit.png")));
		GridBagConstraints gbc_btnEditarUsuario = new GridBagConstraints();
		gbc_btnEditarUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarUsuario.gridx = 11;
		gbc_btnEditarUsuario.gridy = 1;
		pnl_InfoUsuarios.add(btnEditarUsuario, gbc_btnEditarUsuario);
		
		btnEliminarUsuario = new JButton("");
		btnEliminarUsuario.addActionListener(new BtnEliminarUsuarioActionListener());
		btnEliminarUsuario.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/rubbish-bin.png")));
		GridBagConstraints gbc_btnEliminarUsuario = new GridBagConstraints();
		gbc_btnEliminarUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarUsuario.gridx = 12;
		gbc_btnEliminarUsuario.gridy = 1;
		pnl_InfoUsuarios.add(btnEliminarUsuario, gbc_btnEliminarUsuario);
		
		lbl_Email = new JLabel("email");
		lbl_Email.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lbl_Email = new GridBagConstraints();
		gbc_lbl_Email.anchor = GridBagConstraints.WEST;
		gbc_lbl_Email.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Email.gridx = 3;
		gbc_lbl_Email.gridy = 2;
		pnl_InfoUsuarios.add(lbl_Email, gbc_lbl_Email);
		
		lbl_Telefono = new JLabel("telefono");
		lbl_Telefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lbl_Telefono = new GridBagConstraints();
		gbc_lbl_Telefono.anchor = GridBagConstraints.WEST;
		gbc_lbl_Telefono.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Telefono.gridx = 3;
		gbc_lbl_Telefono.gridy = 3;
		pnl_InfoUsuarios.add(lbl_Telefono, gbc_lbl_Telefono);
		
		textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Conocimientos y habilidades", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 3;
		gbc_textArea.gridwidth = 12;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 5;
		pnl_InfoUsuarios.add(textArea, gbc_textArea);
		
		lbl_JefeDe = new JLabel("Jefe de:");
		GridBagConstraints gbc_lbl_JefeDe = new GridBagConstraints();
		gbc_lbl_JefeDe.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JefeDe.gridx = 1;
		gbc_lbl_JefeDe.gridy = 9;
		pnl_InfoUsuarios.add(lbl_JefeDe, gbc_lbl_JefeDe);
		
		lbl_TrabajandoEn = new JLabel("Trabajando en:");
		GridBagConstraints gbc_lbl_TrabajandoEn = new GridBagConstraints();
		gbc_lbl_TrabajandoEn.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_TrabajandoEn.gridx = 7;
		gbc_lbl_TrabajandoEn.gridy = 9;
		pnl_InfoUsuarios.add(lbl_TrabajandoEn, gbc_lbl_TrabajandoEn);
		
		scrollPane_jefe = new JScrollPane();
		scrollPane_jefe.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_jefe = new GridBagConstraints();
		gbc_scrollPane_jefe.gridwidth = 5;
		gbc_scrollPane_jefe.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_jefe.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_jefe.gridx = 1;
		gbc_scrollPane_jefe.gridy = 10;
		pnl_InfoUsuarios.add(scrollPane_jefe, gbc_scrollPane_jefe);
		
		tbl_Jefe = new JTable();
		tbl_Jefe.setModel(new DefaultTableModel(
			new Object[][] {
				{"P05_452"},
				{"P02_451"},
				{"P01_125"},
			},
			new String[] {
				"Proyecto"
			}
		));
		scrollPane_jefe.setViewportView(tbl_Jefe);
		
		scrollPane_Trabajando = new JScrollPane();
		scrollPane_Trabajando.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_Trabajando = new GridBagConstraints();
		gbc_scrollPane_Trabajando.gridwidth = 6;
		gbc_scrollPane_Trabajando.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_Trabajando.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_Trabajando.gridx = 7;
		gbc_scrollPane_Trabajando.gridy = 10;
		pnl_InfoUsuarios.add(scrollPane_Trabajando, gbc_scrollPane_Trabajando);
		
		tbl_Trabajando = new JTable();
		tbl_Trabajando.setModel(new DefaultTableModel(
			new Object[][] {
				{"P05_452", "Analisis de requisitos", "Terminada"},
				{"P05_452", "Clases de uso", "En epera"},
				{"P03_102", "Imprementaci\u00F3n REQ.5", "En progreso"},
				{"P03_103", "Creaci\u00F3n de la base de datos", "Terminada"},
				{"P01_105", "Pruebas de conexion", "En espera"},
			},
			new String[] {
				"Proyecto", "Tarea", "Estado"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbl_Trabajando.getColumnModel().getColumn(1).setPreferredWidth(155);
		scrollPane_Trabajando.setViewportView(tbl_Trabajando);
	
		


	}

	
	
	public static Usuario leerArchivo() {
		String nombreArchivo= "src/resources/fichero_escritura.txt"; 
		ArrayList<String> usuario = new ArrayList<>();
		FileReader fr = null; 
		Usuario newUsuario = null;
		int c=4;
		try {
			fr = new FileReader(nombreArchivo); 
			String linea;

			BufferedReader br = new BufferedReader(fr);
			while((linea=br.readLine())!=null) {
					usuario.add(linea);
			}	
			
			newUsuario = new Usuario(null,"" , null,"" , null,"" , null);
			newUsuario.setNombre(usuario.get(0));
			newUsuario.setTelefono(usuario.get(1));
			newUsuario.setEmail(usuario.get(2));
			newUsuario.setConocimientos(usuario.get(3));
			
			br.close();
			fr.close();
			
		}//FIN DEL TRY 
		catch(IOException e){ 
			System.out.println(e);
		}
		return newUsuario;

	}
	
	
	
	public static void limpiarArchivo() {
		String nombreArchivo= "src/resources/fichero_escritura.txt"; 
		FileWriter fw = null; 
		try { 
			fw = new FileWriter(nombreArchivo); 
			BufferedWriter bw = new BufferedWriter(fw); 
			PrintWriter salArch = new PrintWriter(bw); 

			salArch.print(""); 
			salArch.println(); 
			salArch.print(""); 
			salArch.println(); 
			salArch.print("");
			salArch.println(); 
			salArch.print("");
			salArch.close(); 
		} 
		catch (IOException ex) { 
		} 
	}
	
	
	public static void crearUsuario() {
		createdUser=leerArchivo();
		if(createdUser.getNombre().length()>1) {
			modeloLista.addPersona(createdUser);
			createdUser=null;
			limpiarArchivo();
		}
	}
	
	
	public static void editarUsuario() {
		createdUser=leerArchivo();
		lbl_NombreDeUsuario.setText(createdUser.getNombre());
		lbl_Email.setText(createdUser.getEmail());
		lbl_Telefono.setText(createdUser.getTelefono());
		textArea.setText(createdUser.getConocimientos());
	}
	
	/*public static void upDateList(Usuario u) {
		modeloLista.modificarPersona(u, lst_Usuarios.getSelectedIndex());
	}*/
	
	
	
	//--------------------------------------------
	//                 OYENTES 
	//--------------------------------------------
	
	
	//AÑADIR USUARIO
	private class BtnAnadirUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Crear_EditarUsuario2 window;
			try {
				Usuario userVacio = new Usuario(iconoDef,"","","","","","");
				window = new Crear_EditarUsuario2(userVacio, true);
				JFrame frmUsuario = new JFrame();
				window.frmUsuario.setVisible(true);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			



		}
	}

	//ELIMINAR USUARIO
	private class BtnEliminarUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			//Dialogo de confirmacion
			int opcion = JOptionPane.showConfirmDialog(pnl_InfoUsuarios, "¿Seguro que quieres eliminar este usuario?", "Eliminar", JOptionPane.OK_CANCEL_OPTION);
			if (opcion == 0) { 
				pnl_InfoUsuarios.setVisible(false);
				//Eliminar el nodo de la lista
				int index = lst_Usuarios.getSelectedIndex();
				modeloLista.eliminarPersona(index);
				
				
				lbl_NombreDeUsuario.setText("Nombre de usuario");
				lbl_Avatar.setIcon(null);
				lbl_Email.setText("email");
				lbl_Telefono.setText("telefono");
				textArea.setText("");
				btnEliminarUsuario.setEnabled(false);
				btnEditarUsuario.setEnabled(false);
				btnEnviarMensaje.setEnabled(false);
				scrollPane_jefe.setEnabled(false);
				tbl_Jefe.setEnabled(false);
				scrollPane_Trabajando.setEnabled(false);
				tbl_Trabajando.setEnabled(false);
				
				
				
				
				
				
			}
			
			
		}
	}
	
	
	//EDITAR USUARIO
	private class BtnEditarUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Crear_EditarUsuario2 window;

				int selection = lst_Usuarios.getSelectedIndex();
				if (selection!=-1) {
					Usuario u= modeloLista.getPersona(selection);
					try {
						window = new Crear_EditarUsuario2(u, false);
						JFrame frmUsuario = new JFrame();
						window.frmUsuario.setVisible(true);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}


				}
		}

	}
	
	
	
	//ENVIAR MENSAJE
	private class BtnEnviarMensajeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JEnviar_Mensaje window = new JEnviar_Mensaje();
			JFrame frmMensaje = new JFrame();
			window.frmMensaje.setVisible(true);
		}
	}
	
	
	
	//SELECCIONDE USUARIOS EN LA LISTA
	private class Lst_UsuariosListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {

			
			int selection = lst_Usuarios.getSelectedIndex();
			if (selection!=-1) {
				Usuario u= modeloLista.getPersona(selection);
				if(u.getAvatar()!=null) {
					lbl_Avatar.setIcon(u.getAvatar());
				}else {
					lbl_Avatar.setIcon(new ImageIcon(pnl_Usuarios.class.getResource("/presentacion/user4.png")));
				}
					
				lbl_NombreDeUsuario.setText(u.getNombre());
				lbl_Email.setText(u.getEmail());
				lbl_Telefono.setText(u.getTelefono());
				textArea.setText(u.getConocimientos());
			}

			pnl_InfoUsuarios.setVisible(true);
			btnEliminarUsuario.setEnabled(true);
			btnEditarUsuario.setEnabled(true);
			btnEnviarMensaje.setEnabled(true);
			scrollPane_jefe.setEnabled(true);
			tbl_Jefe.setEnabled(true);
			scrollPane_Trabajando.setEnabled(true);
			tbl_Trabajando.setEnabled(true);
		}
	}
	

	
	
	
}
