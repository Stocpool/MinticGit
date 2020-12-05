/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.modelos;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Alexander
 */
@Entity
@Table(name = "serie")
public class Serie implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "id_serie")
    long id;
    
    @Column(name = "titulo_serie")
    String nombre;
    
    @Column(name = "temporadas_serie")
    int numeroTemporadas;
    
    @Column(name = "episodios_serie")
    int numeroCapitulos;

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }
    
    
}
