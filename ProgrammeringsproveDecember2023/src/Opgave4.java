import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opgave4 {

    public static void main(String[] args) {
        int antal = 10;
        int[] a = new int[10];
        IndlaesFraFil(a, antal);
        Udskriv(a, antal);
        System.out.println(max(a,antal));
        System.out.println(min(a,antal));
        System.out.println(gennemsnit(a, antal));

    }

    static void IndlaesFraFil(int[] tabel, int antal) {
        try {
            File myObj = new File("talfil.txt");
            Scanner in = new Scanner(myObj);

            for (int i = 0; i < 10; i++)
                tabel[i] = in.nextInt();
            in.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    static void Udskriv(int[] tabel, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.format("%d ", tabel[i]);
        System.out.println("");
    }

    public static double max(int[] a, int max) {
        for (int i = 1; i < 10; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static double min(int[] a, int min) {
        for (int i = 0; i < 10; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }

    public static double gennemsnit(int [] a, int antal) {
        double sum = 0;
        for (int i = 0; i < antal; i++)
            sum += a[i];
        return sum / 10.0;
    }

}
