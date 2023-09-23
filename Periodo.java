public class Periodo {
    
    private int hora;
	private Boolean disponible;


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
