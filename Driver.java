import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//archivos csv, lector y escritor patrocinado por chat GPT B)

public class Driver {


    public static void main(String[] args){

    ArrayList<Salon> sedes = new ArrayList<Salon>();
    String archivoCSV = "cursos.txt";
    String asignados = "asignados.txt";
    ArrayList<Curso> cursos = new ArrayList<Curso>();


    //lector csv, por chat gpt
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String encabezado = br.readLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(",");
                
                // Extraer los valores del CSV
                String id_curso = valores[0];
                int id_sede = Integer.parseInt(valores[1]);
                String nombre_curso = valores[2];
                int horario = Integer.parseInt(valores[3]);
                int duración = Integer.parseInt(valores[4]);
                String dias = valores[5];
                int cantidad_estudiantes = Integer.parseInt(valores[6]);
                String salon_asignado = "";
                Boolean asignado = false; 
                String edificio = "";

                cursos.add(new Curso(id_curso, id_sede, nombre_curso, horario, duración, dias,
                cantidad_estudiantes, salon_asignado, asignado, edificio));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

for (int i = 0; i <cursos.size(); i++){
    System.out.println(cursos.get(i).toString());
}

    //escritor csv, por chat gpt
    // try (FileWriter writer = new FileWriter(asignados)) {
            
    //         writer.write("id_curso,id_sede,nombre_curso,horario,duracion,dias,cantidad_estudiantes,salon_asignado\n");

    //         for (int i = 0; i <cursos.size(); i++) {
    //         writer.write(cursos.get(i).getId_sede()+","+
    //         cursos.get(i).getId_curso() + "," +
    //         cursos.get(i).getNombre_curso() + "," +
    //         cursos.get(i).getHorario() + "," +
    //         cursos.get(i).getDuración() + "," +
    //         cursos.get(i).getDias() + "," +
    //         cursos.get(i).getCantidad_estudiantes() + "," +
    //         cursos.get(i).getSalon_asignado() + "," +
    //         cursos.get(i).getAsignado() + "," +
    //         cursos.get(i).getEdificio()+"\n");
            

    //         System.out.println("Datos sobrescritos con éxito en " + asignados);
    //     } 
    //     }catch (IOException e) {
    //         e.printStackTrace();
    //     }
    }
}