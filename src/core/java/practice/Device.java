package core.java.practice;

public class Device {
    public String name = null ;
    public String email = null ;
    public int webex_id ;
    public Device()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getWebexID() {
        return webex_id;
    }

    public void setWebex_id(int webex_id) {
        this.webex_id = webex_id;
    }
    // method to get communication details via email
    public void setCommunicationDetails(String name , String email)
    {
        this.email= email;
        this.name = name;

    }

    // method to communicate via whatsapp
    public void setCommunicationDetails(String name , int webex_id)
    {
        this.webex_id= webex_id;
        this.name = name;

    }

}
