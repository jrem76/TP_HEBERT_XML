package resume;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
@XmlRootElement
public class Langues {
    private List<Langue> langueList;

    public Langues(List<Langue> langueList) {
        this.langueList = langueList;
    }

    public Langues() {
		langueList = new ArrayList<Langue>();
	}

	public List<Langue> getLangueList() {
        return langueList;
    }

    public void setLangueList(List<Langue> langueList) {
        this.langueList = langueList;
    }
    public void add(Langue l) {
    	langueList.add(l);
    }
}
