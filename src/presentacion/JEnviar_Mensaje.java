package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.*;


import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JEnviar_Mensaje {

	JFrame frame;
	private JLabel lblEnviarMensaje;
	private JLabel lblAsunto;
	private JLabel lblAdjuntar;
	private JTextField txtF_Asunto;
	private static boolean b_asunto;
	private JScrollPane scrollPane;
	private JTextArea txtA_Mensaje;
	private JButton btnAdjuntarArchivos;
	private JButton btnEnviar;
	private JTextField txtF_Adjunto;
	private JLabel lblAdjuntarArchivo;
	private JLabel lblDestinatario;
	private JTextField txtF_Dest;
	private Border defaultB;
	private static boolean b_dest;
	private JButton btnCancelar;
	private JLabel lbl_WarningDest;
	private JLabel lbl_WarningAsunt;
	private JLabel lbl_ErrorDest;
	
	
	private String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JEnviar_Mensaje window = new JEnviar_Mensaje();
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
	public JEnviar_Mensaje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JEnviar_Mensaje.class.getResource("/presentacion/email.png")));
		frame.setBounds(100, 100, 644, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{43, 72, 0, 24, 73, 84, 36, 0, 66, 71, 34, 0};
		gridBagLayout.rowHeights = new int[]{23, 45, 0, 37, 42, 195, 19, 34, 32, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblEnviarMensaje = new JLabel("   Enviar Mensaje");
		lblEnviarMensaje.setIcon(new ImageIcon(JEnviar_Mensaje.class.getResource("/presentacion/email.png")));
		lblEnviarMensaje.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblEnviarMensaje = new GridBagConstraints();
		gbc_lblEnviarMensaje.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblEnviarMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnviarMensaje.gridwidth = 4;
		gbc_lblEnviarMensaje.gridx = 1;
		gbc_lblEnviarMensaje.gridy = 1;
		frame.getContentPane().add(lblEnviarMensaje, gbc_lblEnviarMensaje);
		
		lblDestinatario = new JLabel("Destinatario");
		GridBagConstraints gbc_lblDestinatario = new GridBagConstraints();
		gbc_lblDestinatario.anchor = GridBagConstraints.WEST;
		gbc_lblDestinatario.insets = new Insets(0, 0, 5, 5);
		gbc_lblDestinatario.gridx = 1;
		gbc_lblDestinatario.gridy = 2;
		frame.getContentPane().add(lblDestinatario, gbc_lblDestinatario);
		
		txtF_Dest = new JTextField();
		txtF_Dest.addKeyListener(new TxtF_destActionListener());
		GridBagConstraints gbc_txtF_Dest = new GridBagConstraints();
		gbc_txtF_Dest.gridwidth = 4;
		gbc_txtF_Dest.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_Dest.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_Dest.gridx = 2;
		gbc_txtF_Dest.gridy = 2;
		frame.getContentPane().add(txtF_Dest, gbc_txtF_Dest);
		txtF_Dest.setColumns(10);
		
		lbl_WarningDest = new JLabel("");
		GridBagConstraints gbc_lbl_WarningDest = new GridBagConstraints();
		gbc_lbl_WarningDest.anchor = GridBagConstraints.WEST;
		gbc_lbl_WarningDest.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningDest.gridx = 6;
		gbc_lbl_WarningDest.gridy = 2;
		frame.getContentPane().add(lbl_WarningDest, gbc_lbl_WarningDest);
		
		lbl_ErrorDest = new JLabel("");
		lbl_ErrorDest.setForeground(Color.RED);
		GridBagConstraints gbc_lbl_ErrorDest = new GridBagConstraints();
		gbc_lbl_ErrorDest.anchor = GridBagConstraints.WEST;
		gbc_lbl_ErrorDest.gridwidth = 3;
		gbc_lbl_ErrorDest.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_ErrorDest.gridx = 7;
		gbc_lbl_ErrorDest.gridy = 2;
		frame.getContentPane().add(lbl_ErrorDest, gbc_lbl_ErrorDest);
		
		lblAsunto = new JLabel("Asunto");
		GridBagConstraints gbc_lblAsunto = new GridBagConstraints();
		gbc_lblAsunto.anchor = GridBagConstraints.WEST;
		gbc_lblAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsunto.gridx = 1;
		gbc_lblAsunto.gridy = 3;
		frame.getContentPane().add(lblAsunto, gbc_lblAsunto);
		
		txtF_Asunto = new JTextField();
		
		defaultB=txtF_Asunto.getBorder();
		txtF_Dest.addKeyListener(new TxtF_asuntoActionListener());
		GridBagConstraints gbc_txtF_Asunto = new GridBagConstraints();
		gbc_txtF_Asunto.gridwidth = 4;
		gbc_txtF_Asunto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_Asunto.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_Asunto.gridx = 2;
		gbc_txtF_Asunto.gridy = 3;
		frame.getContentPane().add(txtF_Asunto, gbc_txtF_Asunto);
		txtF_Asunto.setColumns(10);
		
		lbl_WarningAsunt = new JLabel("");
		GridBagConstraints gbc_lbl_WarningAsunt = new GridBagConstraints();
		gbc_lbl_WarningAsunt.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_WarningAsunt.gridx = 6;
		gbc_lbl_WarningAsunt.gridy = 3;
		frame.getContentPane().add(lbl_WarningAsunt, gbc_lbl_WarningAsunt);
		
		lblAdjuntar = new JLabel("Mensaje");
		GridBagConstraints gbc_lblAdjuntar = new GridBagConstraints();
		gbc_lblAdjuntar.anchor = GridBagConstraints.WEST;
		gbc_lblAdjuntar.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdjuntar.gridx = 1;
		gbc_lblAdjuntar.gridy = 4;
		frame.getContentPane().add(lblAdjuntar, gbc_lblAdjuntar);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 9;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);
		
		txtA_Mensaje = new JTextArea();
		scrollPane.setViewportView(txtA_Mensaje);
		
		lblAdjuntarArchivo = new JLabel("Adjuntar archivo");
		GridBagConstraints gbc_lblAdjuntarArchivo = new GridBagConstraints();
		gbc_lblAdjuntarArchivo.gridwidth = 2;
		gbc_lblAdjuntarArchivo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdjuntarArchivo.gridx = 1;
		gbc_lblAdjuntarArchivo.gridy = 6;
		frame.getContentPane().add(lblAdjuntarArchivo, gbc_lblAdjuntarArchivo);
		
		txtF_Adjunto = new JTextField();
		GridBagConstraints gbc_txtF_Adjunto = new GridBagConstraints();
		gbc_txtF_Adjunto.gridwidth = 3;
		gbc_txtF_Adjunto.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_Adjunto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_Adjunto.gridx = 3;
		gbc_txtF_Adjunto.gridy = 6;
		frame.getContentPane().add(txtF_Adjunto, gbc_txtF_Adjunto);
		txtF_Adjunto.setColumns(10);
		
		btnAdjuntarArchivos = new JButton("");
		btnAdjuntarArchivos.addActionListener(new BtnAdjuntarArchivosActionListener());
		btnAdjuntarArchivos.setIcon(new ImageIcon(JEnviar_Mensaje.class.getResource("/presentacion/clip.png")));
		GridBagConstraints gbc_btnAdjuntarArchivos = new GridBagConstraints();
		gbc_btnAdjuntarArchivos.anchor = GridBagConstraints.WEST;
		gbc_btnAdjuntarArchivos.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdjuntarArchivos.gridx = 6;
		gbc_btnAdjuntarArchivos.gridy = 6;
		frame.getContentPane().add(btnAdjuntarArchivos, gbc_btnAdjuntarArchivos);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.EAST;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 8;
		gbc_btnCancelar.gridy = 7;
		frame.getContentPane().add(btnCancelar, gbc_btnCancelar);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setEnabled(false);
		btnEnviar.addActionListener(new BtnEnviarActionListener());
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.anchor = GridBagConstraints.EAST;
		gbc_btnEnviar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviar.gridx = 9;
		gbc_btnEnviar.gridy = 7;
		frame.getContentPane().add(btnEnviar, gbc_btnEnviar);
	}
	
	
	
	
	//---------------------------------------------------
	//CONTROL DE FORMATOS Y VALIDEZ DE DATOS INTRODUCIDOS 
	//---------------------------------------------------
	
	//EMAIL
	private class TxtF_destActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if(!txtF_Dest.getText().matches(EMAIL_PATTERN)) {
				b_dest = false;
				txtF_Dest.setBorder(bordeRojo); 
				lbl_ErrorDest.setText("Este destinatario no existe");
				lbl_WarningDest.setIcon(new ImageIcon(Crear_EditarUsuario.class.getResource("/presentacion/warning.png")));	
			}else {
				b_dest = true;
				lbl_WarningDest.setIcon(null);
				txtF_Dest.setBorder(defaultB);
			}
			if(b_dest && b_asunto) {
				btnEnviar.setEnabled(true);
			}
		}
	}
	
	//ASUNTO
	private class TxtF_asuntoActionListener extends KeyAdapter {
		public void keyReleased(KeyEvent arg0) {
			if(txtF_Asunto.getText().length() < 0) {
				b_asunto = false;
			}else {
				b_asunto = true;
			}
			if(b_dest && b_asunto) {
				btnEnviar.setEnabled(true);
			}
		}
	}
	
	
	
	
	//--------------------------------------------
	//                 OYENTES 
	//--------------------------------------------
	
	
	//OYENTE ADJUNTAR LOS ARCHIVOS
	private class BtnAdjuntarArchivosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frame);

			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File fichero = fcAbrir.getSelectedFile();
				txtF_Adjunto.setText(fichero.getAbsolutePath());
			}
		}
	}
	
	
	//OYENTE BOTON CANCELAR
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
		}
	}
	
	
	//OYENTE BOTON ENVIAR -- DIALOGO DE CONFIMACIÓN
	private class BtnEnviarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			JOptionPane.showMessageDialog(frame, "Mensaje enviado correctamente", "Confirmación", JOptionPane.PLAIN_MESSAGE);
		
		}
	}
	

	
	
	
	
	
	
}
