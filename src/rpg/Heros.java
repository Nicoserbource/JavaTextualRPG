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
	
}
