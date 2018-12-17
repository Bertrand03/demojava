package com.projetpoe.demo.Repository;

import com.projetpoe.demo.Model.Utilisateur;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface repositoryUtilisateur extends PagingAndSortingRepository <Utilisateur, Integer>{

    Utilisateur findById(Integer idUtilisateur);
    //Utilisateur findByPseudo(String pseudo);


}
