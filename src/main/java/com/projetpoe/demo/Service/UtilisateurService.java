package com.projetpoe.demo.Service;

import com.projetpoe.demo.Model.Historique;
import com.projetpoe.demo.Model.Utilisateur;
import com.projetpoe.demo.Repository.repositoryHistorique;
import com.projetpoe.demo.Repository.repositoryUtilisateur;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

@Service

public class UtilisateurService{

// pour chaque joueur affiche score de chaque salle

    @Autowired
    private repositoryUtilisateur utilisateurrepository;
    @Autowired
    private repositoryHistorique historiquerepository;


    public void liaison(Integer id , Integer id_sauvegarde) throws Exception{
        if (utilisateurrepository.exists(id)){
            Utilisateur u = utilisateurrepository.findOne(id);

            if (historiquerepository.exists(id_sauvegarde)) {
                Historique h = historiquerepository.findOne(id_sauvegarde);
            }else{
                throw new Exception("pas d'historique score");
            }

        }else{
            throw new Exception("l'id n'existe pas!");
        }
    }

    public Utilisateur recupereutilisateur (Integer id){
        Utilisateur u = utilisateurrepository.findById(id);
        return u;
    }

}

