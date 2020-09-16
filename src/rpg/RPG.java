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
		Combat.afficherStats(joueur);
		System.out.println("Bienvenue, "+nomJoueur+" ! Vous pouvez commencer votre aventure.");
		input.nextLine();
		Monstre loupFaible = new Monstre("loup", 4, 4, 1, 0, 2, 1);
		Combat.combattre(joueur, loupFaible);
		input.nextLine();
		Monstre banditFaible = new Monstre("bandit", 5, 5, 1, 1, 1, 1);
		Combat.combattre(joueur, banditFaible);
		input.nextLine();
		Monstre loupMoyen = new Monstre("loup", 6, 6, 2, 1, 4, 2);
		Combat.combattre(joueur, loupMoyen);
		input.nextLine();
		Monstre banditMoyen = new Monstre("bandit", 10, 10, 3, 2, 2, 2);
		Combat.combattre(joueur, banditMoyen);
		input.nextLine();
		Monstre loupFort = new Monstre("loup", 8, 8, 3, 2, 6, 3);
		Combat.combattre(joueur, loupFort);
		input.nextLine();
		Monstre banditFort = new Monstre("bandit", 15, 15, 5, 3, 3, 3);
		Combat.combattre(joueur, banditFort);
		input.nextLine();
		System.out.println("Vous avez terminé le premier niveau.");
		input.close();
	}

}
