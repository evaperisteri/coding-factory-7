package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student(); //invoke default constructor
        Student bob = new Student(2, "Bob", "D." );// inject τιμές στο instance απο τον overloaded constructor

        //set & get σε περιπτωσεις public στιγμιότυπων με την τελεία
        student.setId(1);               //        student.id = 1;
        student.setFirstname("Alice");  //        student.firstname= "Alice";
        student.setLastname("W.");      //        student.lastname="W.";

        //        System.out.println("Id: " + student.id);
        //        System.out.println("Firstname: " + student.firstname);
        //        System.out.println("Lastname: " + student.lastname);
        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());


        System.out.println("Student's instances count: " + Student.getStudentsCount());
    }
}
