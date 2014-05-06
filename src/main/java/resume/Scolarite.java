package resume;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jérémy Notebook on 08/04/14.
 */
@XmlRootElement
public class Scolarite {
    private List<Ecole> listEcole;

    public Scolarite(List<Ecole> listEcole) {
        this.listEcole = listEcole;
    }
    public Scolarite() {
    	listEcole = new ArrayList<Ecole>();
    }

    public List<Ecole> getListEcole() {
        return listEcole;
    }

    public void setListEcole(List<Ecole> listEcole) {
        this.listEcole = listEcole;
    }
    
    public void add(Ecole e) {
    	listEcole.add(e);
    }
}
