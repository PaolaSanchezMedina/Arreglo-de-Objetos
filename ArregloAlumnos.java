package com.mycompany.alumnos_sdu1;

/**
 *
 * @author Paola
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArregloAlumnos {
    ArrayList<Alumno> listaAlumnos = new ArrayList();
    
    public void agregarAlumno(){
        String nombre = JOptionPane.showInputDialog("Nombre");
        String primerApellido = JOptionPane.showInputDialog("Primer apellido");
        String segundoApellido = JOptionPane.showInputDialog("Segundo apellido");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        String fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento");
        String carrera = JOptionPane.showInputDialog("Carrera");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre actual"));
        int numeroControl = Integer.parseInt(JOptionPane.showInputDialog("Número de control"));
        double calificacionSemAnt = 0;
        for(int k = 0; k < (semestre - 1); k++){
            double aux = Double.parseDouble(JOptionPane.showInputDialog("Calificación semestre " + (k + 1)));
            calificacionSemAnt += aux;
        }
        double promedio = calificacionSemAnt/(semestre - 1);
        
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setPrimerApellido(primerApellido);
        alumno.setSegundoApellido(segundoApellido);
        alumno.setEdad(edad);
        alumno.setFechaNacimiento(fechaNacimiento);
        alumno.setCarrera(carrera);
        alumno.setSemestre(semestre);
        alumno.setNumeroControl(numeroControl);
        alumno.setCalificacionSemAnt(calificacionSemAnt);
        alumno.setPromedio(promedio);
        
        listaAlumnos.add(alumno);
    }
    
    //Buscar alumno por nombre
    public void buscarAlumnoNom(){
        
        String nombreIngresado = JOptionPane.showInputDialog("Nombre: ");
        int aux = 0;
        
        for(int i = 0; i < listaAlumnos.size(); i++){
            
            String nombre = listaAlumnos.get(i).getNombre();
            String string = "";
            
            if(nombre.equals(nombreIngresado)){
                aux++;
                //Mostrar Alumno
                string+="Alumno: " + (i+1) + "\n";
                string+="Nombre: " + listaAlumnos.get(i).getNombre() + "\n";
                string+="Primer apellido: " + listaAlumnos.get(i).getPrimerApellido() + "\n";
                string+="Segundo apellido: " + listaAlumnos.get(i).getSegundoApellido() + "\n";
                string+="Edad: " + listaAlumnos.get(i).getEdad() + "\n";
                string+="Fecha de nacimiento: " + listaAlumnos.get(i).getFechaNacimiento() + "\n";
                string+="Carrera: " + listaAlumnos.get(i).getCarrera() + "\n";
                string+="Semestre Actual: " + listaAlumnos.get(i).getSemestre() + "\n";
                string+="Número de control: " + listaAlumnos.get(i).getNumeroControl() + "\n";
                string+="Calificación de semestres anteriores: " + listaAlumnos.get(i).getCalificacionSemAnt() + "\n";
                
                JOptionPane.showMessageDialog(null, string);
                
            }
        }
        if(aux == 0){
            JOptionPane.showMessageDialog(null, "Alumno no encontrado");
        }
    }
    
    //Buscar alumno por número de control
    public void buscarAlumnoNumCont(){
        
        int numContIngresado = Integer.parseInt(JOptionPane.showInputDialog("Número de control: "));
        int aux = 0;
        
        for(int i = 0; i < listaAlumnos.size(); i++){
            
            int numCont = listaAlumnos.get(i).getNumeroControl();
            String string = "";
            
            if(numContIngresado == numCont){
                 aux++;
                //Mostrar Alumno
                string+="Nombre: " + listaAlumnos.get(i).getNombre() + "\n";
                string+="Primer apellido: " + listaAlumnos.get(i).getPrimerApellido() + "\n";
                string+="Segundo apellido: " + listaAlumnos.get(i).getSegundoApellido() + "\n";
                string+="Edad: " + listaAlumnos.get(i).getEdad() + "\n";
                string+="Fecha de nacimiento: " + listaAlumnos.get(i).getFechaNacimiento() + "\n";
                string+="Carrera: " + listaAlumnos.get(i).getCarrera() + "\n";
                string+="Semestre Actual: " + listaAlumnos.get(i).getSemestre() + "\n";
                string+="Número de control: " + listaAlumnos.get(i).getNumeroControl() + "\n";
                string+="Calificación de semestres anteriores: " + listaAlumnos.get(i).getCalificacionSemAnt() + "\n";
                
                JOptionPane.showMessageDialog(null, string);
            }
        }
        if(aux == 0){
            JOptionPane.showMessageDialog(null, "Alumno no encontrado");
        }
    }
    
    public void calcularPromedio(){
        int opcion;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Calcular promedio de un alumno\n" 
                + "1.Calcular promedio buscando por nombre\n" + "2.Calcular promedio buscando por número de control\n" + "3. Salir"));
        
        switch(opcion){
            case 1:
                String nombreIngresado = JOptionPane.showInputDialog("Nombre: ");
                int aux1 = 0;
        
                for(int i = 0; i < listaAlumnos.size(); i++){
            
                    String nombre = listaAlumnos.get(i).getNombre();
                    String string = "";
            
                    if(nombre.equals(nombreIngresado)){
                        aux1++;
                        //Mostrar Alumno
                        string+="Alumno: " + (i+1) + "\n";
                        string+="Nombre: " + listaAlumnos.get(i).getNombre() + "\n";
                        string+="Número de control: " + listaAlumnos.get(i).getNumeroControl() + "\n";
                        string+="PROMEDIO: " + listaAlumnos.get(i).getPromedio() + "\n";

                        JOptionPane.showMessageDialog(null, string);
                
                    }
                }
                if(aux1 == 0){
                    JOptionPane.showMessageDialog(null, "Alumno no encontrado");
                }
                
                break;
            
            case 2:
                int numContIngresado = Integer.parseInt(JOptionPane.showInputDialog("Número de control: "));
                int aux2 = 0;
        
                for(int i = 0; i < listaAlumnos.size(); i++){
                    
                    int numCont = listaAlumnos.get(i).getNumeroControl();
                    String string = "";
            
                        if(numContIngresado == numCont){
                        aux2++;
                        //Mostrar Alumno
                        string+="Alumno: " + (i+1) + "\n";
                        string+="Nombre: " + listaAlumnos.get(i).getNombre() + "\n";
                        string+="Número de control: " + listaAlumnos.get(i).getNumeroControl() + "\n";
                        string+="Promedio: " + listaAlumnos.get(i).getPromedio() + "\n";

                        JOptionPane.showMessageDialog(null, string);
                
                    }
                }
                if(aux2 == 0){
                    JOptionPane.showMessageDialog(null, "Alumno no encontrado");
                }
                
                break;
            
            case 3:
                JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
                
            default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                break;
        }
        
        }while(opcion != 3);
        
        
    }
}