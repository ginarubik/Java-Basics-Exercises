import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        // Scanner létrehozása
        Scanner scanner = new Scanner(System.in);

        // Felhasználó születési évének bekérése
        System.out.print("Add meg a születési éved: ");
        int birthYear = scanner.nextInt();

        // Jelenlegi év változó
        int thisYear = 2025; // aktuális év

        // Életkor kiszámítása
        int age = thisYear - birthYear;

        // Eredmény kiírása
        System.out.println("A korod: " + age + " év.");

        // Scanner bezárása
        scanner.close();
    }
}
