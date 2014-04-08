package resume;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jérémy Notebook on 01/04/14.
 */
@Controller
@RequestMapping("/resume")
public class XMLController {
    @RequestMapping(value="{lastName}", method = RequestMethod.GET)
    public @ResponseBody Resume getResumeInXML(@PathVariable String lastName) {
        Resume resume = new Resume(lastName, "");
        return resume;
    }
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ResumeManager getResumeInXML() {
        Resume resume = new Resume("Jeremy", "Hebert");
        ResumeManager rm = new ResumeManager();
        rm.add(new Resume("Jeremy", "Hebert"));
        rm.add(new Resume("Jeremy", "Hebert"));
        rm.add(new Resume("Jeremy", "Hebert"));
        rm.add(new Resume("Jeremy", "Hebert"));
        return rm;
    }
}
