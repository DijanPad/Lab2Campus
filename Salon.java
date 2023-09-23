public class Salon {
    
    private String BuildingLetter;
    private int id_sede;
    private Dias[] semana;
	private int id_salon;
	private int nivel;
	private int capacidad;

    public int getId_sede() {
        return id_sede;
    }
    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }
    public String getBuildingLetter() {
        return BuildingLetter;
    }
    public void setBuildingLetter(String buildingLetter) {
        BuildingLetter = buildingLetter;
    }
    public Dias[] getSemana() {
        return semana;
    }
    public void setSemana(Dias[] semana) {
        this.semana = semana;
    }
    public int getId_salon() {
        return id_salon;
    }
    public void setId_salon(int id_salon) {
        this.id_salon = id_salon;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    

}
