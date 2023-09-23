import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//archivos csv, lector y escritor patrocinado por chat GPT B)

public class Driver {


    public static void main(String[] args){

    ArrayList<Salon> sedes = new ArrayList<Salon>();
    String archivoCSV = "salones.txt";
    String asignados = "asignados.txt";



    //lector csv, por chat gpt
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(",");
                // Ahora puedes procesar los valores en el arreglo 'valores'
                for (String valor : valores) {
                    System.out.print(valor + " ");
                }
                System.out.println(); // Imprimir una nueva línea para cada fila
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    //escritor csv, por chat gpt
    try (FileWriter writer = new FileWriter(asignados)) {
            // Escribe la cabecera
            writer.write("id_curso,id_sede,nombre_curso,horario,duracion,dias,cantidad_estudiantes,salon_asignado\n");

            for (int i = 0; i <sedes.size(); i++) {
            writer.write(sedes.get(i).getId_sede()+","+"A,1,101,30\n");
            // Agrega más líneas de datos según sea necesario

            System.out.println("Datos sobrescritos con éxito en " + archivoCSV);
        } }catch (IOException e) {
            e.printStackTrace();
        }
    }
}