// ISABELLA PARRY - COHORTE 4 (HAMILTON) - GENERATION
package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Profesor extends Persona {
    public Curso cursoAsignado;
    public ArrayList<Materia> materiasImpartidas;

    //CONSTRUCTORES
    public Profesor() {
    }
    public Profesor(Curso cursoAsignado, ArrayList<Materia> materiasImpartidas) {
        this.cursoAsignado = cursoAsignado;
        this.materiasImpartidas = materiasImpartidas;
    }
    public Profesor(String nombre, String apellido, String rut, Curso cursoAsignado,
            ArrayList<Materia> materiasImpartidas) {
        super(nombre, apellido, rut);
        this.cursoAsignado = cursoAsignado;
        this.materiasImpartidas = materiasImpartidas;
    }

    //GETTERS Y SETTERS
    public Curso getCursoAsignado() {
        return cursoAsignado;
    }
    public void setCursoAsignado(Curso cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }
    public ArrayList<Materia> getMateriasImpartidas() {
        return materiasImpartidas;
    }
    public void setMateriasImpartidas(ArrayList<Materia> materiasImpartidas) {
        this.materiasImpartidas = materiasImpartidas;
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "Profesor [cursoAsignado=" + cursoAsignado + ", materiasImpartidas=" + materiasImpartidas + "]";
    }
    
}
