import java.util.Scanner;

public class es2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prima stringa: ");
        String primaStringa = scanner.nextLine();

        System.out.println("Seconda stringa: ");
        String secondaStringa = scanner.nextLine();

        System.out.println("Terza stringa: ");
        String terzaStringa = scanner.nextLine();

        System.out.println(primaStringa + " " + secondaStringa + " " + terzaStringa);
        System.out.println(terzaStringa + " " + secondaStringa + " " + primaStringa);
    }
}
