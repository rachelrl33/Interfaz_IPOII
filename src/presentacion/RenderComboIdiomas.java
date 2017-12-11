package presentacion;

import javax.swing.*;
import java.awt.*;

public class RenderComboIdiomas extends DefaultListCellRenderer{
	
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	ImageIcon lang1;
	ImageIcon lang2;

	
	
	public RenderComboIdiomas () {
		lang1 = new ImageIcon(MiListCellRenderer.class.getResource("/presentacion/banderaEsp.gif"));
		lang2 = new ImageIcon(MiListCellRenderer.class.getResource("/presentacion/banderaIng.gif"));
	}
	
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
		if (list.getModel().getElementAt(index) == "Espanol") {
			renderer.setIcon(lang1);
		} else if(list.getModel().getElementAt(index) == "Ingles"){
			renderer.setIcon(lang2);
		}
		return renderer;

	}
}