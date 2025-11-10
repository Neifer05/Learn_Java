import java.util.Locale;
import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.ENGLISH);

        int ancho = sc.nextInt();
        int altura = sc.nextInt();
        int obtenerCuadrados = sc.nextInt();

        if (obtenerCuadrados % ancho == 0 && obtenerCuadrados < (ancho * altura) || obtenerCuadrados % altura == 0 && obtenerCuadrados < (ancho * altura)) {
            System.out.print("SI");
        } else {
            System.out.print("NO");
        }

    }
}

// obtenerCuadrados % ancho == 0: si el ancho es 4 y quieres 8 cuadritos, 8 % 4 == 0 → se pueden hacer 2 filas completas (4 * 2 = 8).
