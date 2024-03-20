package com.example.Store.modelos;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "marcas")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreMarca;
    @Column(name="nombreMarca",nullable = false, length = 15)
    private String nit;
    private LocalDate anoCreacion;
    @Column(name="anoCreacion",nullable = false, length = 15)
    private String sedePrincipal;


    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }
}
