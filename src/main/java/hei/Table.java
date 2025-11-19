package hei;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor@EqualsAndHashCode
public class Table {
    private double longueur;
    private double largeur ;
    private String etat;
    private String couleur;

    public double getSurface(){
        return this.largeur * this.longueur;
    }

}
