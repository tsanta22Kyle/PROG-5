package hei;

public class Table {
    private double longueur;
    private double largeur ;
    private String etat;
    private String couleur;
    public Table(double longueur, double largeur, String etat, String couleur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.etat = etat;
        this.couleur = couleur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getSurface(){
        return this.largeur * this.longueur;
    }
}
