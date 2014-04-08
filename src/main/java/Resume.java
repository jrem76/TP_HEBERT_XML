package resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jérémy Notebook on 01/04/14.
 */
@XmlRootElement (name = "resume")
public class Resume {

    private String lastName;
    private String firstName;

    public Resume(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Resume() {

    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


}
