package resume;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
public class Langue {
    private String nom;
    private String niveau;

    public Langue(String nom, String niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    @XmlElement
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    @XmlElement
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
