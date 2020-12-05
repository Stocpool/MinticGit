/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repositorio;

import com.example.modelos.Serie;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Alexander
 */
@Repository
public interface SerieRepo extends JpaRepository<Serie, Long> {
    
}
