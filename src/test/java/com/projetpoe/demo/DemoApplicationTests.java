package com.projetpoe.demo;

import com.projetpoe.demo.Model.Utilisateur;
import com.projetpoe.demo.Model.Historique;
import com.projetpoe.demo.Model.Utilisateur;
import com.projetpoe.demo.Repository.repositoryUtilisateur;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private repositoryUtilisateur repositoryUtilisateur;

	@Test
	//public void testConnexionBdd() {
		/*Long id = repositoryUtilisateur.count();

		Assert.assertTrue((id > 0 ));
		*/
		/*Utilisateur u = repositoryUtilisateur.findOne(6);
		String h = u.getPseudo();
		Assert.assertTrue(h.equals("toto"));
		System.out.println(h);*/

		public void testGetHistorique(){
			Utilisateur u = repositoryUtilisateur.findOne(1); //récupérer utilisateur
            System.out.println(u);
			List<Historique> historiques = u.getHistoriques(); //donner historique de l'utilisateur
			for (Historique h : historiques) { //pour chaque historique de l'utilisateur
				Integer score = h.getScore(); //chercher les scores de l'historique
				System.out.println(score); //afficher les scores dans la console

			}
		}

	}
