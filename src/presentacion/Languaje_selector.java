package presentacion;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.GridLayout;

public class Languaje_selector extends JPanel {
	private JComboBox cmbLanguajeSelector;

	/**
	 * Create the panel.
	 */
	public Languaje_selector() {
		setToolTipText("");
		{
			String [] languaje_list = new String [] {"Español","English"};
			setLayout(new GridLayout(0, 1, 0, 0));
			cmbLanguajeSelector = new JComboBox(languaje_list);
			cmbLanguajeSelector.setToolTipText("Selección de idioma.");
			cmbLanguajeSelector.setRenderer(new RenderComboIdiomas());
			add(cmbLanguajeSelector);
		}

	}

}