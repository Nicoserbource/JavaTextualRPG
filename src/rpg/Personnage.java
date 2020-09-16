package rpg;

public class Personnage {
	
	protected String nom;
	protected int pointsVieMax;
	protected int pointsVie;
	protected int attaque;
	protected int armure;
	protected int vitesse;
	protected int niveau;
	
	public Personnage(String tmpNom, int tmpPointsVieMax, int tmpPointsVie, int tmpAttaque, int tmpArmure, int tmpVitesse, int tmpNiveau) {
		nom = tmpNom;
		pointsVieMax = tmpPointsVieMax;
		pointsVie = tmpPointsVie;
		attaque = tmpAttaque;
		armure = tmpArmure;
		vitesse = tmpVitesse;
		niveau = tmpNiveau;
	}
	
}
