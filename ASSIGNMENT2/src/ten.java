import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the marks
        System.out.print("Input the marks obtained in Physics: ");
        int marksPhysics = scanner.nextInt();

        System.out.print("Input the marks obtained in Chemistry: ");
        int marksChemistry = scanner.nextInt();

        System.out.print("Input the marks obtained in Mathematics: ");
        int marksMaths = scanner.nextInt();

        // Input the total marks
        System.out.print("Total marks of Maths, Physics, and Chemistry: ");
        int totalMarksAllSubjects = scanner.nextInt();

        System.out.print("Total marks of Maths and Physics: ");
        int totalMarksMathsPhysics = scanner.nextInt();

        // Check eligibility
        if (marksMaths >= 65 && marksPhysics >= 55 && marksChemistry >= 50) {
            if (totalMarksAllSubjects >= 190 || totalMarksMathsPhysics >= 140) {
                System.out.println("The candidate is eligible for admission.");
            } else {
                System.out.println("The candidate is not eligible for admission.");
            }
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }

        scanner.close();
    }
}
