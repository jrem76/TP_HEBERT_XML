package resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jérémy Notebook on 01/04/14.
 */
@XmlRootElement (name = "resume")
public class Resume {

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

    }

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

    public void setExperiences(Experiences experiences) {
        this.experiences = experiences;
    }

    public Langues getLangues() {
        return langues;
    }

    public void setLangues(Langues langues) {
        this.langues = langues;
    }

    public Competences_Info getCompetences_info() {
        return competences_info;
    }

    public void setCompetences_info(Competences_Info competences_info) {
        this.competences_info = competences_info;
    }

    public Scolarite getScolarite() {
        return scolarite;
    }

    public void setScolarite(Scolarite scolarite) {
        this.scolarite = scolarite;
    }

}
