
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] grades = new double[n];
        double sum = 0;

        for(int i=0; i<n; i++){
            System.out.print("Student name: ");
            names[i] = sc.nextLine();
            System.out.print("Grade: ");
            grades[i] = sc.nextDouble();
            sc.nextLine();
            sum += grades[i];
        }

        System.out.println("\n=== Student Report ===");
        for(int i=0; i<n; i++){
            System.out.println(names[i] + " - " + grades[i]);
        }

        System.out.printf("Average: %.2f%n", sum / n);
        sc.close();
    }
}
