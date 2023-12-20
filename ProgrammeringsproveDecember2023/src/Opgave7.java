import java.util.ArrayList;

public class Opgave7 {
    public static void main(String[] args) {
        Servicemedarbejder s1 = new Servicemedarbejder(1,"Søren","Hansen","Æblevej 2", "18-12-2023","1","Elektriker",100);

        Admmedarbejder a1 = new Admmedarbejder(2,"Morten","Jensen","Melonvej 4", "19-12-2023","2","Bogholder","50",150);

        Leder l1 = new Leder(3,"Anders","Andersen","Blommevej 8","20-12-2023","3",1,200);

        ArrayList <Ansat> a = new ArrayList<Ansat>();
        a.add(s1);
        a.add(a1);
        a.add(l1);

        udskrivAnsatte(a);

    }

    public static void udskrivAnsatte(ArrayList <Ansat> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
