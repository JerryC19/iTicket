/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iticket.repository;

import org.springframework.data.repository.CrudRepository;
import com.iticket.entity.concierto;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JerryCampos
 */
@Repository
public interface ConciertoRepository extends CrudRepository<concierto,Long> {
    
}
