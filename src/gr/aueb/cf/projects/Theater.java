package gr.aueb.cf.projects;

public class Theater {

    private boolean[][] seats = new boolean[30][12];

    public Theater() {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                seats[i][j] = false;
            }
        }
    }

    public void book(char column, int row) {

    }

    public void cancel(char column, int row) {

    }

    public void showSeats() {
        System.out.println("Κατάσταση θέσεων:");
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                if (seats[i][j]) {
                    System.out.print("X\t");
                } else {
                    System.out.print("O\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
