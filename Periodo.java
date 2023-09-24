/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Arrays y excepciones
 * 22-09-2323
 * @return Periodo
 */

public class Periodo {
    
    //atributos
    private int hora;//
	private Boolean disponible;//

    //metodos
    public Periodo(int hora, Boolean disponible) {
        this.hora = hora;
        this.disponible = disponible;
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public Boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String toString() {
        return "Hora" + hora+"\n"+
        "Disponible" + disponible+"\n";
    }

    


    

}
