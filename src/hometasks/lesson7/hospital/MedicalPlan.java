package hometasks.lesson7.hospital;
import java.util.Scanner;
public class MedicalPlan {
    public void setDoctor(Patient patient) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
            System.out.println("Please insert number 1, 2 or 3 to determine which doctor will be assigned for you: ");
            System.out.println("1 - Surgeon, 2 - Therapist, 3 - Dentist");

            if (number == 1){
                System.out.println("You inserted " + number + "Surgeon assigned");
        }
            else if (number == 2){
            System.out.println("You inserted " + number + "Therapist assigned");
        }
            else if (number == 3){
                System.out.println("You inserted " + number + "Dentist assigned");
            }
    }
}
