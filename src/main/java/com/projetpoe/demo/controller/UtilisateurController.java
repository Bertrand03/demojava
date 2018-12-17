package com.projetpoe.demo.controller;


import com.projetpoe.demo.Model.Utilisateur;
import com.projetpoe.demo.Service.HistoriqueService;
import com.projetpoe.demo.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;
    @Autowired
    private HistoriqueService historiqueService;

    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public Utilisateur utilisateur(@RequestParam(value="id") Integer idUtilisateur) throws Exception{
        return utilisateurService.recupereutilisateur(idUtilisateur);
    }

}
