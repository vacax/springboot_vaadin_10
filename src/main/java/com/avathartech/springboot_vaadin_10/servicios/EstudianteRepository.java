package com.avathartech.springboot_vaadin_10.servicios;

import com.avathartech.springboot_vaadin_10.entidades.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante, Integer> {
    
}
