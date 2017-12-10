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

public class JEnviar_Mensaje {

	private JFrame frame;
	private JLabel lblEnviarMensaje;
	private JLabel lblAsunto;
	private JLabel lblAdjuntar;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnAdjuntarArchivos;
	private JButton btnNewButton;

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
		frame.setBounds(100, 100, 543, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{31, 17, 0, 0, 117, 195, 34, 0};
		gridBagLayout.rowHeights = new int[]{23, 35, 43, 40, 195, 19, 34, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblEnviarMensaje = new JLabel("   Enviar Mensaje");
		lblEnviarMensaje.setIcon(new ImageIcon(JEnviar_Mensaje.class.getResource("/presentacion/email.png")));
		lblEnviarMensaje.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblEnviarMensaje = new GridBagConstraints();
		gbc_lblEnviarMensaje.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblEnviarMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnviarMensaje.gridwidth = 5;
		gbc_lblEnviarMensaje.gridx = 1;
		gbc_lblEnviarMensaje.gridy = 1;
		frame.getContentPane().add(lblEnviarMensaje, gbc_lblEnviarMensaje);
		
		lblAsunto = new JLabel("Asunto");
		GridBagConstraints gbc_lblAsunto = new GridBagConstraints();
		gbc_lblAsunto.anchor = GridBagConstraints.WEST;
		gbc_lblAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsunto.gridx = 2;
		gbc_lblAsunto.gridy = 2;
		frame.getContentPane().add(lblAsunto, gbc_lblAsunto);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 2;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblAdjuntar = new JLabel("Mensaje");
		GridBagConstraints gbc_lblAdjuntar = new GridBagConstraints();
		gbc_lblAdjuntar.anchor = GridBagConstraints.WEST;
		gbc_lblAdjuntar.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdjuntar.gridx = 2;
		gbc_lblAdjuntar.gridy = 3;
		frame.getContentPane().add(lblAdjuntar, gbc_lblAdjuntar);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnAdjuntarArchivos = new JButton("Adjuntar archivos");
		btnAdjuntarArchivos.setIcon(new ImageIcon(JEnviar_Mensaje.class.getResource("/presentacion/clip.png")));
		GridBagConstraints gbc_btnAdjuntarArchivos = new GridBagConstraints();
		gbc_btnAdjuntarArchivos.gridwidth = 3;
		gbc_btnAdjuntarArchivos.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdjuntarArchivos.gridx = 1;
		gbc_btnAdjuntarArchivos.gridy = 5;
		frame.getContentPane().add(btnAdjuntarArchivos, gbc_btnAdjuntarArchivos);
		
		btnNewButton = new JButton("Enviar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 5;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}
}
