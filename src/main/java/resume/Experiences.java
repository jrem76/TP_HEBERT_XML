package resume;

import java.util.List;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
public class Experiences {
    private List<Entreprise> listExp;

    public Experiences(List<Entreprise> listExp) {
        this.listExp = listExp;
    }

    public Experiences() {
    }

    public List<Entreprise> getListExp() {
        return listExp;
    }

    public void setListExp(List<Entreprise> listExp) {
        this.listExp = listExp;
    }
}
