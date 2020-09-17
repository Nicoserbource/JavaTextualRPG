package rpg;

import java.util.Scanner;

public class RPG {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenue, aventurier ! Quel est votre nom ?");
		String nomJoueur = input.nextLine();
		Heros joueur = new Heros(nomJoueur, 5, 5, 1, 1, 1, 1, 0, 0);
		System.out.println("Niveau : "+joueur.niveau);
		joueur.afficherStats();
		System.out.println("Bienvenue, "+nomJoueur+" ! Vous pouvez commencer votre aventure.");
		input.nextLine();
		Monstre[] tableauMonstres = {
	   		new Monstre("loup", 5, 5, 1, 0, 2, 1),
	   		new Monstre("bandit", 5, 5, 1, 1, 1, 1),
	   		new Monstre("loup", 6, 6, 2, 0, 3, 1),
	   		new Monstre("bandit", 10, 10, 2, 2, 2, 1),
	   		new Monstre("loup", 7, 7, 3, 0, 4, 1),
	   		new Monstre("bandit", 15, 15, 3, 3, 3, 1)
		};
		for(Monstre monstre : tableauMonstres) {
			Combat.combattreAuto(joueur, monstre);
			input.nextLine();
		}
		System.out.println("Vous avez terminé le premier niveau.");
		input.close();
	}

}
