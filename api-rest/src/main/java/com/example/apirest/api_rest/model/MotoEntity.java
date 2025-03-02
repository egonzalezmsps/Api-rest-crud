package com.example.apirest.api_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Table(name = "motos")
@Data
public class MotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private String color;
    private String cilindrada;
    //Auditoria
    private LocalDateTime createdAt; //Quien lo crea
    private String createdBy; // A que hora dio de alta
    private LocalDateTime lastModifiedAt; // A que hora la actualizaste
    private String lastModifiedBy;//quien te lo actualizo

    private Boolean redflag;
}
