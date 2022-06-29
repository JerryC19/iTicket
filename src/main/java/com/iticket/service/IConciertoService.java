/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iticket.service;

import com.iticket.entity.concierto;
import java.util.List;

/**
 *
 * @author JerryCampos
 */
public interface IConciertoService {
    public List<concierto>getAllConcierto();
    public concierto getConciertoById(long id);
    public void saveConcierto(concierto Concierto);
    public void delete(long id);
}
