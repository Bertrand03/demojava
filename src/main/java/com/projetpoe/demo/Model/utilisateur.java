package com.projetpoe.demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
    public class utilisateur {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String pseudo;

        private String password;

        public utilisateur(Integer id, String pseudo, String password) {
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

        @OneToMany( mappedBy = "utilisateur" )
        private List<historique> historiques;

    public List<historique> getHistoriques() {
        return historiques;
    }


    public utilisateur(){

    }
}

