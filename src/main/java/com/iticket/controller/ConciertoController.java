/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iticket.controller;



import com.iticket.entity.concierto;
import com.iticket.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author JerryCampos
 */

@Controller
public class ConciertoController {
    
    @Autowired //Agrega dependecnias externas
    private IConciertoService conciertoService;
    
    
    
    @GetMapping("/concierto") //Get mapping siempre nos va a devolver una pagina web
    public String index(Model model){
        List<concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("concierto", listaConcierto);
        return "concierto";
    }
    
    @GetMapping("/conciertoN") //Get mapping siempre nos va a devolver una pagina web
    public String crearPersona(Model model){
        List<concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("concierto", new concierto() );
        model.addAttribute("Conciertos", listaConcierto);
        return "/crear";
    }
    
    @PostMapping("/save") //Get mapping siempre nos va a devolver una pagina web
    public String guardarConcierto(@ModelAttribute concierto Concierto){
        conciertoService.saveConcierto(Concierto);
        return "redirect:/concierto";
    }
    
}
