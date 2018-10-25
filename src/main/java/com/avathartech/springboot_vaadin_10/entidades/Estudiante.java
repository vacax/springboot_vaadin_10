package com.avathartech.springboot_vaadin_10.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue
    Integer matricula;
    String nombre;

    public Estudiante(){

    }

    public Estudiante(Integer matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
