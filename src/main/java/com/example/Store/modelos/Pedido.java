package com.example.Store.modelos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="id",nullable = false, length = 20)
    private LocalDateTime FechaYHora;


    public Pedido() {
    }

    public Pedido(Integer id, LocalDateTime fechaYHora) {
        this.id = id;
        FechaYHora = fechaYHora;
    }
}
