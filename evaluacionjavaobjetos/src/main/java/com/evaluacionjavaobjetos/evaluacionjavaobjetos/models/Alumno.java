// ISABELLA PARRY - COHORTE 4 (HAMILTON) - GENERATION
package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Alumno extends Persona {
    public Curso cursoActual;
    public ArrayList<Materia> materiasAsignadas;
    public HashMap<Materia, Nota> notasPorMateria;

    //CONSTRUCTORES
    public Alumno() {
        super();
    }
    public Alumno(Curso cursoActual, ArrayList<Materia> materiasAsignadas, HashMap<Materia, Nota> notasPorMateria) {
        this.cursoActual = cursoActual;
        this.materiasAsignadas = materiasAsignadas;
        this.notasPorMateria = notasPorMateria;
    }
    public Alumno(String nombre, String apellido, String rut, Curso cursoActual, ArrayList<Materia> materiasAsignadas,
            HashMap<Materia, Nota> notasPorMateria) {
        super(nombre, apellido, rut);
        this.cursoActual = cursoActual;
        this.materiasAsignadas = materiasAsignadas;
        this.notasPorMateria = notasPorMateria;
    }

    //GETTERS Y SETTERS
    public Curso getCursoActual() {
        return cursoActual;
    }
    public void setCursoActual(Curso cursoActual) {
        this.cursoActual = cursoActual;
    }
    public ArrayList<Materia> getMateriasAsignadas() {
        return materiasAsignadas;
    }
    public void setMateriasAsignadas(ArrayList<Materia> materiasAsignadas) {
        this.materiasAsignadas = materiasAsignadas;
    }
    public HashMap<Materia, Nota> getNotasPorMateria() {
        return notasPorMateria;
    }
    public void setNotasPorMateria(HashMap<Materia, Nota> notasPorMateria) {
        this.notasPorMateria = notasPorMateria;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Alumno " + super.apellido + " " +  super.nombre;
    }

}
