package com.avathartech.springboot_vaadin_10.servicios;

import com.avathartech.springboot_vaadin_10.entidades.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    public void crearEstudiante(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }

    public List<Estudiante> listaEstudiantes(){
        return estudianteRepository.findAll();
    }

    public List<Estudiante> listaEstudiantes(int offset, int limit){
        return estudianteRepository.findAll(offset, limit);
    }

    public long cantidadEstudiante(){
        return estudianteRepository.count();
    }

    public void borrarEstudiante(Estudiante estudianteSeleccionado) {
        estudianteRepository.delete(estudianteSeleccionado);
    }
}
