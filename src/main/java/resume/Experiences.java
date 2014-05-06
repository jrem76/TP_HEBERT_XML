package resume;


import java.util.ArrayList;
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
    	listExp = new ArrayList<Entreprise>();
    }

    public List<Entreprise> getListExp() {
        return listExp;
    }

    public void setListExp(List<Entreprise> listExp) {
        this.listExp = listExp;
    }

	public void add(Entreprise entreprise) {
		listExp.add(entreprise);
		
	}
}
