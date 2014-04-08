package resume;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
public class Entreprise {
    private String nom;
    private String date;
    private String poste;

    public Entreprise() {

    }

    public Entreprise(String nom, String date, String poste) {
        this.nom = nom;
        this.date = date;
        this.poste = poste;
    }

    public String getNom() {
        return nom;
    }
    @XmlElement
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }
    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getPoste() {
        return poste;
    }
    @XmlElement
    public void setPoste(String poste) {
        this.poste = poste;
    }
}
