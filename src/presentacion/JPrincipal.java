package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Toolkit;

public class JPrincipal {

	JFrame frame;
	private JPanel panel_piePag;
	private JPanel pnl_encabezado;
	private JSplitPane splitPane;
	private JPanel pnl_contenedorCard;
	private JScrollPane scrollPane;
	private JTree tree;
	private JLabel lbl_logo;
	private JLabel lbl_usuario;
	private JLabel lblUltimaConexion;
	private JButton btnCerrarSesion;
	private JLabel lbl_avatar;
	private JButton btn_ayuda;
	private JLabel lblNombreDelNodo;
	private JPanel pnlBienvenida;
	private JLabel lblNewLabel;
	private JPanel pnl_Proyectos;
	private JLabel label;
	private JPanel pnl_Usuarios;
	private JLabel label_1;
	private JPanel pnl_Calendar;
	private JPanel pnl_piePag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal window = new JPrincipal();
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
	public JPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JPrincipal.class.getResource("/presentacion/logo.png")));
		frame.setResizable(false);
		frame.setBounds(new Rectangle(0, 0, 1360, 740));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {22, 2};
		gridBagLayout.rowHeights = new int[]{123, 533, -88, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		
		//PNAEL ENCABEZADO CON LOGO
	
		pnl_encabezado = new JPanel();
		pnl_encabezado.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_pnl_encabezado = new GridBagConstraints();
		gbc_pnl_encabezado.anchor = GridBagConstraints.SOUTH;
		gbc_pnl_encabezado.insets = new Insets(0, 0, 5, 0);
		gbc_pnl_encabezado.fill = GridBagConstraints.HORIZONTAL;
		gbc_pnl_encabezado.gridx = 0;
		gbc_pnl_encabezado.gridy = 0;
		frame.getContentPane().add(pnl_encabezado, gbc_pnl_encabezado);
		GridBagLayout gbl_pnl_encabezado = new GridBagLayout();
		gbl_pnl_encabezado.columnWidths = new int[] {23, 0, 49, 951, 81, 31, 71, 1};
		gbl_pnl_encabezado.rowHeights = new int[] {18, 23, 0, 26, 3};
		gbl_pnl_encabezado.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_encabezado.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_encabezado.setLayout(gbl_pnl_encabezado);
		
		lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon(JPrincipal.class.getResource("/presentacion/logo.png")));
		GridBagConstraints gbc_lbl_logo = new GridBagConstraints();
		gbc_lbl_logo.insets = new Insets(0, 0, 0, 5);
		gbc_lbl_logo.gridheight = 4;
		gbc_lbl_logo.gridx = 1;
		gbc_lbl_logo.gridy = 0;
		pnl_encabezado.add(lbl_logo, gbc_lbl_logo);
		
		lbl_usuario = new JLabel("Usuario");
		GridBagConstraints gbc_lbl_usuario = new GridBagConstraints();
		gbc_lbl_usuario.gridwidth = 2;
		gbc_lbl_usuario.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lbl_usuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_usuario.gridx = 4;
		gbc_lbl_usuario.gridy = 1;
		pnl_encabezado.add(lbl_usuario, gbc_lbl_usuario);
		
		lblUltimaConexion = new JLabel("Ultima conexion");
		GridBagConstraints gbc_lblUltimaConexion = new GridBagConstraints();
		gbc_lblUltimaConexion.gridwidth = 2;
		gbc_lblUltimaConexion.anchor = GridBagConstraints.EAST;
		gbc_lblUltimaConexion.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimaConexion.gridx = 4;
		gbc_lblUltimaConexion.gridy = 2;
		pnl_encabezado.add(lblUltimaConexion, gbc_lblUltimaConexion);
		
		lbl_avatar = new JLabel("");
		lbl_avatar.setIcon(new ImageIcon(JPrincipal.class.getResource("/presentacion/ag1.png")));
		GridBagConstraints gbc_lbl_avatar = new GridBagConstraints();
		gbc_lbl_avatar.gridheight = 3;
		gbc_lbl_avatar.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_avatar.gridx = 6;
		gbc_lbl_avatar.gridy = 0;
		pnl_encabezado.add(lbl_avatar, gbc_lbl_avatar);
		
		lblNombreDelNodo = new JLabel("  Nombre del Nodo");
		lblNombreDelNodo.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNombreDelNodo = new GridBagConstraints();
		gbc_lblNombreDelNodo.anchor = GridBagConstraints.WEST;
		gbc_lblNombreDelNodo.insets = new Insets(0, 0, 0, 5);
		gbc_lblNombreDelNodo.gridx = 3;
		gbc_lblNombreDelNodo.gridy = 3;
		pnl_encabezado.add(lblNombreDelNodo, gbc_lblNombreDelNodo);
		
		btnCerrarSesion = new JButton("Cerrar sesion");
		GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
		gbc_btnCerrarSesion.anchor = GridBagConstraints.EAST;
		gbc_btnCerrarSesion.gridwidth = 2;
		gbc_btnCerrarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrarSesion.gridx = 4;
		gbc_btnCerrarSesion.gridy = 3;
		pnl_encabezado.add(btnCerrarSesion, gbc_btnCerrarSesion);
		
		btn_ayuda = new JButton("Ayuda");
		btn_ayuda.setIcon(null);
		GridBagConstraints gbc_btn_ayuda = new GridBagConstraints();
		gbc_btn_ayuda.anchor = GridBagConstraints.WEST;
		gbc_btn_ayuda.gridx = 6;
		gbc_btn_ayuda.gridy = 3;
		pnl_encabezado.add(btn_ayuda, gbc_btn_ayuda);
		
		
		
		//PANEL PARTIDO CONTENIDO DEL ARBOL Y DE LAS PANTALLAS
		
		splitPane = new JSplitPane();
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 1;
		frame.getContentPane().add(splitPane, gbc_splitPane);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(150, 150));
		splitPane.setLeftComponent(scrollPane);
		
		tree = new JTree();
		tree.addTreeSelectionListener(new TreeTreeSelectionListener());

		tree.setFont(new Font("Verdana", Font.PLAIN, 12));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Mi zona de trabajo") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Calendario");
						node_1.add(new DefaultMutableTreeNode("Deadlines"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Proyectos");
						node_1.add(new DefaultMutableTreeNode("p1"));
					add(node_1);
					add(new DefaultMutableTreeNode("Usuarios"));
				}
			}
		));
		
		
		scrollPane.setViewportView(tree);
		tree.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.setCellRenderer(new MiRenderizadoArbol());
		
		
		
		
		pnl_contenedorCard = new JPanel();
		splitPane.setRightComponent(pnl_contenedorCard);
		pnl_contenedorCard.setLayout(new CardLayout(0, 0));
		
		pnlBienvenida = new JPanel();
		pnl_contenedorCard.add(pnlBienvenida, "name_531829446263122");
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JPrincipal.class.getResource("/presentacion/fondo2_edited.jpg")));
		pnlBienvenida.add(lblNewLabel);
		
		pnl_piePag = new JPanel();
		pnl_piePag.setBackground(SystemColor.activeCaption);

		GridBagConstraints gbc_pnl_piePag = new GridBagConstraints();
		gbc_pnl_piePag.fill = GridBagConstraints.BOTH;
		gbc_pnl_piePag.gridx = 0;
		gbc_pnl_piePag.gridy = 2;
		frame.getContentPane().add(pnl_piePag, gbc_pnl_piePag);
		
		pnlBienvenida = new JPanel();
		pnl_contenedorCard.add(pnlBienvenida, "name_531829446263122");
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JPrincipal.class.getResource("/presentacion/fondo2_edited.jpg")));
		pnlBienvenida.add(lblNewLabel);
		
		
		pnl_Proyectos = new pnl_Proyectos();
		pnl_contenedorCard.add(pnl_Proyectos, "Proyectos");

		pnl_Usuarios = new pnl_Usuarios();
		pnl_contenedorCard.add(pnl_Usuarios, "Usuarios");
		/*
		pnl_Calendario = new pnl_Calendario(u);
		pnl_contenedorCard.add(pnl_MisPlaylists, "Calendario");
		*/
		
		
			
	}

	
	//OYENTE SELECCION DEL ARBOL
	private class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent e) {
			System.out.println("Nodo seleccionado "+ e.getPath().getLastPathComponent());

			String nodo = (e.getPath().getLastPathComponent()).toString();
			switch (nodo){
			case "Calendario": 
			case "Proyectos": 
			case "Usuarios": 
				((CardLayout) pnl_contenedorCard.getLayout()).show(pnl_contenedorCard, nodo);
			
			
			
		}
	}
	
	
	
}
}
