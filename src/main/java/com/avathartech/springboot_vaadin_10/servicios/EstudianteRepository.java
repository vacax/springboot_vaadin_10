package com.avathartech.springboot_vaadin_10.servicios;

import com.avathartech.springboot_vaadin_10.entidades.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EstudianteRepository extends PagingAndSortingRepository<Estudiante, Integer> {

    List<Estudiante> findAll();
    @Query(value = "SELECT * FROM estudiante m offset(?1) limit(?2)",nativeQuery = true)
    List<Estudiante> findAll(int offset, int limit);
    long count();
}
