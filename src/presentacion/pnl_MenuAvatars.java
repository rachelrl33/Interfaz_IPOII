package presentacion;

import javax.swing.JPanel;


import java.awt.GridBagLayout;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pnl_MenuAvatars extends JPanel {
	private JButton btn1;
	private JButton btn11;
	private JButton btn12;
	private JButton btn2;
	private JButton btn9;
	private JButton btn8;
	private JButton btn3;
	private JButton btn7;
	private JButton btn10;
	private JButton btn4;
	private JButton btn6;
	private JButton btn5;


	/**
	 * Create the panel.
	 */
	public pnl_MenuAvatars() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0, 0, 4};
		gridBagLayout.rowHeights = new int[] {33, 35, 30, 0, 3};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		btn1 = new JButton("");
		btn1.addActionListener(new SeleccionActionListener());
		btn1.setBackground(java.awt.Color.white);
		btn1.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap1.png")));
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 0;
		add(btn1, gbc_btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new SeleccionActionListener());
		btn2.setBackground(java.awt.Color.white);
		btn2.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap2.png")));
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 1;
		gbc_btn2.gridy = 0;
		add(btn2, gbc_btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new SeleccionActionListener());
		btn3.setBackground(java.awt.Color.white);
		btn3.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap3.png")));
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.insets = new Insets(0, 0, 5, 0);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 0;
		add(btn3, gbc_btn3);
		
		btn11 = new JButton("");
		btn11.addActionListener(new SeleccionActionListener());
		btn11.setBackground(java.awt.Color.white);
		btn11.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap11.png")));
		GridBagConstraints gbc_btn11 = new GridBagConstraints();
		gbc_btn11.insets = new Insets(0, 0, 5, 5);
		gbc_btn11.gridx = 0;
		gbc_btn11.gridy = 1;
		add(btn11, gbc_btn11);
		
		btn9 = new JButton("");
		btn9.addActionListener(new SeleccionActionListener());
		btn9.setBackground(java.awt.Color.white);
		btn9.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap9.png")));
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 1;
		gbc_btn9.gridy = 1;
		add(btn9, gbc_btn9);
		
		btn4 = new JButton("");
		btn4.addActionListener(new SeleccionActionListener());
		btn4.setBackground(java.awt.Color.white);
		btn4.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap4.png")));
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.insets = new Insets(0, 0, 5, 0);
		gbc_btn4.gridx = 2;
		gbc_btn4.gridy = 1;
		add(btn4, gbc_btn4);
		
		btn12 = new JButton("");
		btn12.addActionListener(new SeleccionActionListener());
		btn12.setBackground(java.awt.Color.white);
		btn12.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap12.png")));
		GridBagConstraints gbc_btn12 = new GridBagConstraints();
		gbc_btn12.insets = new Insets(0, 0, 5, 5);
		gbc_btn12.gridx = 0;
		gbc_btn12.gridy = 2;
		add(btn12, gbc_btn12);
		
		btn8 = new JButton("");
		btn8.addActionListener(new SeleccionActionListener());
		btn8.setBackground(java.awt.Color.white);
		btn8.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap8.png")));
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 1;
		gbc_btn8.gridy = 2;
		add(btn8, gbc_btn8);
		
		btn10 = new JButton("");
		btn10.addActionListener(new SeleccionActionListener());
		btn10.setBackground(java.awt.Color.white);
		btn10.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap10.png")));
		GridBagConstraints gbc_btn10 = new GridBagConstraints();
		gbc_btn10.insets = new Insets(0, 0, 5, 0);
		gbc_btn10.gridx = 2;
		gbc_btn10.gridy = 2;
		add(btn10, gbc_btn10);
		
		btn6 = new JButton("");
		btn6.addActionListener(new SeleccionActionListener());
		btn6.setBackground(java.awt.Color.white);
		btn6.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap6.png")));
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.insets = new Insets(0, 0, 0, 5);
		gbc_btn6.gridx = 0;
		gbc_btn6.gridy = 3;
		add(btn6, gbc_btn6);
		
		btn7 = new JButton("");
		btn7.addActionListener(new SeleccionActionListener());
		btn7.setBackground(java.awt.Color.white);
		btn7.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap7.png")));
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.insets = new Insets(0, 0, 0, 5);
		gbc_btn7.gridx = 1;
		gbc_btn7.gridy = 3;
		add(btn7, gbc_btn7);
		
		btn5 = new JButton("");
		btn5.addActionListener(new SeleccionActionListener());
		btn5.setBackground(java.awt.Color.white);
		btn5.setIcon(new ImageIcon(pnl_MenuAvatars.class.getResource("/presentacion/ap5.png")));
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.gridx = 2;
		gbc_btn5.gridy = 3;
		add(btn5, gbc_btn5);

	}

	
	
	//--------------------------------------------
	//                 OYENTES 
	//--------------------------------------------

	
	private class SeleccionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
		}
	}
}
