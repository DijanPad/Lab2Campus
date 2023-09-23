import java.util.Arrays;

public class Dias {

    private String name;//
    private Periodo[] periodos;


    
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
        return  name  + Arrays.toString(periodos);
    }
    


}
