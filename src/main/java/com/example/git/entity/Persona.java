package com.example.git.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    int idPersona;
    String nombre;
    int dni;

    private String saludar(String msg){
        return ("Hola a todos tu mensaje "+msg );
    }
}
