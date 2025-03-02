package com.example.apirest.api_rest.model;

import jakarta.persistence.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "motos")
@Audited
public class Moto {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    String marca;
    String modelo;
    String color;
    String cilindrada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
