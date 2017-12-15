package presentacion;

import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListCellRenderer;

import dominio.Usuario;



public class CustomListModel extends AbstractListModel {
	private ArrayList<Usuario> lista = new ArrayList<>();
	
	@Override
	public int getSize() {
		return lista.size();
	}
	@Override
	public Object getElementAt(int index) {
		Usuario p = lista.get(index);
		return p.getNombre();
	}
	
	public void addPersona(Usuario p){
		lista.add(p);
		this.fireIntervalAdded(this, getSize(), getSize()+1);
		 }
	
	public void eliminarPersona(int index0){
		lista.remove(index0);
		this.fireIntervalRemoved(index0, getSize(), getSize()+1);
	}
	
	public Usuario getPersona(int index){
		return lista.get(index);
	}
	
	
	public void modificarPersona(Usuario p, int index) {
		Usuario aux = lista.get(index);
		aux.setNombre(p.getNombre());
		aux.setAvatar(p.getAvatar());
		aux.setConocimientos(p.getConocimientos());
		aux.setConstrasena(p.getContrasena());
		aux.setEmail(p.getEmail());
		aux.setTelefono(p.getTelefono());
		lista.remove(p);
		lista.add(aux);
	}
	
	
	
	
	
}

