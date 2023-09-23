import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//archivos csv, lector y escritor patrocinado por chat GPT B)

public class Driver {


    public static void main(String[] args){

    ArrayList<Salon> sedes = new ArrayList<Salon>();
    String archivoCSV = "cursos.txt";
    String asignados = "asignados.txt";
    String salones = "salones.txt";
    ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    String menu = "Universidad pesadilla"+"\n"+
    "1. Cargar archivos"+"\n"+
    "2.Consultar Salon"+"\n"+
    "3. Asignar"+  "\n"+
    "4. Buscar Salon"+"\n"+
    "5 Buscar Curso"+"\n"+
    "6. Imprimir Cursos Asignados"+"\n"+
    "7. Saliras"+"\n";


    
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
    
    Periodo[] diaEstandar={p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21};


    Dias lun = new Dias("Lunes",diaEstandar);
    Dias mar = new Dias("Martes",diaEstandar);
    Dias mie = new Dias("Miercoles",diaEstandar); 
    Dias jue = new Dias("Jueves",diaEstandar);
    Dias vie = new Dias("Viernes",diaEstandar);
    Dias sab = new Dias("Sabado",diaEstandar);


    Dias[] SemEstandar={lun,mar,mie,jue,vie,sab};

Boolean run = true;
Scanner scanner = new Scanner(System.in);
int recep = 0;
 recep = scanner.nextInt();

while(run==true) {
    System.out.println(menu);

    recep = scanner.nextInt();

    if(recep == 1){
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
                int salon_asignado = -1;
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
    }

if (recep == 2){
for (int i = 0; i <cursos.size(); i++){
    System.out.println(sedes.get(i).toString());
}
}
if (recep == 3) {
for (int j=0; j<sedes.size(); j++) {
    Salon Sal = sedes.get(j);
    for (int a=0; a<cursos.size(); a++) {
    Curso cursi = cursos.get(a);

Dias[]sem = sedes.get(j).getSemana();
for (int k=0; k<sem.length; k++) {
    String diadema = sem[k].getName();
Periodo[] dia = sem[k].getPeriodos();
for (int l=0; l<dia.length; l++) {
    Periodo perry = dia[l];
int m=l+1;
int n =l+2;

if (cursi.getId_sede() == Sal.getId_sede() && cursi.getAsignado() == false 
&& Sal.getCapacidad()+1 > cursi.getCantidad_estudiantes()
&& (cursi.getDias().equals(diadema)) && perry.getDisponible() == true
&& cursi.getHorario() == perry.getHora() ) {
    cursi.setAsignado(true);
    cursi.setEdificio(Sal.getBuildingLetter());
    cursi.setSalon_asignado(Sal.getId_salon());
    cursi.setEdificio(Sal.getBuildingLetter());
    perry.setDisponible(false);

}else if(m<=14 && cursi.getId_sede() == Sal.getId_sede() && cursi.getAsignado() == false 
&& Sal.getCapacidad()+1 > cursi.getCantidad_estudiantes()
&& (cursi.getDias().equals(diadema)) && perry.getDisponible() == true
&& cursi.getHorario() == perry.getHora() &&  dia[m].getDisponible() == true ) {
    cursi.setAsignado(true);
    cursi.setEdificio(Sal.getBuildingLetter());
    cursi.setSalon_asignado(Sal.getId_salon());
    cursi.setEdificio(Sal.getBuildingLetter());
    perry.setDisponible(false);
    dia[m].setDisponible(false);


}else if (m<=13 && n<=14 && cursi.getId_sede() == Sal.getId_sede() && cursi.getAsignado() == false 
&& Sal.getCapacidad() +1 > cursi.getCantidad_estudiantes()
&& (cursi.getDias().equals(diadema)) && perry.getDisponible() == true
&& cursi.getHorario() == perry.getHora()  && dia[m].getDisponible()==true && dia[n].getDisponible()==true) {
    cursi.setAsignado(true);
    cursi.setEdificio(Sal.getBuildingLetter());
    cursi.setSalon_asignado(Sal.getId_salon());
    cursi.setEdificio(Sal.getBuildingLetter());
    perry.setDisponible(false);
    dia[m].setDisponible(false);
    dia[n].setDisponible(false);
}
}
}
}
}
//escritor csv, por chat gpt
    try (FileWriter writer = new FileWriter(asignados)) {
            
            writer.write("id_curso,id_sede,nombre_curso,horario,duracion,dias,cantidad_estudiantes,salon_asignado,edificio\n");

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
    if(recep == 4){

    }

    if(recep == 5){

    }

    
    if(recep == 6){
        try (BufferedReader dr = new BufferedReader(new FileReader(asignados))) {
            String linea;
            while ((linea = dr.readLine()) != null) {
                String[] valores = linea.split(",");
                // Ahora puedes procesar los valores en el arreglo 'valores'
                for (String valor : valores) {
                    System.out.print(valor + " ");
                }
                System.out.println(); // Imprimir una nueva línea para cada fila
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
    if (recep == 7) {
        run = !run;
}
else {
    System.out.println("inrese una opcion valida");
}
}
}}