package presentacion;



import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Cursor;

import java.awt.EventQueue;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Image;

import java.awt.Point;

import java.awt.Toolkit;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JSplitPane;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;



public class EditorGrafico extends JFrame {



	private JPanel contentPane;
	private JToolBar toolBar;
	private JButton btnGuardar;
	private JSeparator separator;
	private JButton btnCrear;
	private JScrollPane scrollPane;
	private JTree tree;
	private JScrollPane scrollPane_1;

	//private JLabel miAreaDibujo;





	private static EditorGrafico frame = new EditorGrafico();
	private MiAreaDibujo miAreaDibujo;
	private ImageIcon imagen;



	int modo = -1;
	private final int CLASE = 1;
	private final int CDU = 2;
	private final int DEPENDENCIA = 3;
	private final int TEXTO = 4;



	private Toolkit toolkit;



	private Image imgClase;
	private Image imgCDU;
	private Image imgDependencia;
	private Image texto;



	private Image imgCursorClase;
	private Image imgCursorCDU;



	private Cursor cursorClase;
	private Cursor cursorCDU;
	private Cursor cursorDependencia;
	private Cursor cursorTexto;
	private JButton btnClase;
	private JButton btnCdu;
	private JButton btnDependencia;
	private JButton btnTexto;

	private int x,y;



	private JTextField txtTexto = new JTextField();

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					//EditorGrafico frame = new EditorGrafico();
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

	public EditorGrafico() {

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);



		toolBar = new JToolBar();
		toolBar.setBackground(Color.WHITE);
		contentPane.add(toolBar, BorderLayout.NORTH);



		btnCrear = new JButton("");
		btnCrear.addActionListener(new BtnCrearActionListener());
		btnCrear.setBackground(Color.WHITE);
		btnCrear.setBorder(null);
		btnCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrear.setBorderPainted(false);
		btnCrear.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/icons8-add-file-32.png")));
		toolBar.add(btnCrear);


		btnGuardar = new JButton("");
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBorder(null);
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setBorderPainted(false);
		btnGuardar.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/icons8-save-32.png")));
		toolBar.add(btnGuardar);


		separator = new JSeparator();
		separator.setMaximumSize(new Dimension(10, 40));
		separator.setOrientation(SwingConstants.VERTICAL);
		toolBar.add(separator);

		btnClase = new JButton("");
		btnClase.addActionListener(new BtnClaseActionListener());
		btnClase.setBackground(Color.WHITE);
		btnClase.setBorder(null);
		btnClase.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClase.setBorderPainted(false);
		btnClase.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/Clases.png")));
		btnClase.setToolTipText("Nueva Clase");
		toolBar.add(btnClase);


		btnCdu = new JButton("");
		btnCdu.addActionListener(new BtnCduActionListener());
		btnCdu.setBackground(Color.WHITE);
		btnCdu.setBorder(null);
		btnCdu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCdu.setBorderPainted(false);
		btnCdu.setToolTipText("Nuevo Caso de Uso");
		btnCdu.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/CDU.png")));
		toolBar.add(btnCdu);



		btnDependencia = new JButton("");
		btnDependencia.addActionListener(new BtnDependenciaActionListener());
		btnDependencia.setBackground(Color.WHITE);
		btnDependencia.setBorder(null);
		btnDependencia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDependencia.setBorderPainted(false);
		btnDependencia.setToolTipText("Nueva Dependencia");
		btnDependencia.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/icons8-right-32.png")));
		toolBar.add(btnDependencia);



		btnTexto = new JButton("");
		btnTexto.addActionListener(new BtnTextoActionListener());
		btnTexto.setBackground(Color.WHITE);
		btnTexto.setBorder(null);
		btnTexto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTexto.setBorderPainted(false);
		btnTexto.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/font3.png")));
		btnTexto.setToolTipText("Inserta Texto");
		toolBar.add(btnTexto);



		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.WEST);



		tree = new JTree();
		tree.addTreeSelectionListener(new TreeTreeSelectionListener());
		tree.setFont(new Font("Verdana", Font.PLAIN, 12));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Archivos") {
				{
					add(new DefaultMutableTreeNode("Archivo 1"));
					add(new DefaultMutableTreeNode("Archivo 2"));
					add(new DefaultMutableTreeNode("Archivo 3"));
				}
			}
		));

		scrollPane.setViewportView(tree);
		tree.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.setCellRenderer(new MiRenderizadoArbol());



		scrollPane_1 = new JScrollPane();

		contentPane.add(scrollPane_1, BorderLayout.CENTER);



		miAreaDibujo = new MiAreaDibujo();

		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());

		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());

		miAreaDibujo.setHorizontalTextPosition(SwingConstants.CENTER);

		miAreaDibujo.setHorizontalAlignment(SwingConstants.CENTER);

		miAreaDibujo.setIcon(null);

		scrollPane_1.setViewportView(miAreaDibujo);



		toolkit = Toolkit.getDefaultToolkit();



		imgClase = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/Clases.png"));

		cursorClase = toolkit.createCustomCursor(imgClase, new Point(0,0), "CURSOR_CLASE");



		imgCDU = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/CDU.png"));

		cursorCDU = toolkit.createCustomCursor(imgCDU, new Point(0,0), "CURSOR_CDU");



		imgDependencia = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/icons8-right-32.png"));

		cursorDependencia = toolkit.createCustomCursor(imgDependencia, new Point(0,0), "CURSOR_DEPENDENCIA");



		texto = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/font3.png"));

		cursorTexto = toolkit.createCustomCursor(texto, new Point(0,0), "CURSOR_TEXTO");

	}

	private class BtnCrearActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			miAreaDibujo.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/Nueva.png")));
		}

	}

	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			miAreaDibujo.setIcon(null);
			JOptionPane.showMessageDialog(frame, "Archivo guardado correctamente", "Confirmacion", JOptionPane.PLAIN_MESSAGE);
		}
	}

	private class BtnClaseActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = CLASE;
			frame.setCursor(cursorClase);
		}
	}

	private class BtnCduActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = CDU;
			frame.setCursor(cursorCDU);
		}
	}
	
	
	private class BtnDependenciaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = DEPENDENCIA;
			frame.setCursor(cursorDependencia);
		}
	}

	
	private class BtnTextoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
			frame.setCursor(cursorTexto);
		}
	}



	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent arg0) {
			x = arg0.getX();
			y = arg0.getY();
			//if (imagen != null)
			//{
			switch (modo)
			{
			case CLASE:
				miAreaDibujo.addObjetoGrafico(new ClaseGrafica(x,y,x,y,new Color(102,255,255)));//66ffff
				//System.out.println("Pulsado modo Clase");
				break;
			case CDU:
				miAreaDibujo.addObjetoGrafico(new CDUGrafico(x,y,x,y, new Color(102,255,255)));
				//System.out.println("CDU");
				break;
			case DEPENDENCIA:
				miAreaDibujo.addObjetoGrafico(new DependenciaGrafica(x,y,x,y, Color.BLACK));
				//System.out.println("dependencia");
				break;
			case TEXTO:
				txtTexto.setBounds(x, y, 200,30);
				txtTexto.setVisible(true);
				txtTexto.requestFocus();
				txtTexto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg) {
						if(!txtTexto.getText().equals(""))
							miAreaDibujo.addObjetoGrafico(new TextoGrafico(x, y+15, txtTexto.getText(), Color.WHITE));
						txtTexto.setText("");
						txtTexto.setVisible(false);
						miAreaDibujo.repaint();
					}
				});
				miAreaDibujo.add(txtTexto);
			}
			//}
		}
	}

	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent arg0) {
			if(modo == CLASE) {
				((ClaseGrafica)miAreaDibujo.getUltimoObjetoGrafico()).setX1(arg0.getX());
				((ClaseGrafica)miAreaDibujo.getUltimoObjetoGrafico()).setY1(arg0.getY());
				miAreaDibujo.repaint();
			}else if(modo == CDU){
				//System.out.println("Pintando CDU");
				((CDUGrafico)miAreaDibujo.getUltimoObjetoGrafico()).setX1(arg0.getX());
				((CDUGrafico)miAreaDibujo.getUltimoObjetoGrafico()).setY1(arg0.getY());
				miAreaDibujo.repaint();
			}else if(modo == DEPENDENCIA) {
				((DependenciaGrafica)miAreaDibujo.getUltimoObjetoGrafico()).setX1(arg0.getX());
				((DependenciaGrafica)miAreaDibujo.getUltimoObjetoGrafico()).setY1(arg0.getY());
				miAreaDibujo.repaint();

			}

		}

	}
	private class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent arg0) {
			//System.out.println("Nodo seleccionado "+ arg0.getPath().getLastPathComponent());
			String nodo = (arg0.getPath().getLastPathComponent()).toString();
			switch (nodo){
				case "Archivo 1":
					miAreaDibujo.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/com01.gif")));
					break;
				case "Archivo 2":
					miAreaDibujo.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/IC378068.jpg.png")));
					break;
				case "Archivo 3":
					miAreaDibujo.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/modelo-logico-inicial2.png")));
					break;
					
			}
		}
	}
}

