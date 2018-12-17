package com.projetpoe.demo.Service;

import com.projetpoe.demo.Model.Historique;
import com.projetpoe.demo.Model.Utilisateur;
import com.projetpoe.demo.Repository.repositoryHistorique;
import com.projetpoe.demo.Repository.repositoryUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class HistoriqueService {

// pour chaque joueur affiche score de chaque salle

    @Autowired
    private repositoryUtilisateur utilisateurrepository;
    @Autowired
    private repositoryHistorique historiquerepository;


    public void liaison(Integer id , Integer id_sauvegarde) throws Exception{
        if (historiquerepository.exists(id)){
            Historique h = historiquerepository.findOne(id);

            if (historiquerepository.exists(id_sauvegarde)) {
                 h = historiquerepository.findOne(id_sauvegarde);
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