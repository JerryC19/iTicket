/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iticket.service;

import com.iticket.entity.concierto;
import com.iticket.repository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JerryCampos
 */
@Service
public class ConciertoService implements IConciertoService {
    
    @Autowired
    private ConciertoRepository conciertoRepository;

    @Override
    public List<concierto> getAllConcierto() {
        return(List<concierto>)conciertoRepository.findAll();
    }

    @Override
    public concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(concierto Concierto) {
        conciertoRepository.save(Concierto);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }
    
}
