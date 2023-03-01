// ISABELLA PARRY - COHORTE 4 (HAMILTON) - GENERATIONS
package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

public class Nota {
    public Double nota;

    //CONSTRUCTORES
    public Nota() {
    }

    public Nota(Double nota) {
        this.nota = nota;
    }

    //GETTERS Y SETTERS
    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Nota [nota=" + nota + "]";
    }

}
