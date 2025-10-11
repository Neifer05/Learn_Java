import java.util.Locale;
import java.util.Scanner;

public class spaceinvaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.ENGLISH);

        // Coordenadas y medidas del alien
        int Ax = sc.nextInt();
        int Ay = sc.nextInt();
        int Aw = sc.nextInt();
        int Ah = sc.nextInt();

        // Coordenadas y medidas del disparo
        int Dx = sc.nextInt();
        int Dy = sc.nextInt();
        int Dw = sc.nextInt();
        int Dh = sc.nextInt();

        boolean disparoAbajoAlien = (Dy + Dh <= Ay);
        boolean disparoIzqAlien = (Dx + Dw <= Ax);
        boolean disparoSobreAlien = (Dy >= Ay + Ah);
        boolean disparoDerechaAlien = (Dx >= Ax + Aw);

        boolean noSeTocan = !(disparoAbajoAlien || disparoIzqAlien || disparoSobreAlien || disparoDerechaAlien);

        System.out.print(noSeTocan);
    }
}
