/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda2.dao;

import com.tienda2.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author isaac
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    List<Categoria> findByDescripcion(String descripcion);
    
    
}
