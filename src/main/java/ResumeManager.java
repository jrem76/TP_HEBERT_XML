package resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jérémy Notebook on 01/04/14.
 */
@XmlRootElement
public class ResumeManager {

    private List<Resume> listResume;

    public ResumeManager() {
        listResume = new LinkedList<Resume>();
    }

    public void add(Resume resume) {
        this.listResume.add(resume);
    }

    public void del(Resume resume) {
        this.listResume.remove(resume);
    }

    public List<Resume> getListResume() {
        return listResume;
    }

    public void setListResume(List<Resume> listResume) {
        this.listResume = listResume;
    }
}
