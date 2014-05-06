package resume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
public class Competences_Info {
    private List<Competence> competences;

    public Competences_Info(List<Competence> competenceList) {
        this.competences = competenceList;
    }

    public Competences_Info() {
    	competences = new ArrayList<Competence>();
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competenceList) {
        this.competences = competenceList;
    }
    
    public void add(Competence c) {
    	competences.add(c);
    }

}
