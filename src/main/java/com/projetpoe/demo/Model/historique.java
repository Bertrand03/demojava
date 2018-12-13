package com.projetpoe.demo.Model;

import javax.persistence.*;

@Entity
    public class historique {

    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        private Integer id_sauvegarde;

        private String salle    ;

        private String score;

    public historique(Integer id_joueur, Integer id_sauvegarde, String salle, String score) {
        this.id_sauvegarde = id_sauvegarde;
        this.salle = salle;
        this.score = score;
    }


    public Integer getId_sauvegarde() {
        return id_sauvegarde;
    }

    public void setId_sauvegarde(Integer id_sauvegarde) {
        this.id_sauvegarde = id_sauvegarde;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @ManyToOne
    @JoinColumn( name = "id_joueur" )
    private utilisateur utilisateur;

    public com.projetpoe.demo.Model.utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(com.projetpoe.demo.Model.utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public historique(){

    }
}
