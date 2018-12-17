package com.projetpoe.demo.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
    public class Historique {

    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        private Integer id_sauvegarde;

        private String salle    ;

        private Integer score;

    public Historique(Integer id_joueur, Integer id_sauvegarde, String salle, Integer score) {
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    /*@ManyToOne
    @JoinColumn( name = "id_joueur" )
    private Utilisateur utilisateur;

    public com.projetpoe.demo.Model.Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(com.projetpoe.demo.Model.Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    */

    @ManyToOne //Fin de la relation entre plusieurs historiques et un utilisateur
    @JoinColumn( name = "id_joueur") //Déclaration de la colonne servant de clé étrangère
    @JsonBackReference
    private Utilisateur utilisateur; //Déclaration de la table de début de relation

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Historique(){

    }
}
