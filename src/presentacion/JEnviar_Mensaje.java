package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JEnviar_Mensaje {

	private JFrame frame;
	private JLabel lblEnviarMensaje;
	private JLabel lblAsunto;
	private JLabel lblAdjuntar;
	private JTextField txtF_Asunto;
	private JScrollPane scrollPane;
	private JTextArea txtA_Mensaje;
	private JButton btnAdjuntarArchivos;
	private JButton btnEnviar;
	private JTextField txtF_Adjunto;
	private JLabel lblAdjuntarArchivo;
	private JLabel lblDestinatario;
	private JTextField txtF_Dest;
	private JButton btnCancelar;

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
		gridBagLayout.columnWidths = new int[]{43, 72, 0, 24, 73, 84, 47, 0, 66, 71, 34, 0};
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
		GridBagConstraints gbc_txtF_Dest = new GridBagConstraints();
		gbc_txtF_Dest.gridwidth = 4;
		gbc_txtF_Dest.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_Dest.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_Dest.gridx = 2;
		gbc_txtF_Dest.gridy = 2;
		frame.getContentPane().add(txtF_Dest, gbc_txtF_Dest);
		txtF_Dest.setColumns(10);
		
		lblAsunto = new JLabel("Asunto");
		GridBagConstraints gbc_lblAsunto = new GridBagConstraints();
		gbc_lblAsunto.anchor = GridBagConstraints.WEST;
		gbc_lblAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsunto.gridx = 1;
		gbc_lblAsunto.gridy = 3;
		frame.getContentPane().add(lblAsunto, gbc_lblAsunto);
		
		txtF_Asunto = new JTextField();
		GridBagConstraints gbc_txtF_Asunto = new GridBagConstraints();
		gbc_txtF_Asunto.gridwidth = 4;
		gbc_txtF_Asunto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_Asunto.insets = new Insets(0, 0, 5, 5);
		gbc_txtF_Asunto.gridx = 2;
		gbc_txtF_Asunto.gridy = 3;
		frame.getContentPane().add(txtF_Asunto, gbc_txtF_Asunto);
		txtF_Asunto.setColumns(10);
		
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
		btnEnviar.addActionListener(new BtnEnviarActionListener());
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.anchor = GridBagConstraints.EAST;
		gbc_btnEnviar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviar.gridx = 9;
		gbc_btnEnviar.gridy = 7;
		frame.getContentPane().add(btnEnviar, gbc_btnEnviar);
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
