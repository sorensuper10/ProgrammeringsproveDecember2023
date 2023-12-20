import java.util.Scanner;

public class Opgave3 {

    public static void main(String[] args) {
        int tabel[] = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast 10 tal");

        for (int i = 0; i < 10; i++)
            tabel[i] = input.nextInt();

        int min = tabel[0];
        for (int i = 1; i < 10; i++) {
            if (tabel[i] < min)
                min = tabel[i];
        }
            int max = tabel[0];
            for (int j = 1; j < 10; j++) {
                if (tabel[j] > max)
                    max = tabel[j];
}
                int sum = 0;
                for (int k = 0; k < 10; k++)
                    sum += tabel[k];
                double snit = sum / 10.0;

                System.out.println("Det mindste tal er " + min);
                System.out.println("Det største tal er " + max);
                System.out.println("Gennemsnittet er " + snit);

            }
        }




