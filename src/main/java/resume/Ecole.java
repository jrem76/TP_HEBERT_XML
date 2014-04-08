package resume;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
public class Ecole {
    private String nom;
    private String diplome;
    private String date;
    private String ville;

    public Ecole() {

    }

    public Ecole(String nom, String diplome, String date, String ville) {
        this.date = date;
        this.nom = nom;
        this.diplome = diplome;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }
    @XmlElement
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDiplome() {
        return diplome;
    }
    @XmlElement
    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getDate() {
        return date;
    }
    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getVille() {
        return ville;
    }
    @XmlElement
    public void setVille(String ville) {
        this.ville = ville;
    }
}
