import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        bus b1 = new bus(200, "AA 20202", 40, 4);
        lastbil l1 = new lastbil(500, "AB 19191", 500, 6700);
        personvogn p1 = new personvogn(100, "BB 92929", 200, 150, "V8");

        /*b1.udskriv();
        l1.udskriv();
        p1.udskriv();*/

        ArrayList<koeretoej> tabel = new ArrayList<>();
        tabel.add(b1);
        tabel.add(l1);
        tabel.add(p1);

        for (int i = 0; i < tabel.size(); i++) {
            tabel.get(i).udskriv();
        }
    }
}

