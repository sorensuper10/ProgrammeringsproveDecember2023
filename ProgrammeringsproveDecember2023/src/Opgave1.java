import java.util.Scanner;

public class Opgave1 {

    public static void main(String[] args) {
        // Opgave 1
        int tabel[] = new int[8];

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast 8 tal");

        for (int i = 0; i < 8; i++)
            tabel[i] = input.nextInt();

        int sum = 0;
        for (int i =0; i<8; i++)
            sum += tabel[i];

        double snit = sum/8.0;
        System.out.println("Gennemsnittet er " +snit);
    }
}


