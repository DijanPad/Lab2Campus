public class Curso {

    private String id_curso;//--
	private int id_sede;//
	private String nombre_curso;//--
	private int horario;//
	private int duración; //
	private String dias; //
	private int cantidad_estudiantes;//
	private int salon_asignado;//
	private Boolean asignado;//
	private String edificio;//

	
	
	public Curso(String id_curso, int id_sede, String nombre_curso, int horario, int duración, String dias,
			int cantidad_estudiantes, int salon_asignado, Boolean asignado, String edificio) {
		this.id_curso = id_curso;
		this.id_sede = id_sede;
		this.nombre_curso = nombre_curso;
		this.horario = horario;
		this.duración = duración;
		this.dias = dias;
		this.cantidad_estudiantes = cantidad_estudiantes;
		this.salon_asignado = salon_asignado;
		this.asignado = asignado;
		this.edificio = edificio;
	}
	public String getId_curso() {
		return id_curso;
	}
	public void setId_curso(String id_curso) {
		this.id_curso = id_curso;
	}
	public int getId_sede() {
		return id_sede;
	}
	public void setId_sede(int id_sede) {
		this.id_sede = id_sede;
	}
	public String getNombre_curso() {
		return nombre_curso;
	}
	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public int getDuración() {
		return duración;
	}
	public void setDuración(int duración) {
		this.duración = duración;
	}
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	public int getCantidad_estudiantes() {
		return cantidad_estudiantes;
	}
	public void setCantidad_estudiantes(int cantidad_estudiantes) {
		this.cantidad_estudiantes = cantidad_estudiantes;
	}
	public int getSalon_asignado() {
		return salon_asignado;
	}
	public void setSalon_asignado(int salón_asignado) {
		this.salon_asignado = salón_asignado;
	}
	public Boolean getAsignado() {
		return asignado;
	}
	public void setAsignado(Boolean asignado) {
		this.asignado = asignado;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String toString() {

		return "Sede " + id_sede + "\n"+
			   "Edificio "+ edificio + "\n"+
				"Salon(y nivel) " + salon_asignado + "\n"+
				"Id Curso "+ id_curso +  ", nombre_curso=" + nombre_curso + ", horario="
				+ horario + ":00 , duración=" + duración + " periodos , dias=" + dias + ", cantidad_estudiantes="
				+ cantidad_estudiantes + ", salon_asignado=" + salon_asignado;
	}





	
}
