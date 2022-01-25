package com.example.git.service;

import java.util.List;

import com.example.git.entity.Persona;

public interface PersonaService {
    
    List<Persona> listarPersona();
    
    String saludoPersona(String mensaje);
}
