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
    String salones = "salones.txt";
    ArrayList<Curso> cursos = new ArrayList<Curso>();


    Periodo p1 = new Periodo(1, true);
    Periodo p2 = new Periodo(2, true);
    Periodo p3 = new Periodo(3, true);
    Periodo p4 = new Periodo(4, true);
    Periodo p5 = new Periodo(5, true);
    Periodo p6 = new Periodo(6, true);
    Periodo p7 = new Periodo(7, true);
    Periodo p8 = new Periodo(8, true);
    Periodo p9 = new Periodo(9, true);
    Periodo p10 = new Periodo(10, true);
    Periodo p11 = new Periodo(11, true);
    Periodo p12 = new Periodo(12, true);
    Periodo p13= new Periodo(13, true);
    Periodo p14 = new Periodo(14, true);
    Periodo p15 = new Periodo(15, true);
    Periodo p16 = new Periodo(16, true);
    Periodo p17 = new Periodo(17, true);
    Periodo p18 = new Periodo(18, true);
    Periodo p19 = new Periodo(19, true);
    Periodo p20 = new Periodo(20, true);
    Periodo p21 = new Periodo(21, true);
    
    Periodo[] diaEstandar={p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21};


    Dias lun = new Dias("Lunes",diaEstandar);
    Dias mar = new Dias("Martes",diaEstandar);
    Dias mie = new Dias("Miercoles",diaEstandar); 
    Dias jue = new Dias("Jueves",diaEstandar);
    Dias vie = new Dias("Viernes",diaEstandar);
    Dias sab = new Dias("Sabado",diaEstandar);


    Dias[] SemEstandar={lun,mar,mie,jue,vie,sab};


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

try (BufferedReader br = new BufferedReader(new FileReader(salones))) {
            String encabezado = br.readLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(",");
                
                // Extraer los valores del CSV
                
                int id_sede=Integer.parseInt(valores[0]);
                String BuildingLetter=valores[1];
                int id_salon=Integer.parseInt(valores[3]);
                int nivel=Integer.parseInt(valores[2]);
                int capacidad=Integer.parseInt(valores[4]);

                sedes.add(new Salon(BuildingLetter, id_sede, SemEstandar, id_salon, nivel, capacidad));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

for (int a=0; a<cursos.size(); a++) {
    Curso cursi = cursos.get(a);
for (int j=0; j<sedes.size(); j++) {
    Salon Sal = sedes.get(j);
Dias[]sem = sedes.get(j).getSemana();
for (int k=0; k<sem.length; k++) {
    String diadema = sem[k].getName();
Periodo[] dia = sem[k].getPeriodos();
for (int l=0; l<dia.length; l++) {
int m=l+1;

if (m<=21 && cursi.getId_sede() == Sal.getId_sede() && cursi.getAsignado() == false 
&& Sal.getCapacidad()==cursi.getCantidad_estudiantes()
&& (cursi.getDias()  equals diadema) ) {




}

}

}

}
}





// for (int i = 0; i <cursos.size(); i++){
//     System.out.println(sedes.get(i).toString());
// }

// for (int i = 0; i <cursos.size(); i++){
//     System.out.println(cursos.get(i).toString());
// }

    //escritor csv, por chat gpt
    try (FileWriter writer = new FileWriter(asignados)) {
            
            writer.write("id_curso,id_sede,nombre_curso,horario,duracion,dias,cantidad_estudiantes,salon_asignado\n");

            for (int i = 0; i <cursos.size(); i++) {
            writer.write(cursos.get(i).getId_sede()+","+
            cursos.get(i).getId_curso() + "," +
            cursos.get(i).getNombre_curso() + "," +
            cursos.get(i).getHorario() + "," +
            cursos.get(i).getDuración() + "," +
            cursos.get(i).getDias() + "," +
            cursos.get(i).getCantidad_estudiantes() + "," +
            cursos.get(i).getSalon_asignado() + "," +
            cursos.get(i).getAsignado() + "," +
            cursos.get(i).getEdificio()+"\n");
            

            
        } 
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Datos sobrescritos con éxito en " + asignados);
        }
        
    }
}