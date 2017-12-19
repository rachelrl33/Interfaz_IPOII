package dominio;

public class Tarea {

	private String nombre;
	private String id;
	private String usuarioEncargado;
	private String adjunto;
	private String fechaInicio;
	private String fechaLimite;
	private String estado;
	private String prioridad;
	private String categoria;
	private String comentario;
	
	private int creada = 0;
	
	public Tarea(String nombre, String id, String usuarioEncargado, String adjunto, String fechaInicio,
			String fechaLimite, String estado, String prioridad, String categoria, String comentario) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.id = id;
		this.usuarioEncargado = usuarioEncargado;
		this.adjunto = adjunto;
		this.fechaInicio = fechaInicio;
		this.fechaLimite = fechaLimite;
		this.estado = estado;
		this.prioridad = prioridad;
		this.categoria = categoria;
		this.comentario = comentario;
		this.creada = 1;
	}

	public int getCreada() {
		return creada;
	}

	public void setCreada(int creada) {
		this.creada = creada;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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

	public String getUsuarioEncargado() {
		return usuarioEncargado;
	}

	public void setUsuarioEncargado(String usuarioEncargado) {
		this.usuarioEncargado = usuarioEncargado;
	}

	public String getAdjunto() {
		return adjunto;
	}

	public void setAdjunto(String adjunto) {
		this.adjunto = adjunto;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
