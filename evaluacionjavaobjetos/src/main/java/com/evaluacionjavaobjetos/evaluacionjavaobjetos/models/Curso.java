// ISABELLA PARRY - COHORTE 4 (HAMILTON) - GENERATION
package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Curso {
    public String nivel;
    public Integer cantAlumnos;
    public ArrayList<Profesor> profesoresCurso;

    //CONSTRUCTORES
    public Curso() {
    }
    public Curso(String nivel, Integer cantAlumnos, ArrayList<Profesor> profesoresCurso) {
        this.nivel = nivel;
        this.cantAlumnos = cantAlumnos;
        this.profesoresCurso = profesoresCurso;
    }

    //GETTERS Y SETTERS
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public Integer getCantAlumnos() {
        return cantAlumnos;
    }
    public void setCantAlumnos(Integer cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }
    public ArrayList<Profesor> getProfesoresCurso() {
        return profesoresCurso;
    }
    public void setProfesoresCurso(ArrayList<Profesor> profesoresCurso) {
        this.profesoresCurso = profesoresCurso;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Curso [nivel=" + nivel + ", cantAlumnos=" + cantAlumnos + ", profesoresCurso=" + profesoresCurso + "]";
    }
}
