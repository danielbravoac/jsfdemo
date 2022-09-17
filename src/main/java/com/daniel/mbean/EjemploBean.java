package com.daniel.mbean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
//Tiempo de vida de clase
@RequestScoped
//Serializable es una interfaz que permite transformar datos
public class EjemploBean implements Serializable{
    
    private String nombre;
    private String saludo;

    public void aceptar(){
        this.saludo="Hola "+this.nombre;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    

}
