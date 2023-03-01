// ISABELLA PARRY - COHORTE 4 (HAMILTON) - GENERATION
package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Colegio {
    public String nombreColegio;
    public String direccionColegio;
    public ArrayList<Profesor> profesoresColegio;
    public ArrayList<Alumno> alumnosColegio;
    public ArrayList<Directivo> directivosColegio;

    //CONSTRUCTORES
    public Colegio() {
    }
    public Colegio(String nombreColegio, String direccionColegio, ArrayList<Profesor> profesoresColegio,
            ArrayList<Alumno> alumnosColegio, ArrayList<Directivo> directivosColegio) {
        this.nombreColegio = nombreColegio;
        this.direccionColegio = direccionColegio;
        this.profesoresColegio = profesoresColegio;
        this.alumnosColegio = alumnosColegio;
        this.directivosColegio = directivosColegio;
    }

    //GETTERS Y SETTERS
    public String getNombreColegio() {
        return nombreColegio;
    }
    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }
    public String getDireccionColegio() {
        return direccionColegio;
    }
    public void setDireccionColegio(String direccionColegio) {
        this.direccionColegio = direccionColegio;
    }
    public ArrayList<Profesor> getProfesoresColegio() {
        return profesoresColegio;
    }
    public void setProfesoresColegio(ArrayList<Profesor> profesoresColegio) {
        this.profesoresColegio = profesoresColegio;
    }
    public ArrayList<Alumno> getAlumnosColegio() {
        return alumnosColegio;
    }
    public void setAlumnosColegio(ArrayList<Alumno> alumnosColegio) {
        this.alumnosColegio = alumnosColegio;
    }
    public ArrayList<Directivo> getDirectivosColegio() {
        return directivosColegio;
    }
    public void setDirectivosColegio(ArrayList<Directivo> directivosColegio) {
        this.directivosColegio = directivosColegio;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Colegio [nombreColegio=" + nombreColegio + ", direccionColegio=" + direccionColegio
                + ", profesoresColegio=" + profesoresColegio + ", alumnosColegio=" + alumnosColegio
                + ", directivosColegio=" + directivosColegio + "]";
    }

}
