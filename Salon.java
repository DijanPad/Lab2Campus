/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Arrays y excepciones
 * 22-09-2323
 * @return Salon
 */

import java.util.Arrays;

public class Salon {
    
    //atributos
    private String BuildingLetter;//
    private int id_sede;//
    private Dias[] semana;//-->
	private int id_salon;//--
	private int nivel;//--
	private int capacidad;//



    //constructor
    public Salon(String buildingLetter, int id_sede, Dias[] semana, int id_salon, int nivel, int capacidad) {
        BuildingLetter = buildingLetter;
        this.id_sede = id_sede;
        this.semana = semana;
        this.id_salon = id_salon;
        this.nivel = nivel;
        this.capacidad = capacidad;
    }

    //metodos
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
    @Override
    public String toString() {
        return ", Sede " + id_sede + "\n" +
        "Edicifio " + BuildingLetter + "\n"+
        "Nivel " + nivel +";\n" +
        "id_alon" + id_salon+ "\n" + 
        Arrays.toString(semana)+ "\n" ;
    }


    

}
