package com.projetpoe.demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
    public class Utilisateur {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String pseudo;

        private String password;

        public Utilisateur(Integer id, String pseudo, String password) {
            this.id = id;
            this.pseudo = pseudo;
            this.password = password;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPseudo() {
            return pseudo;
        }

        public void setPseudo(String pseudo) {
            this.pseudo = pseudo;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        /*@OneToMany( mappedBy = "Utilisateur" )
        private List<Historique> historiques;

    public List<Historique> getHistoriques() {
        return historiques;
    }*/

    @OneToMany (mappedBy = "utilisateur", fetch = FetchType.EAGER) //Declaration de relation entre un utilisateur et plusieurs historiques
    private List <Historique> historiques; //déclaration de la liste d'historiques liés à l'utilisateur

    public List<Historique> getHistoriques() {
        return historiques;
    }

    public void setHistoriques(List<Historique> historiques) {
        this.historiques = historiques;
    }


    public Utilisateur(){

    }
}

