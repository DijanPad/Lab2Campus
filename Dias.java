/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Arrays y excepciones
 * 22-09-2323
 * @return Dias
 */

import java.util.Arrays;

public class Dias {

    //atributos
    private String name;//
    private Periodo[] periodos;


    //metodos
    public Dias(String name, Periodo[] periodos) {
        this.name = name;
        this.periodos = periodos;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Periodo[] getPeriodos() {
        return periodos;
    }
    public void setPeriodos(Periodo[] periodos) {
        this.periodos = periodos;
    }

    @Override
    public String toString() {
        return  name  + Arrays.toString(periodos)+"\n";
    }
    


}
