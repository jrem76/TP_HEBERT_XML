package resume;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jérémy Notebook on 01/04/14.
 */
@Controller
@RequestMapping("/resume")
public class XMLController {
    private static ResumeManager rm = new ResumeManager();

    {
        Resume resume = new Resume();
        resume.setFirstName("Jérémy");
        resume.setLastName("Hébert");
        List<Competence> list = new ArrayList<Competence>();
        list.add(new Competence("java", "bonne"));
        list.add(new Competence("php", "bonne"));
        list.add(new Competence("pouet", "bonne"));
        resume.setCompetences_info(new Competences_Info(list));
        List<Entreprise> listExp = new ArrayList<Entreprise>();
        listExp.add(new Entreprise("Ectaris", "2012", "analyste programmeur"));
        listExp.add(new Entreprise("Renault", "2013", "analyste programmeur"));
        resume.setExperiences(new Experiences(listExp));

        List<Langue> langues = new ArrayList<Langue>();
        langues.add(new Langue("anglais", "bon"));
        resume.setLangues(new Langues(langues));

        List<Ecole> ecoles = new ArrayList<Ecole>();
        ecoles.add(new Ecole("Lycée Coubertin", "Bac", "Bolbec", "2010"));
        resume.setScolarite(new Scolarite(ecoles));

        rm.add(resume);
    }
    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody Resume getResumeInXML(@PathVariable int index) {
       return rm.get(index);
    }


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ResumeManager getResumeInXML() {

        return rm;
    }

    @RequestMapping(method=RequestMethod.PUT)
    public @ResponseBody ResumeManager add(@PathVariable Resume resume) {
        rm.add(resume);
        return rm;
    }
}
