package resume;

import java.util.List;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
public class Langues {
    private List<Langue> langueList;

    public Langues(List<Langue> langueList) {
        this.langueList = langueList;
    }

    public List<Langue> getLangueList() {
        return langueList;
    }

    public void setLangueList(List<Langue> langueList) {
        this.langueList = langueList;
    }
}
