package presentacion;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
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

public class EditorGrafico extends JFrame {

	private JPanel contentPane;
	private JToolBar toolBar;
	private JButton btnAbrir;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		btnAbrir = new JButton("");
		btnAbrir.setBackground(Color.WHITE);
		btnAbrir.setBorder(null);
		btnAbrir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAbrir.setBorderPainted(false);
		btnAbrir.addActionListener(new BtnAbrirActionListener());
		btnAbrir.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/icons8-view-32.png")));
		toolBar.add(btnAbrir);

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
		btnTexto.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/icons8-text-32.png")));
		btnTexto.setToolTipText("Inserta Texto");
		toolBar.add(btnTexto);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.WEST);

		tree = new JTree();
		tree.setModel(new DefaultTreeModel(
				new DefaultMutableTreeNode("Archivos") {
					{

					}
				}
				));
		scrollPane.setViewportView(tree);

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

		texto = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/icons8-text-32.png"));
		cursorTexto = toolkit.createCustomCursor(texto, new Point(0,0), "CURSOR_TEXTO");
	}

	private class BtnAbrirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			if(valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				miAreaDibujo.setIcon(imagen);
			}
		}
	}
	private class BtnCrearActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			miAreaDibujo.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/Nueva.png")));
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

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
							miAreaDibujo.addObjetoGrafico(new TextoGrafico(x, y+15, txtTexto.getText(),
									Color.WHITE));
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
}
