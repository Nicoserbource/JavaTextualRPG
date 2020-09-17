package rpg;

public class Monstre extends Personnage {
	
	public Monstre(String tmpNom, int tmpPointsVieMax, int tmpPointsVie, int tmpAttaque, int tmpArmure, int tmpVitesse, int tmpNiveau) {
		super(tmpNom, tmpPointsVieMax, tmpPointsVie, tmpAttaque, tmpArmure, tmpVitesse, tmpNiveau);
		nom = tmpNom;
		pointsVieMax = tmpPointsVieMax;
		pointsVie = tmpPointsVie;
		attaque = tmpAttaque;
		armure = tmpArmure;
		vitesse = tmpVitesse;
		niveau = tmpNiveau;
	}
	
	public void attaquerHeros(Heros pj) {
		System.out.println("Le " + this.nom + " ennemi vous attaque !");
		int attaqueIa = (int)(Math.random()*this.attaque)+1;
		int degatsIa = (attaqueIa)-(pj.armure);
		if (degatsIa<=0) {
			degatsIa = 1;
		}
		pj.pointsVie -= degatsIa;
		System.out.println("Vous perdez "+degatsIa+" points de vie, il vous reste "+pj.pointsVie+" points de vie.");
	}
	
}
