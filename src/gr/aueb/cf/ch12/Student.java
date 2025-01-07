package gr.aueb.cf.ch12;

/**
 * POJO
 * Java Bean (private πεδία, default constructor, getters και setters -ή mutators kai accessors-με σύμβαση)
 */
public class Student {
    private static int studentsCount = 0; // μπορει να αρχικοποιηθεί και σε static block

    private int id;
    private String firstname;
    private String lastname;


//    default constructor αρχικοποιει σε ντιφολτ τιμεσ:
//    public Student(){
//        id=0;
//        firstname=null;
//        lastname=null;
//    }
    public Student() {
        studentsCount++;
    }

//    overloaded constructor
    public Student(int id, String firstname, String lastname){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        studentsCount++;
    }

    public static int getStudentsCount(){
        return studentsCount;
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
