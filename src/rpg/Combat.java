package rpg;

public class Combat {
	
	protected Heros pj;
	protected Monstre ia;
	
	public static void combattreAuto(Heros pj, Monstre ia) {
		pj.pointsVie = pj.pointsVieMax;
		ia.pointsVie = ia.pointsVieMax;
		System.out.println("Un "+ia.nom+" ennemi se trouve sur votre chemin.");
		if (pj.vitesse>=ia.vitesse) {
			while (pj.pointsVie>0 && ia.pointsVie>0) {
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
			}
		}
		else if (pj.vitesse<ia.vitesse) {
			while(pj.pointsVie>0 && ia.pointsVie>0) {
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
	
	public static void combattreTourParTour(Heros pj, Monstre ia) {
		//TODO: implémenter une méthode de combat au tour par tour
	}

}
