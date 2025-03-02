package com.example.apirest.api_rest.bean;

//Regreso al usuario

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MotoResponse {

    private Long idMoto;
    private String message;
}
