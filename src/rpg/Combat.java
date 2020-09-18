package rpg;

import java.util.Scanner;

public class Combat {
	
	protected Heros pj;
	protected Monstre ia;
	
	public static void combattreAuto(Heros pj, Monstre ia) {
		pj.pointsVie = pj.pointsVieMax;
		ia.pointsVie = ia.pointsVieMax;
		while(pj.pointsVie>0 && ia.pointsVie>0) {
			if (pj.vitesse>=ia.vitesse) {
				pj.attaquerMonstre(ia);
				if (ia.pointsVie<=0) {
					System.out.println("Vous avez vaincu le "+ia.nom+" ennemi !");
					pj.experience += (ia.niveau*20);
					pj.or += (int)(Math.random()*Math.pow((10+ia.niveau),2))+1;
					System.out.println("Vous disposez de "+pj.experience+" points d'expérience et de "+pj.or+" pièces d'or.");
					if (pj.experience >= (10*(int)Math.pow(2, pj.niveau))) {
						pj.monterNiveau();
					}
					break;
				}
				ia.attaquerHeros(pj);
				if (pj.pointsVie<=0) {
					System.out.println("Vous avez été vaincu par le "+ia.nom+" ennemi !");
					break;
				}
			} else if (pj.vitesse<ia.vitesse) {
				ia.attaquerHeros(pj);
				if (pj.pointsVie<=0) {
					System.out.println("Vous avez été vaincu par le "+ia.nom+" ennemi !");
					break;
				}
				pj.attaquerMonstre(ia);
				if (ia.pointsVie<=0) {
					System.out.println("Vous avez vaincu le "+ia.nom+" ennemi !");
					pj.experience += (ia.niveau*20);
					pj.or += (int)(Math.random()*Math.pow((10+ia.niveau),2))+1;
					System.out.println("Vous disposez de "+pj.experience+" points d'expérience et de "+pj.or+" pièces d'or.");
					if (pj.experience >= (10*(int)Math.pow(2, pj.niveau))) {
						pj.monterNiveau();
					}
					break;
				}
			}
		}
	}
	
	public static void combattreManuel(Heros pj, Monstre ia, Scanner input) {
		pj.pointsVie = pj.pointsVieMax;
		ia.pointsVie = ia.pointsVieMax;
		while (pj.pointsVie>0 && ia.pointsVie>0) {
			if (pj.vitesse>=ia.vitesse) {
				System.out.println("| A : attaquer ||F : fuir |");
				switch(input.nextLine()) {
				case "A" :
					pj.attaquerMonstre(ia);
					if (ia.pointsVie<=0) {
						System.out.println("Vous avez vaincu le "+ia.nom+" ennemi !");
						pj.experience += (ia.niveau*20);
						pj.or += (int)(Math.random()*Math.pow((10+ia.niveau),2))+1;
						System.out.println("Vous disposez de "+pj.experience+" points d'expérience et de "+pj.or+" pièces d'or.");
						if (pj.experience >= (10*(int)Math.pow(2, pj.niveau))) {
							pj.monterNiveau();
						}
						break;
					}
					ia.attaquerHeros(pj);
					if (pj.pointsVie<=0) {
						System.out.println("Vous avez été vaincu par le "+ia.nom+" ennemi !");
						break;
					}
					continue;
				case "F" :
					System.out.println("Vous fuyez le combat !");
					break;
				default :
					System.out.println("| A : attaquer || F : fuir |");
					continue;
				}
			}
			else if (pj.vitesse<ia.vitesse) {
				ia.attaquerHeros(pj);
				if (pj.pointsVie<=0) {
					System.out.println("Vous avez été vaincu par le "+ia.nom+" ennemi !");
					break;
				}
				System.out.println("| A : attaquer || F : fuir |");
				switch(input.nextLine()) {
				case "A" :
					pj.attaquerMonstre(ia);
					if (ia.pointsVie<=0) {
						System.out.println("Vous avez vaincu le "+ia.nom+" ennemi !");
						pj.experience += (ia.niveau*20);
						pj.or += (int)(Math.random()*Math.pow((10+ia.niveau),2))+1;
						System.out.println("Vous disposez de "+pj.experience+" points d'expérience et de "+pj.or+" pièces d'or.");
						if (pj.experience >= (10*(int)Math.pow(2, pj.niveau))) {
							pj.monterNiveau();
						}
						break;
					}
					continue;
				case "F" :
					System.out.println("Vous fuyez le combat !");
					break;
				default : System.out.println("| A : attaquer || F : fuir |");
					continue;
				}
			}
		}
	}

}
