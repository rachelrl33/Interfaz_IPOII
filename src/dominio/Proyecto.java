package dominio;

import java.util.ArrayList;

public class Proyecto {

	private String nombre;
	private String id;
	private String descripcion;
	private String jefe;
	private String fechaInicio;
	private String fechaLimite;
	private String prioridad;
	private String estado;
	private ArrayList<Tarea> tareas;
	
	//private int creada = 0;
	
	public Proyecto(String nombre, String id, String descripcion, String jefe, String fechaInicio, String fechaLimite, 
			String prioridad, String estado, ArrayList<Tarea> tareas) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.id = id;
		this.descripcion=descripcion;
		this.jefe=jefe;
		this.fechaInicio=fechaInicio;
		this.fechaLimite=fechaLimite;
		this.prioridad=prioridad;
		this.estado=estado;
		this.tareas=tareas;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

}