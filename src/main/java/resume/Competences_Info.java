package resume;

import java.util.List;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
public class Competences_Info {
    private List<Competence> competenceList;

    public Competences_Info(List<Competence> competenceList) {
        this.competenceList = competenceList;
    }

    public Competences_Info() {
    }

    public List<Competence> getCompetenceList() {
        return competenceList;
    }

    public void setCompetenceList(List<Competence> competenceList) {
        this.competenceList = competenceList;
    }
}
