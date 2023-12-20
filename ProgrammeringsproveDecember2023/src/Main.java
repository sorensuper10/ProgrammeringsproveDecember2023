import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // En anden måde at lave opgave 1 på
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast 8 tal");
        double tal = input.nextInt();
        double tal1 = input.nextInt();
        double tal2 = input.nextInt();
        double tal3 = input.nextInt();
        double tal4 = input.nextInt();
        double tal5 = input.nextInt();
        double tal6 = input.nextInt();
        double tal7 = input.nextInt();
        System.out.println((tal + tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7) / 8);
    }
}
