package com.projetpoe.demo.Repository;

import com.projetpoe.demo.Model.utilisateur;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface repositoryUtilisateur extends PagingAndSortingRepository <utilisateur, Integer>{

    utilisateur findById(String s);
    utilisateur findByNom(String pseudo);
}
