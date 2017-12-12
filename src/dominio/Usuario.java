package dominio;



import javax.swing.Icon;

public class Usuario {

	private Icon avatar;
	private String nombre;
	private String telefono;
	private String email;
	private String constrasena;
	private String conocimientos;
	private String ultConex;
	
	public Usuario(Icon avatar, String nombre, String telefono, String email, String constrasena, String conocimientos, String ultConex) {
		this.avatar = avatar;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.constrasena = constrasena;
		this.conocimientos = conocimientos;
		this.ultConex=ultConex;
	}

	public Icon getAvatar() {
		return avatar;
	}

	public void setAvatar(Icon avatar) {
		this.avatar = avatar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConstrasena() {
		return constrasena;
	}

	public void setConstrasena(String constrasena) {
		this.constrasena = constrasena;
	}

	public String getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(String conocimientos) {
		this.conocimientos = conocimientos;
	}
	
	
}
