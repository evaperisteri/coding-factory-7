package gr.aueb.cf.ch19;

public class Main {
    public static void main(String[] args) {
        NodeObj nodeObj = new NodeObj();
        nodeObj.setItem("Coding");

        int item = (int) nodeObj.getItem();
        //ClassCastException --runtime exception, προτου τρεξει δεν αναγνωριζει οτι το cast ειναι αδύνατο
        System.out.println(item);
    }
}
