package resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Jérémy Notebook on 01/04/14.
 */
@XmlRootElement (name = "resume")
@XmlType(propOrder = {"id", "firstName","lastName", "competences_info", "scolarite", "experiences", "langues"})
public class Resume {

    private int id;
    private String objectif;
    private String lastName;
    private String firstName;
    private Experiences experiences;
    private Langues langues;



    private Competences_Info competences_info;
    private Scolarite scolarite;



    public Resume(String objectif, String lastName, String firstName, Experiences experiences, Langues langues, Competences_Info competences_info, Scolarite scolarite) {
        this.objectif = objectif;
        this.lastName = lastName;
        this.firstName = firstName;
        this.experiences = experiences;
        this.langues = langues;
        this.competences_info = competences_info;
        this.scolarite = scolarite;
    }

    public Resume() {
        this.objectif = "";
        this.lastName = "";
        this.firstName = "";
        this.experiences = new Experiences();
        this.langues = new Langues();
        this.competences_info = new Competences_Info();
        this.scolarite = new Scolarite();
    }

    public int getId() { return id; }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Experiences getExperiences() {
        return experiences;
    }

    @XmlElement
    public void setExperiences(Experiences experiences) {
        this.experiences = experiences;
    }

    public Langues getLangues() {
        return langues;
    }

    @XmlElement
    public void setLangues(Langues langues) {
        this.langues = langues;
    }

    public Competences_Info getCompetences_info() {
        return competences_info;
    }

    @XmlElement
    public void setCompetences_info(Competences_Info competences_info) {
        this.competences_info = competences_info;
    }

    public Scolarite getScolarite() {
        return scolarite;
    }

    @XmlElement
    public void setScolarite(Scolarite scolarite) {
        this.scolarite = scolarite;
    }
    @XmlElement
    public void setId(int id) {     this.id = id;   }

}
