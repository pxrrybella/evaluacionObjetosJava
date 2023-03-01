// ISABELLA PARRY - COHORTE 4 (HAMILTON) - GENERATION
package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Materia {
    public String nombreMateria;
    public ArrayList<Profesor> profesoresAsignados;

    //CONSTRUCTORES
    public Materia() {
    }
    public Materia(String nombreMateria, ArrayList<Profesor> profesoresAsignados) {
        this.nombreMateria = nombreMateria;
        this.profesoresAsignados = profesoresAsignados;
    }

    //GETTERS Y SETTERS
    public String getNombreMateria() {
        return nombreMateria;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public ArrayList<Profesor> getProfesoresAsignados() {
        return profesoresAsignados;
    }
    public void setProfesoresAsignados(ArrayList<Profesor> profesoresAsignados) {
        this.profesoresAsignados = profesoresAsignados;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Materia [nombreMateria=" + nombreMateria + ", profesoresAsignados=" + profesoresAsignados + "]";
    }
    
}
