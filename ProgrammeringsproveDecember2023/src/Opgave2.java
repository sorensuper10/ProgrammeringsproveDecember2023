import java.util.Scanner;

public class Opgave2 {
    public static void main(String[] args) {
        // Opgave 2
        int tabel[] = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast 10 tal");

        for (int i = 0; i < 10; i++)
            tabel[i] = input.nextInt();

        int min = tabel[0];
        for (int i = 1; i < 10; i++) {
            if (tabel[i] <   min)
                min = tabel[i];
        }
        System.out.println("Det mindste tal er " + min);
    }
}
