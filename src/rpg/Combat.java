package rpg;

public class Combat {
	
	protected Heros pj;
	protected Monstre ia;
	
	public static void combattreAuto(Heros pj, Monstre ia) {
		int degatsPj;
		int degatsIa;
		int attaquePj;
		int attaqueIa;
		pj.pointsVie = pj.pointsVieMax;
		ia.pointsVie = ia.pointsVieMax;
		System.out.println("Un "+ia.nom+" ennemi se trouve sur votre chemin.");
		if (pj.vitesse>=ia.vitesse) {
			while (pj.pointsVie>0 && ia.pointsVie>0) {
				System.out.println("Vous attaquez le " + ia.nom + " ennemi !");
				attaquePj = (int)(Math.random()*pj.attaque)+1;
				degatsPj = (attaquePj)-(ia.armure);
				if (degatsPj<=0) {
					degatsPj = 1;
				}
				ia.pointsVie -= degatsPj;
				System.out.println("Le "+ia.nom+" ennemi perd "+degatsPj+" points de vie, il lui reste "+ia.pointsVie+" points de vie.");
				if (ia.pointsVie<=0) {
					System.out.println("Vous avez vaincu le "+ia.nom+" ennemi !");
					pj.experience += (ia.niveau*20);
					pj.or += (int)(Math.random()*Math.pow((10+ia.niveau),2))+1;
					System.out.println("Vous disposez de "+pj.experience+" points d'expérience et de "+pj.or+" pièces d'or.");
					if (pj.experience >= (10*(int)Math.pow(2, pj.niveau))) {
						pj.pointsVieMax += 5;
						pj.attaque += 2;
						pj.armure++;
						pj.vitesse++;
						pj.niveau ++;
						System.out.println("Vous passez au niveau "+pj.niveau+" !");
						afficherStats(pj);
					}
					break;
				}
				System.out.println("Le " + ia.nom + " ennemi vous attaque !");
				attaqueIa = (int)(Math.random()*ia.attaque)+1;
				degatsIa = (attaqueIa)-(pj.armure);
				if (degatsIa<=0) {
					degatsIa = 1;
				}
				pj.pointsVie -= degatsIa;
				System.out.println("Vous perdez "+degatsIa+" points de vie, il vous reste "+pj.pointsVie+" points de vie.");
				if (pj.pointsVie<=0) {
					System.out.println("Vous avez été vaincu par le "+ia.nom+" ennemi !");
					break;
				}
			}
		}
		else if (pj.vitesse<ia.vitesse) {
			while(pj.pointsVie>0 && ia.pointsVie>0) {
				System.out.println("Le " + ia.nom + " ennemi vous attaque !");
				attaqueIa = (int)(Math.random()*ia.attaque)+1;
				degatsIa = (attaqueIa)-(pj.armure);
				if (degatsIa<=0) {
					degatsIa = 1;
				}
				pj.pointsVie -= degatsIa;
				System.out.println("Vous perdez "+degatsIa+" points de vie, il vous reste "+pj.pointsVie+" points de vie.");
				if (pj.pointsVie<=0) {
					System.out.println("Vous avez été vaincu par le "+ia.nom+" ennemi !");
					break;
				}
				System.out.println("Vous attaquez le " + ia.nom + " ennemi !");
				attaquePj = (int)(Math.random()*pj.attaque)+1;
				degatsPj = (attaquePj)-(ia.armure);
				if (degatsPj<=0) {
					degatsPj = 1;
				}
				ia.pointsVie -= degatsPj;
				System.out.println("Le "+ia.nom+" ennemi perd "+degatsPj+" points de vie, il lui reste "+ia.pointsVie+" points de vie.");
				if (ia.pointsVie<=0) {
					System.out.println("Vous avez vaincu le "+ia.nom+" ennemi !");
					pj.experience += (ia.niveau*20);
					pj.or += (int)(Math.random()*Math.pow((10+ia.niveau),2))+1;
					System.out.println("Vous disposez de "+pj.experience+" points d'expérience et de "+pj.or+" pièces d'or.");
					if (pj.experience >= (10*(int)Math.pow(2, pj.niveau))) {
						pj.pointsVieMax += 5;
						pj.attaque += 2;
						pj.armure++;
						pj.vitesse++;
						pj.niveau ++;
						System.out.println("Vous passez au niveau "+pj.niveau+" !");
						afficherStats(pj);
					}
					break;
				}
			}
		}
	}
	
	public static void combattreTourParTour(Heros pj, Monstre ia) {
		//TODO: implémenter une méthode de combat au tour par tour
	}
	
	public static void afficherStats(Heros pj) {
		System.out.println("Points de vie : "+pj.pointsVieMax);
		System.out.println("Points d'attaque : "+pj.attaque);
		System.out.println("Points d'armure : "+pj.armure);
		System.out.println("Points de vitesse : "+pj.vitesse);
	}

}
