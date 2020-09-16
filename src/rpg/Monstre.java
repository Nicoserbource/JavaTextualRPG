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
}
