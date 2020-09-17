package rpg;

public class Heros extends Personnage {
	
	protected int experience;
	protected int or;

	public Heros(String tmpNom, int tmpPointsVieMax, int tmpPointsVie, int tmpAttaque, int tmpArmure, int tmpVitesse, int tmpNiveau, int tmpExperience, int tmpOr) {
		super(tmpNom, tmpPointsVieMax, tmpPointsVie, tmpAttaque, tmpArmure, tmpVitesse, tmpNiveau);
		nom = tmpNom;
		pointsVieMax = tmpPointsVieMax;
		pointsVie = tmpPointsVie;
		attaque = tmpAttaque;
		armure = tmpArmure;
		vitesse = tmpVitesse;
		niveau = tmpNiveau;
		experience = tmpExperience;
		or = tmpOr;
	}
	
	public void attaquerMonstre(Monstre ia) {
		System.out.println("Vous attaquez le " + ia.nom + " ennemi !");
		int attaquePj = (int)(Math.random()*this.attaque)+1;
		int degatsPj = (attaquePj)-(ia.armure);
		if (degatsPj<=0) {
			degatsPj = 1;
		}
		ia.pointsVie -= degatsPj;
		if(ia.pointsVie < 0) {
			System.out.println("Le "+ia.nom+" ennemi perd "+degatsPj+" points de vie, il lui reste 0 points de vie.");
		} else System.out.println("Le "+ia.nom+" ennemi perd "+degatsPj+" points de vie, il lui reste "+ia.pointsVie+" points de vie.");
	}
	
	public void monterNiveau() {
		this.pointsVieMax += 5;
		this.attaque++;
		this.armure++;
		this.vitesse++;
		this.niveau++;
		System.out.println("Vous passez au niveau "+this.niveau+" !");
		this.afficherStats();
	}
	
	public void afficherStats() {
		System.out.println("Points de vie : "+this.pointsVieMax);
		System.out.println("Points d'attaque : "+this.attaque);
		System.out.println("Points d'armure : "+this.armure);
		System.out.println("Points de vitesse : "+this.vitesse);
	}
	
}
