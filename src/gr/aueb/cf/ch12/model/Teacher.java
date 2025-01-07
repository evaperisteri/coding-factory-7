package gr.aueb.cf.ch12.model;

/**
 * POJO - java Bean
 */
public class Teacher {
    private int id;
    private String firstname;
    private String lastname;

    public Teacher() {

    }

    public Teacher(String lastname, String firstname, int id) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
