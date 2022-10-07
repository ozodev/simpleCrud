package com.simplecrud.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clientes")
public class Cliente {

    @Id
    private String id;

    private String nombre;

    public Cliente(){}

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}