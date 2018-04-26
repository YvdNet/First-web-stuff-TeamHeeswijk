package Beans;

public class User {
    private String email;
    private String firstname;
    private String lastname; 
    private String age;
    private String activiteit;
   

    public User() {
    }

    public User(String email, String firstname, String lastname, String age, String activiteit) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.activiteit = activiteit;
    }

    public User(String parameter, String parameter0, String parameter1, String parameter2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  //  * @return the email
    
    public String getEmail() {
        return email;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }
    public String getAge() {
        return age;
    }
    public String getActiviteit(){
        return activiteit;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setActiviteit(String activiteit){
        this.activiteit = activiteit;
    }
    
    
}
