package presentacion;

import java.awt.Component;
import java.awt.Component;
import javax.swing.*;
import javax.swing.tree.*;


public class MiRenderizadoArbol extends DefaultTreeCellRenderer {
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
		String c = (String)(nodo.getUserObject());
		
		switch (c)
		{
		case "Mi zona de trabajo":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("folder.png")));
			break;
		case "Enviar mensaje":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("letter.png")));
			break;
		case "Proyectos":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("tasks.png")));
			break; 
		case "Usuarios":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("users.png")));
			break; 

		default:
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("p.png")));
			break; 
		}
		return this;
	} 
}