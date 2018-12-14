package com.projetpoe.demo;

import com.projetpoe.demo.Model.Historique;
import com.projetpoe.demo.Model.Utilisateur;
import com.projetpoe.demo.Service.HistoriqueService;
import com.projetpoe.demo.Service.UtilisateurService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilisateurServiceTest {
    @Autowired
    private UtilisateurService utilisateurService;

    @Test(expected = Exception.class)
    public void testliaison() throws Exception {
        Utilisateur u = utilisateurService.recupereutilisateur(-5);

    }

}



