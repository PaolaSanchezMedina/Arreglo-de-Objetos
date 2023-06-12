package com.mycompany.alumnos_sdu1;

/**
 *
 * @author Paola
 */

import javax.swing.JOptionPane;

public class Alumnos_SDU1 {

    public static void main(String[] args) {
        ArregloAlumnos arregloAlumnos = new ArregloAlumnos();
        int opcion;
        try{
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENÚ\n"
            + "1. Agregar alumno\n" + "2. Buscar alumno por nombre\n" + "3. Buscar alumno por número de control\n"
            + "4. Calcular promedio\n" + "5. Salir"));
            
            switch(opcion){
                case 1:
                    arregloAlumnos.agregarAlumno();
                    break;
                case 2:
                    arregloAlumnos.buscarAlumnoNom();
                    break;
                case 3:
                    arregloAlumnos.buscarAlumnoNumCont();
                    break;
                case 4:
                    arregloAlumnos.calcularPromedio();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    break;
            }
            
        }while(opcion != 5);
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Datos incorrectos...");
        }
    }
}
