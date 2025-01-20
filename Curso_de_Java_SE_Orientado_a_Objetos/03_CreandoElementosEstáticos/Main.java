import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahí Salgado");
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();



        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();

        showMenu();

    }

}
