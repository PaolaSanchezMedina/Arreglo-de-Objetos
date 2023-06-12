package com.mycompany.alumnos_sdu1;

/**
 *
 * @author Paola
 */

public class Alumno {
    
    private String nombre, primerApellido, segundoApellido, fechaNacimiento, carrera;
    private int edad, semestre, numeroControl;
    private double calificacionSemAnt, promedio;
    
    //Constructor
    public Alumno(){
        //Inicialización de atributos
        nombre = "";
        primerApellido = "";
        segundoApellido = "";
        edad = 0;
        fechaNacimiento = "";
        carrera =  "";
        semestre = 0;
        numeroControl = 0;
        calificacionSemAnt = 0;
        promedio = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(int numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getCalificacionSemAnt() {
        return calificacionSemAnt;
    }

    public void setCalificacionSemAnt(double calificacionSemAnt) {
        this.calificacionSemAnt = calificacionSemAnt;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
